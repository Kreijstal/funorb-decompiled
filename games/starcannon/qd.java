/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qd extends vk {
    static int[] field_E;
    static int[] field_H;
    boolean field_G;
    static String field_y;
    static o field_D;
    static String field_C;
    private int field_A;
    private tc field_F;
    static double field_z;
    static String field_B;

    qd(tc param0, int param1, int param2) {
        super(-param1 + ui.field_o >> 1, ak.field_h + -param2 >> 1, param1, param2, (de) null);
        try {
            ((qd) this).field_A = 0;
            ((qd) this).field_G = false;
            ((qd) this).field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 != ((qd) this).field_A) {
          if (256 <= ((qd) this).field_A) {
            if (param0 != 0) {
              return;
            } else {
              ((qd) this).c(((qd) this).field_s + param1, (byte) -122, param3 + ((qd) this).field_j);
              super.a(param0, param1, (byte) 49, param3);
              return;
            }
          } else {
            if (le.field_c != null) {
              if (le.field_c.field_u >= ((qd) this).field_i) {
                if (le.field_c.field_v < ((qd) this).field_f) {
                  le.field_c = new hl(((qd) this).field_i, ((qd) this).field_f);
                  bc.a(le.field_c, 26095);
                  ki.b();
                  ((qd) this).c(0, (byte) 73, 0);
                  super.a(param0, -param1 - ((qd) this).field_s, param2, -((qd) this).field_j + -param3);
                  wf.a(param2 ^ -15);
                  le.field_c.e(param1 + ((qd) this).field_s, param3 + ((qd) this).field_j, ((qd) this).field_A);
                  return;
                } else {
                  bc.a(le.field_c, 26095);
                  ki.b();
                  ((qd) this).c(0, (byte) 73, 0);
                  super.a(param0, -param1 - ((qd) this).field_s, param2, -((qd) this).field_j + -param3);
                  wf.a(param2 ^ -15);
                  le.field_c.e(param1 + ((qd) this).field_s, param3 + ((qd) this).field_j, ((qd) this).field_A);
                  return;
                }
              } else {
                le.field_c = new hl(((qd) this).field_i, ((qd) this).field_f);
                bc.a(le.field_c, 26095);
                ki.b();
                ((qd) this).c(0, (byte) 73, 0);
                super.a(param0, -param1 - ((qd) this).field_s, param2, -((qd) this).field_j + -param3);
                wf.a(param2 ^ -15);
                le.field_c.e(param1 + ((qd) this).field_s, param3 + ((qd) this).field_j, ((qd) this).field_A);
                return;
              }
            } else {
              le.field_c = new hl(((qd) this).field_i, ((qd) this).field_f);
              bc.a(le.field_c, 26095);
              ki.b();
              ((qd) this).c(0, (byte) 73, 0);
              super.a(param0, -param1 - ((qd) this).field_s, param2, -((qd) this).field_j + -param3);
              wf.a(param2 ^ -15);
              le.field_c.e(param1 + ((qd) this).field_s, param3 + ((qd) this).field_j, ((qd) this).field_A);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        fd.field_c = 1000000000L / (long)param1;
        if (param0 != 1) {
            qd.a(-81, -48);
        }
    }

    abstract void c(int param0, byte param1, int param2);

    boolean i(int param0) {
        Object var3 = null;
        if (param0 < -121) {
          ((qd) this).field_A = this.a(0);
          if (((qd) this).field_A == 0) {
            if (((qd) this).field_G) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          lk discarded$2 = qd.a((byte[]) null, (byte) -3);
          ((qd) this).field_A = this.a(0);
          if (((qd) this).field_A == 0) {
            if (((qd) this).field_G) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final uj h(int param0) {
        uj var2 = super.h(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (uj) this;
    }

    public static void h(byte param0) {
        field_H = null;
        field_E = null;
        field_B = null;
        field_D = null;
        field_y = null;
        field_C = null;
        if (param0 != -37) {
            qd.h((byte) -24);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            L1: while (true) {
              param0--;
              if (0 > param0) {
                if (param1 > 3) {
                  break L0;
                } else {
                  field_y = null;
                  return;
                }
              } else {
                var9 = param4;
                var5 = var9;
                var6 = param2;
                var7 = param3;
                var9[var6] = w.a(var9[var6] >> 1, 8355711) + var7;
                param2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("qd.TA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    private final int a(int param0) {
        return !((qd) this).field_G ? 0 : (Object) (Object) ((qd) this).field_F.k(0) == this ? 256 : 0;
    }

    final void b(int param0, byte param1, int param2) {
        if (param1 != 57) {
          ((qd) this).field_A = -103;
          ((qd) this).a(ui.field_o - param0 >> 1, param0, (byte) 120, param2, -param2 + ak.field_h >> 1);
          return;
        } else {
          ((qd) this).a(ui.field_o - param0 >> 1, param0, (byte) 120, param2, -param2 + ak.field_h >> 1);
          return;
        }
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        var2 = this.a(0);
        var3 = var2 - ((qd) this).field_A;
        if (param0 == -124) {
          if (var3 <= 0) {
            if (0 > var3) {
              L0: {
                L1: {
                  ((qd) this).field_A = ((qd) this).field_A + (var3 - 15) / 16;
                  if (0 != ((qd) this).field_A) {
                    break L1;
                  } else {
                    if (var2 != 0) {
                      break L1;
                    } else {
                      if (((qd) this).field_G) {
                        break L1;
                      } else {
                        stackOut_57_0 = 1;
                        stackIn_59_0 = stackOut_57_0;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_58_0 = 0;
                stackIn_59_0 = stackOut_58_0;
                break L0;
              }
              return stackIn_59_0 != 0;
            } else {
              L2: {
                L3: {
                  if (0 != ((qd) this).field_A) {
                    break L3;
                  } else {
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (((qd) this).field_G) {
                        break L3;
                      } else {
                        stackOut_51_0 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        break L2;
                      }
                    }
                  }
                }
                stackOut_52_0 = 0;
                stackIn_53_0 = stackOut_52_0;
                break L2;
              }
              return stackIn_53_0 != 0;
            }
          } else {
            ((qd) this).field_A = ((qd) this).field_A + (-1 + (var3 + 8)) / 8;
            if (0 > var3) {
              L4: {
                L5: {
                  ((qd) this).field_A = ((qd) this).field_A + (var3 - 15) / 16;
                  if (0 != ((qd) this).field_A) {
                    break L5;
                  } else {
                    if (var2 != 0) {
                      break L5;
                    } else {
                      if (((qd) this).field_G) {
                        break L5;
                      } else {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_44_0 = 0;
                stackIn_45_0 = stackOut_44_0;
                break L4;
              }
              return stackIn_45_0 != 0;
            } else {
              L6: {
                L7: {
                  if (0 != ((qd) this).field_A) {
                    break L7;
                  } else {
                    if (var2 != 0) {
                      break L7;
                    } else {
                      if (((qd) this).field_G) {
                        break L7;
                      } else {
                        stackOut_37_0 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        break L6;
                      }
                    }
                  }
                }
                stackOut_38_0 = 0;
                stackIn_39_0 = stackOut_38_0;
                break L6;
              }
              return stackIn_39_0 != 0;
            }
          }
        } else {
          field_E = null;
          if (var3 > 0) {
            ((qd) this).field_A = ((qd) this).field_A + (-1 + (var3 + 8)) / 8;
            if (0 <= var3) {
              L8: {
                L9: {
                  if (0 != ((qd) this).field_A) {
                    break L9;
                  } else {
                    if (var2 != 0) {
                      break L9;
                    } else {
                      if (((qd) this).field_G) {
                        break L9;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        break L8;
                      }
                    }
                  }
                }
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L8;
              }
              return stackIn_30_0 != 0;
            } else {
              L10: {
                L11: {
                  ((qd) this).field_A = ((qd) this).field_A + (var3 - 15) / 16;
                  if (0 != ((qd) this).field_A) {
                    break L11;
                  } else {
                    if (var2 != 0) {
                      break L11;
                    } else {
                      if (((qd) this).field_G) {
                        break L11;
                      } else {
                        stackOut_22_0 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        break L10;
                      }
                    }
                  }
                }
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L10;
              }
              return stackIn_24_0 != 0;
            }
          } else {
            if (0 > var3) {
              ((qd) this).field_A = ((qd) this).field_A + (var3 - 15) / 16;
              if (0 == ((qd) this).field_A) {
                if (var2 != 0) {
                  return false;
                } else {
                  L12: {
                    if (((qd) this).field_G) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L12;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      break L12;
                    }
                  }
                  return stackIn_15_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              L13: {
                L14: {
                  if (0 != ((qd) this).field_A) {
                    break L14;
                  } else {
                    if (var2 != 0) {
                      break L14;
                    } else {
                      if (((qd) this).field_G) {
                        break L14;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L13;
                      }
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L13;
              }
              return stackIn_8_0 != 0;
            }
          }
        }
    }

    final static lh a(int param0, int param1, ja param2, byte param3, ue param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        lh stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param3 > 71) {
              var6 = param4.a(param0, true, param1);
              var5 = var6;
              if (var6 != null) {
                stackOut_6_0 = new lh(new rb(var6), param2);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (lh) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (lh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("qd.KA(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    final static lk a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        lk var3 = null;
        lk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2_int = -11 % ((29 - param1) / 41);
              var3 = new lk(param0, fc.field_d, field_H, gg.field_d, gh.field_C, og.field_c);
              rc.b((byte) -49);
              stackOut_3_0 = (lk) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("qd.VA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new int[6];
        field_y = "Your shield will automatically deflect any single contact with an enemy or bullet, after which, it needs time to recharge.";
        field_C = "Account created successfully!";
        field_D = new o(2, 4, 4, 0);
        field_z = Math.atan2(1.0, 0.0);
        field_B = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
