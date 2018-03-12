package sms.sh.com.wavetest;

/**
 * Created by Administrator on 2018\3\8 0008.
 */

interface IBaseDao<T> {
    Long insert(T entriy);
}
