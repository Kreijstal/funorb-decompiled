/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cm implements Iterator {
    private int field_e;
    private bh field_c;
    private bh field_j;
    private si field_k;
    static int[] field_a;
    static int[] field_h;
    static int[] field_g;
    static int[] field_b;
    static String field_i;
    static String field_d;
    static ie field_f;

    public final Object next() {
        int fieldTemp$0 = 0;
        bh var1 = null;
        int var2 = client.field_A ? 1 : 0;
        if (!(this.field_c == this.field_k.field_h[this.field_e + -1])) {
            var1 = this.field_c;
            this.field_c = var1.field_b;
            this.field_j = var1;
            return var1;
        }
        do {
            if (this.field_k.field_a <= this.field_e) {
                return null;
            }
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            var1 = this.field_k.field_h[fieldTemp$0].field_b;
            if (var1 != this.field_k.field_h[-1 + this.field_e]) {
                this.field_c = var1.field_b;
                this.field_j = var1;
                return var1;
            }
        } while (var2 == 0);
        return null;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sb var4_ref_sb = null;
        int var4 = 0;
        ff var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        uf var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = de.field_V;
              if (param0 == 53) {
                break L1;
              } else {
                cm.a(20);
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = var9.d((byte) -44);
                var3 = var9.d((byte) -117);
                if (var2 != 0) {
                  break L3;
                } else {
                  var4_ref_sb = (sb) ((Object) ef.field_S.c((byte) -68));
                  if (var4_ref_sb == null) {
                    si.a(78);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L4: {
                      var5_int = sm.field_e - var9.field_n;
                      var11 = var4_ref_sb.field_q;
                      var10 = var11;
                      var6 = var10;
                      if (var11.length << 1327655874 < var5_int) {
                        var5_int = var11.length << -816484830;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = 0;
                    L5: while (true) {
                      L6: {
                        if (var7 >= var5_int) {
                          var4_ref_sb.field_s = true;
                          var4_ref_sb.b((byte) 118);
                          break L6;
                        } else {
                          var6[var7 >> -1175205182] = var6[var7 >> -1175205182] + (var9.d((byte) -108) << (lb.a(3, var7) << 1714134600));
                          var7++;
                          if (var8 != 0) {
                            break L6;
                          } else {
                            continue L5;
                          }
                        }
                      }
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L7: {
                if (var2 != 1) {
                  break L7;
                } else {
                  var4 = var9.e((byte) -2);
                  var5 = (ff) ((Object) cd.field_c.c((byte) -124));
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (var5 == null) {
                          break L10;
                        } else {
                          stackOut_21_0 = var3;
                          stackIn_30_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var8 != 0) {
                            break L9;
                          } else {
                            L11: {
                              if (stackIn_22_0 != var5.field_q) {
                                break L11;
                              } else {
                                if (var4 != var5.field_r) {
                                  break L11;
                                } else {
                                  if (var8 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            var5 = (ff) ((Object) cd.field_c.d(true));
                            if (var8 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (var5 == null) {
                        stackOut_29_0 = 71;
                        stackIn_30_0 = stackOut_29_0;
                        break L9;
                      } else {
                        var5.b((byte) 124);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    si.a(stackIn_30_0);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              qb.a((Throwable) null, 16408, "LR1: " + qk.d((byte) 74));
              si.a(100);
              break L2;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "cm.A(" + param0 + ')');
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

    private final void b(byte param0) {
        int var2 = 4 / ((-61 - param0) / 36);
        this.field_e = 1;
        this.field_j = null;
        this.field_c = this.field_k.field_h[0].field_b;
    }

    public final boolean hasNext() {
        int fieldTemp$2 = 0;
        int var2 = 0;
        var2 = client.field_A ? 1 : 0;
        if (this.field_c != this.field_k.field_h[-1 + this.field_e]) {
          return true;
        } else {
          L0: while (true) {
            L1: {
              if (this.field_e >= this.field_k.field_a) {
                break L1;
              } else {
                fieldTemp$2 = this.field_e;
                this.field_e = this.field_e + 1;
                if (this.field_k.field_h[fieldTemp$2].field_b == this.field_k.field_h[this.field_e - 1]) {
                  this.field_c = this.field_k.field_h[this.field_e + -1];
                  if (var2 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_c = this.field_k.field_h[-1 + this.field_e].field_b;
                  return true;
                }
              }
            }
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_i = null;
        field_d = null;
        if (param0 != 1714134600) {
            field_a = (int[]) null;
        }
    }

    public final void remove() {
        if (this.field_j == null) {
            throw new IllegalStateException();
        }
        this.field_j.b((byte) 112);
        this.field_j = null;
    }

    final static String a(byte param0, String param1, String[] param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_24_0 = 0;
        boolean stackIn_31_0 = false;
        String stackIn_42_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_23_0 = 0;
        String stackOut_41_0 = null;
        boolean stackOut_30_0 = false;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              stackOut_2_0 = var6_int ^ -1;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (stackIn_3_0 <= -1) {
                        break L5;
                      } else {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var5 = 2 + var6_int;
                    break L4;
                  }
                  L6: while (true) {
                    L7: {
                      if (var5 >= var3_int) {
                        break L7;
                      } else {
                        stackOut_9_0 = fl.a(param1.charAt(var5), (byte) 23);
                        stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          continue L2;
                        } else {
                          if (!stackIn_10_0) {
                            break L7;
                          } else {
                            var5++;
                            if (var11 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var7_ref_String = param1.substring(2 + var6_int, var5);
                      if (be.a((byte) 98, (CharSequence) ((Object) var7_ref_String))) {
                        break L8;
                      } else {
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var3_int <= var5) {
                        break L9;
                      } else {
                        if (param1.charAt(var5) != 62) {
                          break L9;
                        } else {
                          var5++;
                          var8 = cb.a((byte) -72, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (var6_int - (var5 - param2[var8].length()));
                          break L9;
                        }
                      }
                    }
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L10: {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  if (param0 > 80) {
                    break L10;
                  } else {
                    cm.a((byte) -121);
                    break L10;
                  }
                }
                var7 = 0;
                L11: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  stackOut_23_0 = var8 ^ -1;
                  stackIn_24_0 = stackOut_23_0;
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (stackIn_24_0 <= -1) {
                          break L14;
                        } else {
                          if (var11 != 0) {
                            break L13;
                          } else {
                            if (var11 == 0) {
                              discarded$3 = var6.append(param1.substring(var7));
                              stackOut_41_0 = var6.toString();
                              stackIn_42_0 = stackOut_41_0;
                              break L0;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      var5 = var8 - -2;
                      break L13;
                    }
                    L15: while (true) {
                      L16: {
                        if (var3_int <= var5) {
                          break L16;
                        } else {
                          stackOut_30_0 = fl.a(param1.charAt(var5), (byte) 23);
                          stackIn_24_0 = stackOut_30_0 ? 1 : 0;
                          stackIn_31_0 = stackOut_30_0;
                          if (var11 != 0) {
                            continue L12;
                          } else {
                            if (!stackIn_31_0) {
                              break L16;
                            } else {
                              var5++;
                              continue L15;
                            }
                          }
                        }
                      }
                      var9 = param1.substring(2 + var8, var5);
                      if (be.a((byte) 98, (CharSequence) ((Object) var9))) {
                        L17: {
                          if (var5 >= var3_int) {
                            break L17;
                          } else {
                            if (param1.charAt(var5) != 62) {
                              break L17;
                            } else {
                              var5++;
                              var10 = cb.a((byte) 100, (CharSequence) ((Object) var9));
                              discarded$4 = var6.append(param1.substring(var7, var8));
                              var7 = var5;
                              discarded$5 = var6.append(param2[var10]);
                              break L17;
                            }
                          }
                        }
                        continue L11;
                      } else {
                        continue L11;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var3);
            stackOut_43_1 = new StringBuilder().append("cm.D(").append(param0).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L18;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L18;
            }
          }
          L19: {
            stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L19;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L19;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
        return stackIn_42_0;
    }

    cm(si param0) {
        this.field_j = null;
        try {
            this.field_k = param0;
            this.b((byte) -117);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int[] var1 = null;
        int var2 = 0;
        field_a = b.h(-126);
        field_h = b.h(80);
        field_g = b.h(-125);
        field_b = b.h(86);
        for (var0 = 0; (var0 ^ -1) > -16; var0++) {
            var1 = field_a;
            var2 = var0;
            var1[var2 >> -1741755611] = de.b(var1[var2 >> -1741755611], 1 << lb.a(var2, 31));
        }
        for (var0 = 15; 31 > var0; var0++) {
            var1 = field_h;
            var2 = var0;
            var1[var2 >> 342484197] = de.b(var1[var2 >> 342484197], 1 << lb.a(31, var2));
        }
        int[] var3 = field_g;
        var3[0] = de.b(var3[0], 8);
        int[] var4 = field_g;
        var4[0] = de.b(var4[0], 128);
        int[] var5 = field_g;
        var5[0] = de.b(var5[0], 4194304);
        int[] var6 = field_b;
        var6[0] = de.b(var6[0], 1);
        int[] var7 = field_b;
        var7[0] = de.b(var7[0], 2048);
        field_i = "Creating your account";
        field_d = "Connection lost. <%0>";
    }
}
