/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c implements Iterator {
    private ce field_h;
    static String field_b;
    private uf field_g;
    static String field_c;
    private uf field_e;
    static String field_i;
    private int field_f;
    static String field_d;
    static char[] field_a;

    final static void a(byte param0, ci param1, int param2) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        java.applet.Applet var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            var10 = param1.field_z;
            var9 = var10;
            var3_array = var9;
            var4 = 0;
            var5 = -1 + param1.field_t;
            L1: while (true) {
              if (var5 < 0) {
                var4 = 0;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= param1.field_t) {
                    var4 = 0;
                    var5 = -1 + param1.field_t;
                    L3: while (true) {
                      if ((var5 ^ -1) > -1) {
                        L4: {
                          if (param0 == -86) {
                            break L4;
                          } else {
                            var8 = (java.applet.Applet) null;
                            c.a((byte) 118, (java.applet.Applet) null);
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        var6 = param1.field_r - 1;
                        L5: while (true) {
                          if (0 > var6) {
                            var5--;
                            continue L3;
                          } else {
                            L6: {
                              if ((var10[var4] ^ -1) != -2) {
                                var4++;
                                break L6;
                              } else {
                                incrementValue$2 = var4;
                                var4++;
                                var3_array[incrementValue$2] = param2;
                                break L6;
                              }
                            }
                            var6--;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var6 = 0;
                    L7: while (true) {
                      if (param1.field_r <= var6) {
                        var5++;
                        continue L2;
                      } else {
                        L8: {
                          if (-1 == (var10[var4] ^ -1)) {
                            L9: {
                              if (0 >= var6) {
                                break L9;
                              } else {
                                if (var3_array[-1 + var4] <= 1) {
                                  break L9;
                                } else {
                                  var10[var4] = 1;
                                  break L8;
                                }
                              }
                            }
                            L10: {
                              if (-1 <= (var5 ^ -1)) {
                                break L10;
                              } else {
                                if ((var3_array[-param1.field_r + var4] ^ -1) >= -2) {
                                  break L10;
                                } else {
                                  var10[var4] = 1;
                                  break L8;
                                }
                              }
                            }
                            L11: {
                              if (param1.field_r - 1 <= var6) {
                                break L11;
                              } else {
                                if ((var3_array[var4 + 1] ^ -1) >= -2) {
                                  break L11;
                                } else {
                                  var10[var4] = 1;
                                  break L8;
                                }
                              }
                            }
                            if (param1.field_t - 1 > var5) {
                              if (var3_array[var4 + param1.field_r] > 1) {
                                var10[var4] = 1;
                                break L8;
                              } else {
                                break L8;
                              }
                            } else {
                              var4++;
                              var6++;
                              continue L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var4++;
                        var6++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var6 = param1.field_r + -1;
                L12: while (true) {
                  if (0 > var6) {
                    var5--;
                    continue L1;
                  } else {
                    L13: {
                      if (1 == var10[var4]) {
                        incrementValue$3 = var4;
                        var4++;
                        var3_array[incrementValue$3] = 2;
                        break L13;
                      } else {
                        var4++;
                        break L13;
                      }
                    }
                    var6--;
                    continue L12;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var3);
            stackOut_44_1 = new StringBuilder().append("c.C(").append(param0).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L14;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L14;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_c = null;
        field_b = null;
        field_a = null;
        field_i = null;
        if (param0 != 1) {
            discarded$0 = c.b(125);
        }
        field_d = null;
    }

    public final boolean hasNext() {
        int fieldTemp$8 = 0;
        int var2 = 0;
        var2 = Terraphoenix.field_V;
        if (this.field_e != this.field_h.field_a[-1 + this.field_f]) {
          return true;
        } else {
          L0: while (true) {
            if (this.field_h.field_c <= this.field_f) {
              return false;
            } else {
              fieldTemp$8 = this.field_f;
              this.field_f = this.field_f + 1;
              if (this.field_h.field_a[fieldTemp$8].field_d != this.field_h.field_a[this.field_f - 1]) {
                this.field_e = this.field_h.field_a[-1 + this.field_f].field_d;
                return true;
              } else {
                this.field_e = this.field_h.field_a[this.field_f - 1];
                continue L0;
              }
            }
          }
        }
    }

    public final void remove() {
        if (!(this.field_g != null)) {
            throw new IllegalStateException();
        }
        this.field_g.b((byte) 12);
        this.field_g = null;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        uf var1 = null;
        int var2 = Terraphoenix.field_V;
        if (!(this.field_h.field_a[-1 + this.field_f] == this.field_e)) {
            var1 = this.field_e;
            this.field_g = var1;
            this.field_e = var1.field_d;
            return var1;
        }
        do {
            if (this.field_f >= this.field_h.field_c) {
                return null;
            }
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            var1 = this.field_h.field_a[fieldTemp$0].field_d;
        } while (this.field_h.field_a[this.field_f - 1] == var1);
        this.field_g = var1;
        this.field_e = var1.field_d;
        return var1;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param0 == -110) {
                      var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                      param1.getAppletContext().showDocument(bb.a((byte) 126, var2, param1), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("c.D(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0) {
        this.field_e = this.field_h.field_a[0].field_d;
        if (param0) {
            return;
        }
        this.field_f = 1;
        this.field_g = null;
    }

    c(ce param0) {
        this.field_g = null;
        try {
            this.field_h = param0;
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "c.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -60) {
            break L0;
          } else {
            field_d = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (20 > uh.field_H) {
              break L2;
            } else {
              if (!wf.a(31996)) {
                break L2;
              } else {
                L3: {
                  if (0 >= db.field_b) {
                    break L3;
                  } else {
                    if (mi.a((byte) -95)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    static {
        field_c = "6000pts";
        field_b = "Build ";
        field_d = "Options Menu";
        field_a = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
