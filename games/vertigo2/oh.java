/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oh extends iq implements dq {
    static String field_E;
    static nj field_D;
    iq field_C;
    static volatile boolean field_F;

    final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            discarded$12 = param3.append('\n');
            if (param0 == 1000) {
              var5_int = 0;
              L1: while (true) {
                if (param2 < var5_int) {
                  if (null == this.field_C) {
                    discarded$13 = param3.append("null");
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_C.a(param1, 1 + param2, (byte) -79, param3);
                    return;
                  }
                } else {
                  discarded$14 = param3.append(' ');
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("oh.WA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static Object a(boolean param0, boolean param1, byte[] param2) {
        vb var3 = null;
        RuntimeException var3_ref = null;
        vb stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (136 < param2.length) {
                var3 = new vb();
                ((dh) ((Object) var3)).a(param2, true);
                stackIn_6_0 = (vb) (var3);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (param1) {
                  if (param0) {
                    stackIn_14_0 = kk.a(param2, (byte) 103);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_12_0 = (byte[]) (param2);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = (Object) null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("oh.LA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    iq a(int param0) {
        iq var2 = null;
        if (param0 != 15197) {
            field_D = (nj) null;
            var2 = this.field_C;
            if (var2 == null) {
                return null;
            }
            if (!(!var2.f(68))) {
                return var2;
            }
            return null;
        }
        var2 = this.field_C;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.f(68))) {
            return var2;
        }
        return null;
    }

    final static void a(String param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var2_int = ed.field_n;
            var3 = gb.field_d;
            if (param1) {
                field_D = (nj) null;
            }
            var4 = ee.field_b.field_z.b(param0, 500);
            var5 = ee.field_b.field_z.a(param0, 500) + 6;
            var6 = r.field_f * var4 + 2;
            var7 = jf.a(var5, 12, var2_int, 1);
            var8 = dm.a(20, 0, var6, var3);
            bi.e(var7, var8, var5, var6, 0);
            bi.b(1 + var7, var8 + 1, var5 + -2, var6 - 2, 16777088);
            ee.field_b.field_z.a(param0, var7 + 3, -ee.field_b.field_z.field_z + (1 + (var8 - -hc.field_b)), 500, 1000, 0, -1, 0, 0, r.field_f);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "oh.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(byte param0, iq param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 116) {
                break L1;
              } else {
                field_F = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_C == null) {
                  break L3;
                } else {
                  if (!this.field_C.a((byte) 116, param1)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("oh.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final int c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 >= -97) {
          L0: {
            field_E = (String) null;
            if (null != this.field_C) {
              stackIn_8_0 = this.field_C.c((byte) -105);
              break L0;
            } else {
              stackIn_8_0 = 0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null != this.field_C) {
              stackIn_4_0 = this.field_C.c((byte) -105);
              break L1;
            } else {
              stackIn_4_0 = 0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    void a(byte param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        String var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a((byte) 112, param1, param2, param3);
              if (param0 > 6) {
                break L1;
              } else {
                var6 = (String) null;
                oh.a((String) null, false);
                break L1;
              }
            }
            if (null != this.field_C) {
              this.field_C.a((byte) 14, this.field_o + param1, this.field_t + param2, param3);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("oh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 46) {
              if (this.field_C != null) {
                this.field_C.a(param0, (byte) 46, param2 + this.field_o, param3 + this.field_t, param4, param5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("oh.HA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    String a(boolean param0) {
        String var2;
        String var3;
        var2 = super.a(param0);
        if (this.field_C != null) {
          var3 = this.field_C.a(false);
          if (var3 == null) {
            return var2;
          } else {
            return var3;
          }
        } else {
          return var2;
        }
    }

    void a(boolean param0, int param1, int param2, int param3) {
        L0: {
          if (param1 != 0) {
            break L0;
          } else {
            if (null != this.field_B) {
              this.field_B.a(true, param2, true, (iq) (this), param3);
              break L0;
            } else {
              if (this.field_C != null) {
                this.field_C.a(param0, param1, this.field_o + param2, this.field_t + param3);
                if (!param0) {
                  return;
                } else {
                  field_D = (nj) null;
                  return;
                }
              } else {
                if (param0) {
                  field_D = (nj) null;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (this.field_C == null) {
          if (param0) {
            field_D = (nj) null;
            return;
          } else {
            return;
          }
        } else {
          this.field_C.a(param0, param1, this.field_o + param2, this.field_t + param3);
          if (param0) {
            field_D = (nj) null;
            return;
          } else {
            return;
          }
        }
    }

    void a(byte param0) {
        if (null == this.field_C) {
          if (param0 < 93) {
            this.c((byte) 67);
            return;
          } else {
            return;
          }
        } else {
          this.field_C.g(-63);
          if (param0 >= 93) {
            return;
          } else {
            this.c((byte) 67);
            return;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) 96);
    }

    StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param3, -1, param1, param0)) {
                break L1;
              } else {
                this.a(param0, param3, true, param1);
                this.a(param2 ^ -935, param0, param1, param3);
                break L1;
              }
            }
            if (param2 == -79) {
              stackIn_6_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("oh.FA(");

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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 <= 3) {
          L0: {
            this.c((byte) 103);
            if (null == this.a(15197)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == this.a(15197)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        iq var9 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param5 < -107) {
                break L1;
              } else {
                var9 = (iq) null;
                this.a((byte) -57, -98, -76, (iq) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_C == null) {
                  break L3;
                } else {
                  if (!this.field_C.a(param0, param1 - -this.field_o, this.field_t + param2, param3, param4, (byte) -116, param6)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("oh.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, iq param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var8_int = -119 % ((-87 - param5) / 35);
                if (this.field_C == null) {
                  break L2;
                } else {
                  if (!this.field_C.f(48)) {
                    break L2;
                  } else {
                    if (!this.field_C.a(param0, param1, param2, param3, param4, (byte) 126, param6)) {
                      break L2;
                    } else {
                      stackIn_5_0 = 1;
                      break L1;
                    }
                  }
                }
              }
              stackIn_5_0 = 0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("oh.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static u[] a(byte param0, String param1, String param2, r param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        u[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -39) {
                break L1;
              } else {
                var6 = (byte[]) null;
                oh.a(true, true, (byte[]) null);
                break L1;
              }
            }
            var4_int = param3.a((byte) 123, param2);
            var5 = param3.a(var4_int, param1, 101);
            stackIn_3_0 = an.a(var5, param3, var4_int, (byte) 120);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("oh.UA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    oh(int param0, int param1, int param2, int param3, ur param4, uf param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final boolean a(int param0, iq param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 21) {
                break L1;
              } else {
                field_D = (nj) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_C == null) {
                  break L3;
                } else {
                  if (this.field_C.f(38)) {
                    break L3;
                  } else {
                    if (!this.field_C.a((byte) 116, param1)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("oh.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_C) {
                break L1;
              } else {
                if (!this.field_C.f(85)) {
                  break L1;
                } else {
                  if (!this.field_C.a(param0, param1 + 0, param2, param3)) {
                    break L1;
                  } else {
                    stackIn_4_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            if (param1 == 13) {
              var5_int = param2;
              if (var5_int == 80) {
                L2: {
                  if (!cr.field_eb[81]) {
                    stackIn_13_0 = this.a(param3, 16777088);
                    break L2;
                  } else {
                    stackIn_13_0 = this.a(78, param3);
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return false;
              }
            } else {
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("oh.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    private final boolean a(iq param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 16777088) {
                break L1;
              } else {
                field_E = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_C) {
                  break L3;
                } else {
                  if (this.field_C.f(param1 ^ 16777102)) {
                    break L3;
                  } else {
                    if (!this.field_C.a((byte) 116, param0)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("oh.PA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void d(byte param0) {
        if (param0 != 2) {
          L0: {
            this.a(true, -64, 58, -19);
            if (null != this.field_C) {
              this.field_C.d((byte) 2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != this.field_C) {
              this.field_C.d((byte) 2);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void e(byte param0) {
        String var2;
        if (param0 >= -95) {
          var2 = (String) null;
          oh.a((String) null, false);
          field_E = null;
          field_D = null;
          return;
        } else {
          field_E = null;
          field_D = null;
          return;
        }
    }

    static {
        field_E = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_F = false;
        field_D = new nj();
    }
}
