/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ab implements dn {
    private mi[] field_t;
    private String[] field_v;
    static kc field_u;
    private bh field_w;
    static String field_x;

    ek(bh param0) {
        super(0, 0, 0, 0, (ir) null);
        ((ek) this).field_w = param0;
    }

    public static void d(boolean param0) {
        if (param0) {
            field_x = (String) null;
            field_u = null;
            field_x = null;
            return;
        }
        field_u = null;
        field_x = null;
    }

    final static boolean a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) ua.field_d;
                    // monitorenter ua.field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ch.field_a == lt.field_u) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var1
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param0 < -125) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        boolean discarded$2 = ek.a((byte) 107);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        bk.field_f = ps.field_e[ch.field_a];
                        fr.field_e = qb.field_o[ch.field_a];
                        ch.field_a = ch.field_a - -1 & 127;
                        // monitorexit var1
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5 = 0;
        if (this.a(-1, param1, param2, param3)) {
          return true;
        } else {
          var5 = 114 / ((-53 - param0) / 33);
          if ((param1 ^ -1) == -99) {
            return ((ek) this).b(param3, -24);
          } else {
            if (99 != param1) {
              return false;
            } else {
              return ((ek) this).a(80, param3);
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        hc var5 = null;
        this.a((byte) 118, param1, param2, param3);
        if (0 != param1) {
          return;
        } else {
          L0: {
            var5 = qo.field_b;
            if (null != ((ek) this).field_v) {
              int discarded$2 = var5.a(r.field_o, param3 + ((ek) this).field_p, ((ek) this).field_h + param2, ((ek) this).field_q, 20, 16777215, -1, 0, 0, ((hc) var5).field_D + ((hc) var5).field_I);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 < 64) {
            ((ek) this).a((byte) 54, 31, 107, 46);
            return;
          } else {
            return;
          }
        }
    }

    final void a(String[] param0, boolean param1) {
        int var3 = 0;
        int var4_int = 0;
        wg var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        ((ek) this).field_s.c(268435455);
        if (param0 != null) {
          if (-1 != (param0.length ^ -1)) {
            var3 = param0.length;
            ((ek) this).field_v = new String[var3];
            var4_int = 0;
            L0: while (true) {
              if (var3 <= var4_int) {
                var4 = new wg(qo.field_b, 0, 1);
                ((ek) this).field_t = new mi[var3 - -1];
                if (!param1) {
                  return;
                } else {
                  var5 = 0;
                  L1: while (true) {
                    if (var3 <= var5) {
                      ((ek) this).field_t[var3] = new mi(mi.field_r, (no) this);
                      ((ek) this).field_t[var3].field_e = (ir) (Object) var4;
                      ((ek) this).field_t[var3].a(15, 0, var3 * 16 + 16 + 20, 100, (byte) 123);
                      ((ek) this).a((ea) (Object) ((ek) this).field_t[var3], 1);
                      return;
                    } else {
                      ((ek) this).field_t[var5] = new mi(((ek) this).field_v[var5], (no) this);
                      ((ek) this).field_t[var5].field_e = (ir) (Object) var4;
                      ((ek) this).field_t[var5].field_k = jc.field_wc;
                      ((ek) this).field_t[var5].a(15, 0, 20 + var5 * 16, 80, (byte) 124);
                      ((ek) this).a((ea) (Object) ((ek) this).field_t[var5], 1);
                      var5++;
                      continue L1;
                    }
                  }
                }
              } else {
                ((ek) this).field_v[var4_int] = ju.a(0, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                var4_int++;
                continue L0;
              }
            }
          } else {
            ((ek) this).field_v = null;
            return;
          }
        } else {
          ((ek) this).field_v = null;
          return;
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (((ek) this).field_v.length <= var6) {
            if (param1 == ((ek) this).field_t[((ek) this).field_v.length]) {
              ((ek) this).field_w.a((byte) -77);
              var6 = -47 / ((param4 - -27) / 61);
              return;
            } else {
              var6 = -47 / ((param4 - -27) / 61);
              return;
            }
          } else {
            if (((ek) this).field_t[var6] == param1) {
              ((ek) this).field_w.a(((ek) this).field_v[var6], 10000536);
              var6++;
              var6++;
              continue L0;
            } else {
              var6++;
              var6++;
              continue L0;
            }
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (-1 >= (param1 ^ -1)) {
          if (65536 > param1) {
            L0: {
              if ((param1 ^ -1) > -257) {
                break L0;
              } else {
                var2 += 8;
                param1 = param1 >>> 8;
                break L0;
              }
            }
            if (param0 < 98) {
              return 58;
            } else {
              L1: {
                if (16 <= param1) {
                  param1 = param1 >>> 4;
                  var2 += 4;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 < 4) {
                  break L2;
                } else {
                  param1 = param1 >>> 2;
                  var2 += 2;
                  break L2;
                }
              }
              L3: {
                if ((param1 ^ -1) <= -2) {
                  param1 = param1 >>> 1;
                  var2++;
                  break L3;
                } else {
                  break L3;
                }
              }
              return param1 + var2;
            }
          } else {
            L4: {
              var2 += 16;
              param1 = param1 >>> 16;
              if ((param1 ^ -1) > -257) {
                break L4;
              } else {
                var2 += 8;
                param1 = param1 >>> 8;
                break L4;
              }
            }
            if (param0 < 98) {
              return 58;
            } else {
              L5: {
                if (16 <= param1) {
                  param1 = param1 >>> 4;
                  var2 += 4;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param1 < 4) {
                  break L6;
                } else {
                  param1 = param1 >>> 2;
                  var2 += 2;
                  break L6;
                }
              }
              L7: {
                if ((param1 ^ -1) <= -2) {
                  param1 = param1 >>> 1;
                  var2++;
                  break L7;
                } else {
                  break L7;
                }
              }
              return param1 + var2;
            }
          }
        } else {
          L8: {
            var2 += 16;
            param1 = param1 >>> 16;
            if ((param1 ^ -1) > -257) {
              break L8;
            } else {
              var2 += 8;
              param1 = param1 >>> 8;
              break L8;
            }
          }
          if (param0 < 98) {
            return 58;
          } else {
            L9: {
              if (16 <= param1) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param1 < 4) {
                break L10;
              } else {
                param1 = param1 >>> 2;
                var2 += 2;
                break L10;
              }
            }
            L11: {
              if ((param1 ^ -1) <= -2) {
                param1 = param1 >>> 1;
                var2++;
                break L11;
              } else {
                break L11;
              }
            }
            return param1 + var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new kc();
        field_x = "Connection restored.";
    }
}
