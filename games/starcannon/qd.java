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
        super(-param1 + ui.field_o >> -399548895, ak.field_h + -param2 >> -1364456607, param1, param2, (de) null);
        ((qd) this).field_A = 0;
        ((qd) this).field_G = false;
        ((qd) this).field_F = param0;
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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = StarCannon.field_A;
        L0: while (true) {
          param0--;
          if (0 > param0) {
            if (param1 <= 3) {
              field_y = null;
              return;
            } else {
              return;
            }
          } else {
            var9 = param4;
            var5 = var9;
            var6 = param2;
            var7 = param3;
            var9[var6] = w.a(var9[var6] >> 1806907489, 8355711) + var7;
            param2++;
            continue L0;
          }
        }
    }

    private final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          return 107;
        } else {
          L0: {
            if (((qd) this).field_G) {
              if ((Object) (Object) ((qd) this).field_F.k(0) != this) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    final void b(int param0, byte param1, int param2) {
        if (param1 != 57) {
          ((qd) this).field_A = -103;
          ((qd) this).a(ui.field_o - param0 >> 1843154081, param0, (byte) 120, param2, -param2 + ak.field_h >> -227622495);
          return;
        } else {
          ((qd) this).a(ui.field_o - param0 >> 1843154081, param0, (byte) 120, param2, -param2 + ak.field_h >> -227622495);
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
          if ((var3 ^ -1) >= -1) {
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
          if ((var3 ^ -1) < -1) {
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
        byte[] var6 = null;
        if (param3 > 71) {
          var6 = param4.a(param0, true, param1);
          var5 = var6;
          if (var6 == null) {
            return null;
          } else {
            return new lh(new rb(var6), param2);
          }
        } else {
          return null;
        }
    }

    final static lk a(byte[] param0, byte param1) {
        int var2 = 0;
        lk var3 = null;
        if (param0 == null) {
          return null;
        } else {
          var2 = -11 % ((29 - param1) / 41);
          var3 = new lk(param0, fc.field_d, field_H, gg.field_d, gh.field_C, og.field_c);
          rc.b((byte) -49);
          return var3;
        }
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
