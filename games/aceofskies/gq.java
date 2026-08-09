/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    static boolean field_f;
    static int field_a;
    private lc field_b;
    static String field_d;
    private int field_g;
    private hs field_h;
    static int field_e;
    private int field_c;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        CharSequence var7_ref_CharSequence = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (0 != param0) {
              if (-2 == (param0 ^ -1)) {
                var10 = param1[param3];
                var4 = var10;
                if (var4 != null) {
                  stackIn_10_0 = var10.toString();
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param3 + param0;
                var5 = 0;
                var6_int = param3;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    L2: {
                      if (param2 == 21530) {
                        break L2;
                      } else {
                        gq.a(true, 117, 74);
                        break L2;
                      }
                    }
                    var6 = new StringBuilder(var5);
                    var7 = param3;
                    L3: while (true) {
                      if (var4_int <= var7) {
                        stackIn_28_0 = var6.toString();
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          var8 = param1[var7];
                          if (var8 == null) {
                            discarded$0 = var6.append("null");
                            break L4;
                          } else {
                            discarded$1 = var6.append(var8);
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var7_ref_CharSequence = param1[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L5;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var4_ref);

            stackIn_31_1 = new StringBuilder().append("gq.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L6;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_28_0;
            }
          }
        }
    }

    final void a(byte param0, int param1) {
        long fieldTemp$1 = 0L;
        he var3;
        mb var4;
        int var5;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var3 = (he) ((Object) this.field_h.a(-115));
        L0: while (true) {
          if (var3 == null) {
            if (param0 > -33) {
              field_a = 98;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (!var3.e(0)) {
                fieldTemp$1 = var3.field_i + 1L;
                var3.field_i = var3.field_i + 1L;
                if ((fieldTemp$1 ^ -1L) < ((long)param1 ^ -1L)) {
                  var4 = new mb(var3.a((byte) 74), var3.field_p);
                  this.field_b.a(-1, var4, var3.field_b);
                  ns.a(var4, -30575, var3);
                  var3.c(-125);
                  var3.d(-115);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                if (var3.a((byte) 74) != null) {
                  break L1;
                } else {
                  var3.c(-128);
                  var3.d(-126);
                  this.field_g = this.field_g + var3.field_p;
                  break L1;
                }
              }
            }
            var3 = (he) ((Object) this.field_h.a(true));
            continue L0;
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = AceOfSkies.field_G ? 1 : 0;
        if (param0 <= 95) {
          gq.a(-5);
          if (param7 > param3) {
            if (param7 >= param5) {
              if (param3 >= param5) {
                tm.a(param2, param7, param4, 14250, param1, vp.field_j, param5, param3, param6);
                return;
              } else {
                tm.a(param1, param7, param4, 14250, param2, vp.field_j, param3, param5, param6);
                return;
              }
            } else {
              tm.a(param4, param5, param1, 14250, param2, vp.field_j, param3, param7, param6);
              return;
            }
          } else {
            if (param3 >= param5) {
              if (param7 >= param5) {
                tm.a(param4, param3, param2, 14250, param1, vp.field_j, param5, param7, param6);
                return;
              } else {
                tm.a(param1, param3, param2, 14250, param4, vp.field_j, param7, param5, param6);
                return;
              }
            } else {
              tm.a(param2, param5, param1, 14250, param4, vp.field_j, param7, param3, param6);
              return;
            }
          }
        } else {
          if (param7 > param3) {
            if (param7 >= param5) {
              if (param3 >= param5) {
                tm.a(param2, param7, param4, 14250, param1, vp.field_j, param5, param3, param6);
                return;
              } else {
                tm.a(param1, param7, param4, 14250, param2, vp.field_j, param3, param5, param6);
                return;
              }
            } else {
              tm.a(param4, param5, param1, 14250, param2, vp.field_j, param3, param7, param6);
              return;
            }
          } else {
            if (param3 >= param5) {
              if (param7 >= param5) {
                tm.a(param4, param3, param2, 14250, param1, vp.field_j, param5, param7, param6);
                return;
              } else {
                tm.a(param1, param3, param2, 14250, param4, vp.field_j, param7, param5, param6);
                return;
              }
            } else {
              tm.a(param2, param5, param1, 14250, param4, vp.field_j, param7, param3, param6);
              return;
            }
          }
        }
    }

    private final void a(int param0, he param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 6646) {
                break L1;
              } else {
                this.a(125L, 122);
                break L1;
              }
            }
            if (param1 == null) {
              break L0;
            } else {
              param1.c(-123);
              param1.d(-117);
              this.field_g = this.field_g + param1.field_p;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("gq.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final Object a(long param0, int param1) {
        Object var5;
        qj var6;
        he var7;
        var7 = (he) ((Object) this.field_b.a(param0, (byte) 106));
        if (var7 != null) {
          var5 = var7.a((byte) 74);
          if (param1 < -90) {
            if (var5 != null) {
              if (var7.e(0)) {
                var6 = new qj(var5, var7.field_p);
                this.field_b.a(-1, var6, var7.field_b);
                this.field_h.a((wt) (var6), (byte) -74);
                ((he) ((Object) var6)).field_i = 0L;
                var7.c(-128);
                var7.d(-119);
                return var5;
              } else {
                this.field_h.a((wt) (var7), (byte) 85);
                var7.field_i = 0L;
                return var5;
              }
            } else {
              var7.c(-124);
              var7.d(-114);
              this.field_g = this.field_g + var7.field_p;
              return null;
            }
          } else {
            this.field_g = 32;
            if (var5 != null) {
              if (var7.e(0)) {
                var6 = new qj(var5, var7.field_p);
                this.field_b.a(-1, var6, var7.field_b);
                this.field_h.a((wt) (var6), (byte) -74);
                ((he) ((Object) var6)).field_i = 0L;
                var7.c(-128);
                var7.d(-119);
                return var5;
              } else {
                this.field_h.a((wt) (var7), (byte) 85);
                var7.field_i = 0L;
                return var5;
              }
            } else {
              var7.c(-124);
              var7.d(-114);
              this.field_g = this.field_g + var7.field_p;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        if (!param0) {
            gq.a(false, 19, 116);
            ik.field_k = param1;
            rs.field_v = param2;
            return;
        }
        ik.field_k = param1;
        rs.field_v = param2;
    }

    gq(int param0) {
        this(param0, param0);
    }

    final static int a(hd param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == wo.field_n) {
              stackIn_18_0 = 6407;
              decompiledRegionSelector0 = 5;
              break L0;
            } else {
              if (param0 != lc.field_g) {
                if (ro.field_o != param0) {
                  if (wf.field_d == param0) {
                    stackIn_16_0 = 6409;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (param0 != hh.field_c) {
                      if (aj.field_r == param0) {
                        stackIn_14_0 = 6145;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L1: {
                          if (param1 == -29824) {
                            break L1;
                          } else {
                            field_f = true;
                            break L1;
                          }
                        }
                        throw new IllegalStateException();
                      }
                    } else {
                      stackIn_10_0 = 6410;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  stackIn_6_0 = 6406;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_3_0 = 6408;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("gq.G(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  return stackIn_18_0;
                }
              }
            }
          }
        }
    }

    final Object b(int param0) {
        he var2;
        Object var3;
        he var4;
        int var5;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var2 = (he) ((Object) this.field_b.a(param0 + -6533));
        L0: while (true) {
          if (var2 == null) {
            if (param0 == 6408) {
              return null;
            } else {
              field_a = 59;
              return null;
            }
          } else {
            var3 = var2.a((byte) 74);
            if (var3 == null) {
              var4 = var2;
              var2 = (he) ((Object) this.field_b.a(-64));
              var4.c(-125);
              var4.d(-127);
              this.field_g = this.field_g + var4.field_p;
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    final void a(long param0, Object param1, int param2) {
        try {
            if (param2 > -30) {
                Object var6 = (Object) null;
                this.a(-60L, (byte) -4, -64, (Object) null);
            }
            this.a(param0, (byte) 71, 1, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "gq.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final Object a(byte param0) {
        he var2;
        Object var3;
        he var4;
        int var5;
        Object stackIn_7_0 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var2 = (he) ((Object) this.field_b.b(param0 ^ -16));
        L0: while (true) {
          if (var2 == null) {
            if (param0 == -16) {
              return null;
            } else {
              stackIn_7_0 = (Object) null;
              return stackIn_7_0;
            }
          } else {
            var3 = var2.a((byte) 74);
            if (var3 == null) {
              var4 = var2;
              var2 = (he) ((Object) this.field_b.a(-118));
              var4.c(-126);
              var4.d(-116);
              this.field_g = this.field_g + var4.field_p;
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    private final void a(int param0, long param1) {
        he var4 = (he) ((Object) this.field_b.a(param1, (byte) 91));
        this.a(6646, var4);
        if (param0 > -108) {
            gq.a(-85);
            return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 6408) {
            gq.a((byte) 93, -113, 71, 39, 20, -85, -2, -11);
        }
    }

    private final void a(long param0, byte param1, int param2, Object param3) {
        he var9 = null;
        qj var6 = null;
        int var8 = AceOfSkies.field_G ? 1 : 0;
        try {
            if (!(param2 <= this.field_c)) {
                throw new IllegalStateException();
            }
            this.a(-111, param0);
            this.field_g = this.field_g - param2;
            while (-1 < (this.field_g ^ -1)) {
                var9 = (he) ((Object) this.field_h.b(false));
                this.a(6646, var9);
            }
            var6 = new qj(param3, param2);
            int var7 = -16 / ((-52 - param1) / 34);
            this.field_b.a(-1, var6, param0);
            this.field_h.a((wt) (var6), (byte) 64);
            ((he) ((Object) var6)).field_i = 0L;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "gq.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private gq(int param0, int param1) {
        int var3;
        this.field_h = new hs();
        this.field_g = param0;
        this.field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              this.field_b = new lc(var3);
              return;
            }
          } else {
            this.field_b = new lc(var3);
            return;
          }
        }
    }

    static {
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_e = 0;
    }
}
