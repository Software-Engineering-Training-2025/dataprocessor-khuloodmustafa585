package org.example.dataprocessor.enums;
public enum AnalysisType {


    /** Arithmetic average; empty -> NaN */
    MEAN,

    /** Median; even -> average of two middles; empty -> NaN */
    MEDIAN,

    /** Population standard deviation (divide by N); empty -> NaN */
    STD_DEV,

    /** 90th percentile by nearest-rank: rank = ceil(0.90 * N) on sorted asc (1-based); empty -> NaN */
    P90_NEAREST_RANK,

    /** Sum of top-3 frequency counts (order by count desc, tiebreak by value asc); empty -> 0.0 */
    TOP3_FREQUENT_COUNT_SUM
}
