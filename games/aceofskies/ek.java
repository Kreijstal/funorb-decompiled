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
        try {
            this.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
        boolean discarded$2 = false;
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        var1 = ua.field_d;
        synchronized (var1) {
          L0: {
            if (ch.field_a == lt.field_u) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0 < -125) {
                  break L1;
                } else {
                  discarded$2 = ek.a((byte) 107);
                  break L1;
                }
              }
              bk.field_f = ps.field_e[ch.field_a];
              fr.field_e = qb.field_o[ch.field_a];
              ch.field_a = ch.field_a - -1 & 127;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(-1, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = 114 / ((-53 - param0) / 33);
              if ((param1 ^ -1) == -99) {
                stackOut_6_0 = this.b(param3, -24);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 == param1) {
                  stackOut_10_0 = this.a(80, param3);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("ek.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int discarded$2 = 0;
        hc var5 = null;
        super.a((byte) 118, param1, param2, param3);
        if (0 != param1) {
          return;
        } else {
          L0: {
            var5 = qo.field_b;
            if (null != this.field_v) {
              discarded$2 = var5.a(r.field_o, param3 + this.field_p, this.field_h + param2, this.field_q, 20, 16777215, -1, 0, 0, var5.field_D + var5.field_I);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 < 64) {
            this.a((byte) 54, 31, 107, 46);
            return;
          } else {
            return;
          }
        }
    }

    final void a(String[] param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        wg var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_s.c(268435455);
              if (param0 == null) {
                break L1;
              } else {
                if (-1 != (param0.length ^ -1)) {
                  var3_int = param0.length;
                  this.field_v = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new wg(qo.field_b, 0, 1);
                      this.field_t = new mi[var3_int - -1];
                      if (param1) {
                        var5 = 0;
                        L3: while (true) {
                          if (var3_int <= var5) {
                            this.field_t[var3_int] = new mi(mi.field_r, (no) (this));
                            this.field_t[var3_int].field_e = (ir) ((Object) var4);
                            this.field_t[var3_int].a(15, 0, var3_int * 16 + 16 + 20, 100, (byte) 123);
                            this.a(this.field_t[var3_int], 1);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            this.field_t[var5] = new mi(this.field_v[var5], (no) (this));
                            this.field_t[var5].field_e = (ir) ((Object) var4);
                            this.field_t[var5].field_k = jc.field_wc;
                            this.field_t[var5].a(15, 0, 20 + var5 * 16, 80, (byte) 124);
                            this.a(this.field_t[var5], 1);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      this.field_v[var4_int] = ju.a(0, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_v = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("ek.W(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (this.field_v.length <= var6_int) {
                L2: {
                  if (param1 != this.field_t[this.field_v.length]) {
                    break L2;
                  } else {
                    this.field_w.a((byte) -77);
                    break L2;
                  }
                }
                var6_int = -47 / ((param4 - -27) / 61);
                break L0;
              } else {
                L3: {
                  if (this.field_t[var6_int] == param1) {
                    this.field_w.a(this.field_v[var6_int], 10000536);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("ek.DA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        field_u = new kc();
        field_x = "Connection restored.";
    }
}
