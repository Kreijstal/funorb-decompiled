/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class coa implements ntb {
    static int[] field_d;
    lc field_e;
    boolean field_a;
    int[] field_c;
    private int[] field_b;
    static int field_f;

    final void a(byte param0) {
        int[] discarded$0 = null;
        if (param0 != -65) {
            discarded$0 = this.b(-107);
        }
        this.field_b = this.b(param0 ^ -64);
        this.field_c = this.c(0);
        this.field_a = true;
    }

    final boolean d(int param0, byte param1) {
        int var3 = this.field_b[param0];
        if (param1 != -43) {
            return true;
        }
        return this.b(var3, false);
    }

    final boolean c(int param0, int param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var3 = -81 / ((param1 - 16) / 49);
            if (-3 == (param0 ^ -1)) {
              break L1;
            } else {
              if (param0 != 7) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    private final boolean b(int param0, boolean param1) {
        ana discarded$2 = null;
        gd var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            var4 = (gd) null;
            discarded$2 = coa.a(-94, -103, 25, (gd) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-4 == (param0 ^ -1)) {
              break L2;
            } else {
              if ((param0 ^ -1) != -9) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        boolean discarded$2 = false;
        coa var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var3 = (coa) ((Object) param1);
              var3.field_b = dob.a(var3.field_b, (byte) -108, this.field_b);
              var3.field_c = dob.a(var3.field_c, (byte) -38, this.field_c);
              var3.field_a = this.field_a;
              if (param0 >= 54) {
                break L1;
              } else {
                discarded$2 = this.d(-67, (byte) -39);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3_ref);
            stackOut_3_1 = new StringBuilder().append("coa.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        coa var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var5 = (coa) ((Object) param0);
            if (param1 < -19) {
              L1: {
                var4 = 0;
                if (ikb.a(this.field_b, var5.field_b, false)) {
                  var4 = 1;
                  System.out.println("int[] voteoption_states has changed. ");
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!ikb.a(this.field_c, var5.field_c, false)) {
                  break L2;
                } else {
                  var4 = 1;
                  System.out.println("int[] componentoption_states has changed. ");
                  break L2;
                }
              }
              L3: {
                if (var5.field_a) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L3;
                }
              }
              L4: {
                stackOut_10_0 = stackIn_10_0;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (this.field_a) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L4;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L4;
                }
              }
              L5: {
                if (stackIn_13_0 != stackIn_13_1) {
                  var4 = 1;
                  System.out.println("boolean copy_to_clipboard_hidden has changed. before=" + var5.field_a + ", now=" + this.field_a);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 != 0) {
                  System.out.println("This instance of ServerInfo has changed");
                  break L6;
                } else {
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("coa.F(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, boolean param1) {
        int var3 = 0;
        if (!param1) {
          if (pr.field_c != null) {
            var3 = pr.field_c.field_g;
            if (-2 != (var3 ^ -1)) {
              if (pla.a(param0, -4)) {
                return false;
              } else {
                return true;
              }
            } else {
              L0: {
                if (!qq.a(param0, true)) {
                  break L0;
                } else {
                  if (pla.a(param0, -4)) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void a(int param0) {
        int[] var3 = null;
        boolean discarded$0 = false;
        int[] var4 = null;
        int[] var2 = null;
        if (null == this.field_b) {
            this.field_b = this.b(119);
            return;
        }
        if ((this.field_b.length ^ -1) != -32) {
            var3 = this.b(param0 + -13424);
            var2 = var3;
            this.a(this.field_b, (byte) 117, var3);
            this.field_b = var3;
        }
        if (this.field_c == null) {
            this.field_c = this.c(param0 + -13546);
            return;
        }
        if (param0 != 13546) {
            discarded$0 = this.d(-88, (byte) 56);
        }
        if (56 != this.field_c.length) {
            var4 = this.c(0);
            var2 = var4;
            this.a(this.field_c, (byte) 108, var4);
            this.field_c = var4;
        }
    }

    final boolean a(int param0, boolean param1, boolean param2) {
        int[] discarded$2 = null;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (!param2) {
            break L0;
          } else {
            discarded$2 = this.c(66);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 == 0) {
              break L2;
            } else {
              if (1 == param0) {
                break L2;
              } else {
                if ((param0 ^ -1) == -4) {
                  break L2;
                } else {
                  L3: {
                    if (!param1) {
                      break L3;
                    } else {
                      if (param0 == 5) {
                        break L2;
                      } else {
                        if (-7 == (param0 ^ -1)) {
                          break L2;
                        } else {
                          if (-9 != (param0 ^ -1)) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                }
              }
            }
          }
          stackOut_10_0 = 1;
          stackIn_12_0 = stackOut_10_0;
          break L1;
        }
        return stackIn_12_0 != 0;
    }

    public final String toString() {
        return "Voteoption states=" + fva.a(this.field_b, false) + "\nComponentoption states=" + fva.a(this.field_c, false) + "\ncopy_to_clipboard_hidden=" + this.field_a + "\nServerside: " + this.field_e;
    }

    final boolean d(int param0, int param1) {
        if (param0 != -22549) {
            this.field_e = (lc) null;
        }
        int var3 = this.field_c[param1];
        return this.c(var3, param0 + 22645);
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            field_f = -124;
        }
    }

    private final void a(int[] param0, byte param1, int[] param2) {
        boolean discarded$2 = false;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = Math.min(param2.length, param0.length);
            var5 = 0;
            L1: while (true) {
              if (var4_int <= var5) {
                L2: {
                  if (param1 >= 103) {
                    break L2;
                  } else {
                    discarded$2 = this.a(36, 79);
                    break L2;
                  }
                }
                break L0;
              } else {
                param2[var5] = param0[var5];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("coa.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final boolean a(int param0, byte param1) {
        int var3 = this.field_b[param0];
        int var4 = 22 % ((-29 - param1) / 48);
        return this.a(true, var3);
    }

    final boolean b(int param0, int param1) {
        if (param1 != 4) {
            tv var4 = (tv) null;
            this.b((byte) 119, (tv) null);
        }
        int var3 = this.field_b[param0];
        return this.c(var3, -52);
    }

    private final boolean a(int param0, int param1) {
        int[] discarded$2 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 == -8) {
            break L0;
          } else {
            discarded$2 = this.b(-5);
            break L0;
          }
        }
        L1: {
          L2: {
            if (5 == param0) {
              break L2;
            } else {
              if (6 == param0) {
                break L2;
              } else {
                if ((param0 ^ -1) == -8) {
                  break L2;
                } else {
                  if ((param0 ^ -1) != -9) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final boolean a(boolean param0, int param1, byte param2) {
        if (param2 != -84) {
            return true;
        }
        int var4 = this.field_c[param1];
        return this.a(var4, param0, false);
    }

    final static ana a(int param0, int param1, int param2, gd param3) {
        RuntimeException var4 = null;
        ana stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ana stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 100) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            stackOut_2_0 = ka.a(param1 + -193, fga.a(param3, 100, param0, param2));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("coa.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int[] b(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int[] var5 = new int[31];
        int[] var2 = var5;
        for (var3 = 0; (var3 ^ -1) > -32; var3++) {
            var5[var3] = 5;
        }
        int var6 = 0;
        var3 = var6;
        while ((var6 ^ -1) > -15) {
            var2[var6] = 4;
            var6++;
        }
        var2[4] = 5;
        var2[9] = 5;
        var2[3] = 5;
        var2[11] = 5;
        var2[12] = 5;
        var2[30] = 4;
        if (param0 <= 117) {
            this.field_c = (int[]) null;
        }
        var2[29] = 4;
        var2[1] = 5;
        return var2;
    }

    private final void b(boolean param0) {
        if (!param0) {
            field_d = (int[]) null;
        }
        this.a(13546);
    }

    public final void a(faa param0, boolean param1) {
        try {
            this.field_b = wkb.a((byte) 37, this.field_b, param0, 8);
            this.field_c = wkb.a((byte) 37, this.field_c, param0, 8);
            this.field_a = kv.a(param1, param0);
            this.b(true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "coa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(byte param0, int param1) {
        boolean discarded$0 = false;
        if (param0 > -116) {
            discarded$0 = this.c(-38, (byte) 32);
        }
        int var3 = this.field_b[param1];
        return this.a(var3, -8);
    }

    final boolean a(int param0, int param1, boolean param2) {
        int var4 = this.field_b[param0];
        if (param1 != 11) {
            this.field_c = (int[]) null;
        }
        if (!this.a(param0, false)) {
            return false;
        }
        return this.a(var4, param2, false);
    }

    public final void b(faa param0, int param1) {
        boolean discarded$13 = false;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = 8;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (null == this.field_b) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = this.field_b.length;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              pgb.a(stackIn_3_0, stackIn_3_1, 44, param0, this.field_b);
              stackOut_3_0 = 8;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (this.field_c != null) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = this.field_c.length;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              pgb.a(stackIn_6_0, stackIn_6_1, 60, param0, this.field_c);
              discarded$13 = vq.a(param0, -110, this.field_a);
              if (param1 < -109) {
                break L3;
              } else {
                this.field_e = (lc) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("coa.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final boolean b(int param0, byte param1) {
        if (param1 != 24) {
            this.a((byte) 119);
        }
        int var3 = this.field_c[param0];
        return this.a(var3, param1 ^ -32);
    }

    private final int[] c(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int[] var5 = new int[56];
        int[] var2 = var5;
        for (var3 = param0; var3 < var5.length; var3++) {
            var5[var3] = 0;
        }
        int var6 = 8;
        var3 = var6;
        while (-13 < (var6 ^ -1)) {
            var2[var6] = 5;
            var6++;
        }
        return var2;
    }

    final static boolean b(byte param0, int param1) {
        if (param0 != -117) {
            return true;
        }
        if (0 > param1) {
            return -1 == ((1 + param1) % 4 ^ -1) ? true : false;
        }
        if ((param1 ^ -1) > -1583) {
            return param1 % 4 == 0 ? true : false;
        }
        if (-1 != (param1 % 4 ^ -1)) {
            return false;
        }
        if (param1 % 100 != 0) {
            return true;
        }
        if (0 == param1 % 400) {
            return true;
        }
        return false;
    }

    final static arb a(byte[] param0, int param1) {
        arb discarded$2 = null;
        arb var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        arb stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        arb stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2 = new arb(param0, iib.field_e, so.field_f, nhb.field_o, hla.field_a, sh.field_a);
                if (param1 == 11) {
                  break L1;
                } else {
                  var3 = (byte[]) null;
                  discarded$2 = coa.a((byte[]) null, -100);
                  break L1;
                }
              }
              qqb.a(69);
              stackOut_5_0 = (arb) (var2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("coa.T(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    private final boolean a(boolean param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                if (6 != param1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final boolean c(int param0, byte param1) {
        if (param1 != 34) {
            field_d = (int[]) null;
        }
        int var3 = this.field_c[param0];
        return -5 != (var3 ^ -1) ? true : false;
    }

    public final boolean a(byte param0, tv param1) {
        coa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 55 / ((param0 - 22) / 59);
                var3 = (coa) ((Object) param1);
                if (wpb.a(var3.field_b, this.field_b, (byte) 28)) {
                  break L2;
                } else {
                  if (wpb.a(var3.field_c, this.field_c, (byte) 28)) {
                    break L2;
                  } else {
                    L3: {
                      if (this.field_a) {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        break L3;
                      } else {
                        stackOut_3_0 = 1;
                        stackIn_5_0 = stackOut_3_0;
                        break L3;
                      }
                    }
                    if (stackIn_5_0 != (var3.field_a ? 1 : 0)) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("coa.C(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_d = new int[256];
            var1 = 0;
            L0: while (true) {
              if (256 <= var1) {
                field_f = 64;
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if ((var2 ^ -1) <= -9) {
                    field_d[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((1 & var0) != 1) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> -1109173343 ^ -306674912;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
