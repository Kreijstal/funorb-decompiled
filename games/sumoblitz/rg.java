/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rg extends sp {
    boolean field_D;
    dg field_E;
    private int field_B;
    static iw field_A;
    static int[] field_C;

    rg(dg param0, int param1, int param2) {
        super(lj.field_b - param1 >> 1264137313, cv.field_O + -param2 >> 1258340289, param1, param2, (mh) null);
        ((rg) this).field_D = false;
        ((rg) this).field_B = 0;
        ((rg) this).field_E = param0;
    }

    public static void e(byte param0) {
        field_A = null;
        int var1 = 68 / ((1 - param0) / 63);
        field_C = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (((rg) this).field_B != -1) {
          if (-257 > ((rg) this).field_B) {
            if (null != uw.field_a) {
              if (uw.field_a.field_x >= ((rg) this).field_q) {
                if (((rg) this).field_p <= uw.field_a.field_u) {
                  jq.a(7161, uw.field_a);
                  lk.b();
                  ((rg) this).b(113, 0, 0);
                  if (param2 >= -35) {
                    pk discarded$4 = ((rg) this).f(-77);
                    super.a(-param0 + -((rg) this).field_r, -param1 + -((rg) this).field_v, (byte) -114, param3);
                    su.a((byte) 114);
                    uw.field_a.a(param0 - -((rg) this).field_r, param1 - -((rg) this).field_v, ((rg) this).field_B);
                    return;
                  } else {
                    super.a(-param0 + -((rg) this).field_r, -param1 + -((rg) this).field_v, (byte) -114, param3);
                    su.a((byte) 114);
                    uw.field_a.a(param0 - -((rg) this).field_r, param1 - -((rg) this).field_v, ((rg) this).field_B);
                    return;
                  }
                } else {
                  uw.field_a = new wb(((rg) this).field_q, ((rg) this).field_p);
                  jq.a(7161, uw.field_a);
                  lk.b();
                  ((rg) this).b(113, 0, 0);
                  if (param2 >= -35) {
                    pk discarded$5 = ((rg) this).f(-77);
                    super.a(-param0 + -((rg) this).field_r, -param1 + -((rg) this).field_v, (byte) -114, param3);
                    su.a((byte) 114);
                    uw.field_a.a(param0 - -((rg) this).field_r, param1 - -((rg) this).field_v, ((rg) this).field_B);
                    return;
                  } else {
                    super.a(-param0 + -((rg) this).field_r, -param1 + -((rg) this).field_v, (byte) -114, param3);
                    su.a((byte) 114);
                    uw.field_a.a(param0 - -((rg) this).field_r, param1 - -((rg) this).field_v, ((rg) this).field_B);
                    return;
                  }
                }
              } else {
                uw.field_a = new wb(((rg) this).field_q, ((rg) this).field_p);
                jq.a(7161, uw.field_a);
                lk.b();
                ((rg) this).b(113, 0, 0);
                if (param2 >= -35) {
                  pk discarded$6 = ((rg) this).f(-77);
                  super.a(-param0 + -((rg) this).field_r, -param1 + -((rg) this).field_v, (byte) -114, param3);
                  su.a((byte) 114);
                  uw.field_a.a(param0 - -((rg) this).field_r, param1 - -((rg) this).field_v, ((rg) this).field_B);
                  return;
                } else {
                  super.a(-param0 + -((rg) this).field_r, -param1 + -((rg) this).field_v, (byte) -114, param3);
                  su.a((byte) 114);
                  uw.field_a.a(param0 - -((rg) this).field_r, param1 - -((rg) this).field_v, ((rg) this).field_B);
                  return;
                }
              }
            } else {
              uw.field_a = new wb(((rg) this).field_q, ((rg) this).field_p);
              jq.a(7161, uw.field_a);
              lk.b();
              ((rg) this).b(113, 0, 0);
              if (param2 >= -35) {
                pk discarded$7 = ((rg) this).f(-77);
                super.a(-param0 + -((rg) this).field_r, -param1 + -((rg) this).field_v, (byte) -114, param3);
                su.a((byte) 114);
                uw.field_a.a(param0 - -((rg) this).field_r, param1 - -((rg) this).field_v, ((rg) this).field_B);
                return;
              } else {
                super.a(-param0 + -((rg) this).field_r, -param1 + -((rg) this).field_v, (byte) -114, param3);
                su.a((byte) 114);
                uw.field_a.a(param0 - -((rg) this).field_r, param1 - -((rg) this).field_v, ((rg) this).field_B);
                return;
              }
            }
          } else {
            if (param3 != 0) {
              return;
            } else {
              ((rg) this).b(117, param0 + ((rg) this).field_r, param1 + ((rg) this).field_v);
              super.a(param0, param1, (byte) -112, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean g(int param0) {
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
        if (param0 == -28778) {
          var2 = this.a((byte) -100);
          var3 = var2 + -((rg) this).field_B;
          if ((var3 ^ -1) >= -1) {
            if (var3 < 0) {
              L0: {
                L1: {
                  ((rg) this).field_B = ((rg) this).field_B + (1 + var3 + -16) / 16;
                  if (0 != ((rg) this).field_B) {
                    break L1;
                  } else {
                    if (var2 != 0) {
                      break L1;
                    } else {
                      if (((rg) this).field_D) {
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
                  if (0 != ((rg) this).field_B) {
                    break L3;
                  } else {
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (((rg) this).field_D) {
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
            ((rg) this).field_B = ((rg) this).field_B + (7 + var3) / 8;
            if (var3 < 0) {
              L4: {
                L5: {
                  ((rg) this).field_B = ((rg) this).field_B + (1 + var3 + -16) / 16;
                  if (0 != ((rg) this).field_B) {
                    break L5;
                  } else {
                    if (var2 != 0) {
                      break L5;
                    } else {
                      if (((rg) this).field_D) {
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
                  if (0 != ((rg) this).field_B) {
                    break L7;
                  } else {
                    if (var2 != 0) {
                      break L7;
                    } else {
                      if (((rg) this).field_D) {
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
          ((rg) this).field_E = null;
          var2 = this.a((byte) -100);
          var3 = var2 + -((rg) this).field_B;
          if ((var3 ^ -1) < -1) {
            ((rg) this).field_B = ((rg) this).field_B + (7 + var3) / 8;
            if (var3 >= 0) {
              L8: {
                L9: {
                  if (0 != ((rg) this).field_B) {
                    break L9;
                  } else {
                    if (var2 != 0) {
                      break L9;
                    } else {
                      if (((rg) this).field_D) {
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
                  ((rg) this).field_B = ((rg) this).field_B + (1 + var3 + -16) / 16;
                  if (0 != ((rg) this).field_B) {
                    break L11;
                  } else {
                    if (var2 != 0) {
                      break L11;
                    } else {
                      if (((rg) this).field_D) {
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
            if (var3 < 0) {
              ((rg) this).field_B = ((rg) this).field_B + (1 + var3 + -16) / 16;
              if (0 == ((rg) this).field_B) {
                if (var2 != 0) {
                  return false;
                } else {
                  L12: {
                    if (((rg) this).field_D) {
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
                  if (0 != ((rg) this).field_B) {
                    break L14;
                  } else {
                    if (var2 != 0) {
                      break L14;
                    } else {
                      if (((rg) this).field_D) {
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

    final static boolean a(int param0, char param1) {
        int var2 = 0;
        var2 = -62 % ((-58 - param0) / 63);
        if (65 > param1) {
          if (param1 >= 97) {
            if (param1 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (param1 > 90) {
            if (param1 >= 97) {
              if (param1 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    boolean h(int param0) {
        if (param0 == 0) {
          ((rg) this).field_B = this.a((byte) -100);
          if (0 == ((rg) this).field_B) {
            if (((rg) this).field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param2 < 37) {
          field_A = null;
          ((rg) this).a(106, lj.field_b - param0 >> -1058313983, -param1 + cv.field_O >> -1017172895, param1, param0);
          return;
        } else {
          ((rg) this).a(106, lj.field_b - param0 >> -1058313983, -param1 + cv.field_O >> -1017172895, param1, param0);
          return;
        }
    }

    abstract void b(int param0, int param1, int param2);

    final pk f(int param0) {
        pk var2 = super.f(-105);
        int var3 = -113 / ((param0 - -25) / 58);
        if (!(var2 == null)) {
            return var2;
        }
        return (pk) this;
    }

    final static void a(byte param0, int param1) {
        int discarded$4 = se.a(19886);
        if (param0 != 55) {
            boolean discarded$5 = rg.a(124, 'r');
        }
    }

    private final int a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -100) {
          return -55;
        } else {
          L0: {
            if (((rg) this).field_D) {
              if ((Object) (Object) ((rg) this).field_E.e((byte) 54) == this) {
                stackOut_5_0 = 256;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new iw(1);
        field_C = new int[1024];
    }
}
