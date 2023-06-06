package com.mtopgul.springmongodbdoc.model;

import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;

import java.util.Iterator;

/**
 * @author muhammed-topgul
 * @since 06/06/2023 10:11
 */
@RequiredArgsConstructor(staticName = "of")
public class UserStreamable implements Streamable<UserModel> {
    private final Streamable<UserModel> streamable;

    public double getPrice() {
        return streamable.stream()
                .map(UserModel::getPrice)
                .reduce((double) 0, Double::sum);
    }

    @Override
    public Iterator<UserModel> iterator() {
        return streamable.iterator();
    }
}
