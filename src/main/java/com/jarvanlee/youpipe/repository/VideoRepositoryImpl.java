package com.jarvanlee.youpipe.repository;

import com.jarvanlee.youpipe.entity.Video;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class VideoRepositoryImpl implements VideoRepository{
    @Override
    public <S extends Video> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Video> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Video> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Video> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Video> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Video> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Video> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Video> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Video, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Video> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Video> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Video> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Video> findAll() {
        return null;
    }

    @Override
    public List<Video> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Video entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Video> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Video> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Video> findAll(Pageable pageable) {
        return null;
    }
}
