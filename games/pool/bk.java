/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends ma {
    int field_s;
    private int field_n;
    private dd field_z;
    static String field_x;
    private ko field_r;
    int field_l;
    gi field_q;
    int field_o;
    int field_u;
    private int field_t;
    static nm field_m;
    private String field_p;
    static int[] field_w;
    private int field_y;
    static int field_v;

    final int c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -101) {
              stackIn_4_0 = 20 + (qa.field_v.field_Db + this.field_t);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -65;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "bk.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void c(int param0) {
        try {
            this.field_q = ag.a(-al.field_k.field_eb + gg.field_f, this.field_r, wn.field_i + -al.field_k.field_qb, 15395);
            int var2_int = 25 % ((param0 - 39) / 62);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "bk.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        try {
            this.field_q.a(param0, al.field_k.field_qb, param1, -1, true, al.field_k.field_eb);
            if (param2 != 9750) {
                this.field_u = -125;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "bk.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_w = (int[]) null;
                break L1;
              }
            }
            this.field_z.c(al.field_k.field_qb, al.field_k.field_eb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "bk.C(" + param0 + ')');
        }
    }

    final void a(hq param0, int param1) {
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_n = -20 + al.field_k.field_gb;
              if (param1 > 36) {
                break L1;
              } else {
                this.field_l = 75;
                break L1;
              }
            }
            L2: {
              this.field_y = op.field_f;
              if ((this.field_p.indexOf("<img=") ^ -1) != 0) {
                break L2;
              } else {
                this.field_y = sa.field_h.field_G;
                break L2;
              }
            }
            L3: {
              L4: {
                this.field_t = sa.field_h.b(this.field_p, this.field_n, this.field_y);
                if (param0.field_d.field_e == this.field_k) {
                  break L4;
                } else {
                  if (pl.field_b.field_pb) {
                    break L4;
                  } else {
                    pl.field_b.field_pb = true;
                    break L3;
                  }
                }
              }
              if (this.field_k != param0.field_d.field_e) {
                break L3;
              } else {
                if (!pl.field_b.field_pb) {
                  break L3;
                } else {
                  pl.field_b.field_R = 0;
                  pl.field_b.field_pb = false;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                L7: {
                  if (param0.field_d.field_e != this.field_d) {
                    break L7;
                  } else {
                    if (param0.field_j == null) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (!jq.field_d.field_pb) {
                  jq.field_d.field_pb = true;
                  break L5;
                } else {
                  break L6;
                }
              }
              if (this.field_d != param0.field_d.field_e) {
                break L5;
              } else {
                if (null != param0.field_j) {
                  break L5;
                } else {
                  if (!jq.field_d.field_pb) {
                    break L5;
                  } else {
                    jq.field_d.field_pb = false;
                    jq.field_d.field_R = 0;
                    break L5;
                  }
                }
              }
            }
            L8: {
              var3_int = this.field_s;
              if (0 == var3_int) {
                param0.field_a.a(false, (byte) -109);
                break L8;
              } else {
                if (2 != var3_int) {
                  if ((var3_int ^ -1) != -2) {
                    break L8;
                  } else {
                    param0.field_a.a(false, (byte) -127);
                    break L8;
                  }
                } else {
                  param0.field_a.a(false, (byte) -122);
                  break L8;
                }
              }
            }
            this.field_z = new dd(al.field_k.field_gb, this.field_t + 10);
            this.field_z.e();
            sa.field_h.a(nf.field_Z, bi.field_d);
            sa.field_h.a(ef.a("</col>", this.field_p, (byte) 4, "<col=ccccff>"), 10, 7, this.field_n, this.field_t, 16777215, 3355443, 0, 1, this.field_y);
            this.field_r = ug.a(new int[]{this.field_y}, this.field_n, this.field_p, 7, sa.field_h, true, 10);
            sh.field_P.b(15100);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var3);

            stackIn_54_1 = new StringBuilder().append("bk.G(");

            if (param0 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L9;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L9;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_l > this.field_u) {
                this.field_u = this.field_u + param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 127) {
                break L2;
              } else {
                this.field_y = -57;
                break L2;
              }
            }
            L3: {
              if (this.field_u < this.field_l) {
                stackIn_11_0 = 0;
                break L3;
              } else {
                stackIn_11_0 = 1;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "bk.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static boolean a(pq[] param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param1 == 57) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= param0.length) {
                    break L4;
                  } else {
                    stackIn_15_0 = param0[var2_int].field_v;

                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (stackIn_15_0 != 0) {
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var2_int++;
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_15_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("bk.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -5917) {
                break L1;
              } else {
                bk.a(-18);
                break L1;
              }
            }
            field_w = null;
            field_m = null;
            field_x = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "bk.H(" + param0 + ')');
        }
    }

    bk(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_s = 0;
        this.field_q = null;
        try {
          L0: {
            L1: {
              this.field_p = param0;
              this.field_l = param1;
              this.field_u = 0;
              if (0 == (param2 ^ -1)) {
                break L1;
              } else {
                this.field_s = 1 << param2;
                break L1;
              }
            }
            this.field_o = this.field_s ^ -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("bk.<init>(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    bk(String param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_s = 0;
        this.field_q = null;
        try {
          L0: {
            L1: {
              this.field_o = param3;
              this.field_p = param0;
              if ((param2 ^ -1) != 0) {
                this.field_s = 1 << param2;
                break L1;
              } else {
                break L1;
              }
            }
            this.field_u = 0;
            this.field_l = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("bk.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    bk(String param0, int param1, int param2, ko param3) {
        RuntimeException runtimeException = null;
        aa var5 = null;
        bk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Pool.field_O;
                    this.field_s = 0;
                    this.field_q = null;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_u = 0;
                        this.field_l = param1;
                        if (0 == (param2 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_s = 1 << param2;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_p = param0;
                        this.field_o = this.field_s ^ -1;
                        var5 = new aa(param3);
                        var6 = (bk) ((Object) var5.b((byte) -92));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == var6) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_o = this.field_o & (var6.field_s ^ -1);
                        var6 = (bk) ((Object) var5.b(-114));
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (runtimeException);
                    stackIn_11_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("bk.<init>(");
                    stackIn_11_1 = stackIn_13_1;
                    if (param0 == null) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_0 = stackIn_17_0;
                    stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_15_1 = stackIn_17_1;
                    if (param3 == null) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw wm.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_w = new int[4];
        field_x = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
