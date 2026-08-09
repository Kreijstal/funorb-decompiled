/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int[] field_d;
    private ci field_f;
    static String[] field_b;
    private ci field_c;
    private fl field_a;
    private fl field_e;

    private final hb b(int param0, int param1, int[] param2, int param3) {
        hb stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        hb stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        hb var8 = null;
        ml var9 = null;
        try {
          L0: {
            var5_int = (param1 << 182970116 & 65529 | param1 >>> 79289964) ^ param0;
            var5_int = var5_int | param1 << 223475056;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (hb) ((Object) this.field_e.a(var6, 0));
            if (var8 != null) {
              stackIn_3_0 = (hb) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (-1 > (param2[0] ^ -1)) {
                    break L1;
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                var9 = (ml) ((Object) this.field_a.a(var6, param3 + -79289964));
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = ml.a(this.field_f, param1, param0);
                  if (var9 != null) {
                    this.field_a.a(var6, (byte) -100, var9);
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param2);
              if (var8 != null) {
                L3: {
                  if (param3 == 79289964) {
                    break L3;
                  } else {
                    field_b = (String[]) null;
                    break L3;
                  }
                }
                var9.c(5);
                this.field_e.a(var6, (byte) 74, var8);
                stackIn_19_0 = (hb) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("bl.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hb) ((Object) stackIn_7_0);
          } else {
            return stackIn_19_0;
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 858) {
            return;
        }
        ec.a("", param0 ^ 815, (String) null);
    }

    final hb a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        hb stackIn_2_0 = null;
        hb stackIn_5_0 = null;
        hb stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (1 != this.field_f.a(117)) {
              if (param0 == 1673501264) {
                if ((this.field_f.a(param1, (byte) 121) ^ -1) != -2) {
                  throw new RuntimeException();
                } else {
                  stackIn_8_0 = this.b(0, param1, param2, 79289964);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (hb) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.b(param1, 0, param2, 79289964);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("bl.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final hb a(int[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        hb stackIn_2_0 = null;
        hb stackIn_5_0 = null;
        hb stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 17) {
              if (this.field_c.a(param2 ^ 112) != 1) {
                if (-2 == (this.field_c.a(param1, (byte) 101) ^ -1)) {
                  stackIn_9_0 = this.a(-48, 0, param0, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  throw new RuntimeException();
                }
              } else {
                stackIn_5_0 = this.a(-94, param1, param0, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (hb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("bl.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        cf var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (cf) ((Object) mh.field_e.a((byte) -95));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        gj.a((byte) 83, var4, param1);
                        var4 = (cf) ((Object) mh.field_e.a(true));
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_d = (int[]) null;
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var2), "bl.A(" + param0 + ',' + param1 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        if (param0 <= 81) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    private final hb a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        hb var8 = null;
        r var9 = null;
        int var10 = 0;
        hb var11 = null;
        hb stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        hb stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param1 ^ (65533 & param3 << -341313532 | param3 >>> 1871172812);
            var5_int = var5_int | param3 << 1673501264;
            var6 = (long)var5_int;
            var8 = (hb) ((Object) this.field_e.a(var6, 0));
            if (var8 == null) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if ((param2[0] ^ -1) < -1) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var9 = r.a(this.field_c, param3, param1);
              if (var9 != null) {
                L2: {
                  var10 = -92 / ((48 - param0) / 34);
                  var11 = var9.a();
                  var8 = var11;
                  this.field_e.a(var6, (byte) 75, var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var11.field_l.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackIn_14_0 = (hb) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (hb) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hb) ((Object) stackIn_9_0);
          } else {
            return stackIn_14_0;
          }
        }
    }

    bl(ci param0, ci param1) {
        this.field_a = new fl(256);
        this.field_e = new fl(256);
        try {
            this.field_f = param1;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new int[8192];
        field_b = new String[]{"Score 600+ points", "Score 1,000+ points", "Submit a 6+ letter word that uses exactly the same tiles as the previous word", "Submit a 9+ letter word that uses exactly the same tiles as the previous word", "Submit a word where every tile has already been used at least twice", "Submit a word where every tile has already been used at least three times", "Reuse any one consonant tile in every word", "Reuse any two consonant tiles in every word", "Submit a word of 10+ letters", "Submit a 12-letter word", "Extend a 4+ letter word by using every one of its tiles plus 3 new ones", "Submit a 100-point word", "Get a time bonus of 100+ points", "Get a time bonus of 150+ points", "Score 600+ points, including a time bonus of 100+", "Spell 'pumpkin', 'mummy', 'skeleton' or 'vampire'!"};
    }
}
