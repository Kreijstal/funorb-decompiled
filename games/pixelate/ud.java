/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ud extends ch {
    static String field_O;
    private int field_J;
    static up[] field_I;
    boolean field_N;
    private kn field_M;
    static int[] field_L;
    static boolean field_K;

    abstract void a(int param0, int param1, boolean param2);

    final ng k(int param0) {
        ng var2 = super.k(48);
        int var3 = -47 / ((-51 - param0) / 39);
        if (!(var2 == null)) {
            return var2;
        }
        return (ng) this;
    }

    boolean a(byte param0) {
        ((ud) this).field_J = this.d(false);
        if (param0 >= 120) {
          if (0 == ((ud) this).field_J) {
            if (((ud) this).field_N) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_L = null;
          if (0 == ((ud) this).field_J) {
            if (((ud) this).field_N) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final int d(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_L = null;
            if (((ud) this).field_N) {
              if (this != (Object) (Object) ((ud) this).field_M.n(640)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_12_0 = stackOut_8_0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (((ud) this).field_N) {
              if (this != (Object) (Object) ((ud) this).field_M.n(640)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    ud(kn param0, int param1, int param2) {
        super(kn.field_O + -param1 >> 1, sl.field_c + -param2 >> 1, param1, param2, (eb) null);
        try {
            ((ud) this).field_M = param0;
            ((ud) this).field_N = false;
            ((ud) this).field_J = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_L = null;
        field_O = null;
        field_I = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        if (((ud) this).field_J != 0) {
          if (256 > ((ud) this).field_J) {
            if (null != fd.field_a) {
              if (fd.field_a.field_F >= ((ud) this).field_E) {
                if (((ud) this).field_C <= fd.field_a.field_E) {
                  h.a(-90, fd.field_a);
                  t.d();
                  ((ud) this).a(0, 0, true);
                  super.a(-((ud) this).field_p + -param0, param1, -param2 - ((ud) this).field_z, (byte) -61);
                  var5 = -94 / ((param3 - 70) / 49);
                  ia.a((byte) 92);
                  fd.field_a.a(((ud) this).field_z + param2, ((ud) this).field_p + param0, ((ud) this).field_J);
                  return;
                } else {
                  fd.field_a = new tf(((ud) this).field_E, ((ud) this).field_C);
                  h.a(-90, fd.field_a);
                  t.d();
                  ((ud) this).a(0, 0, true);
                  super.a(-((ud) this).field_p + -param0, param1, -param2 - ((ud) this).field_z, (byte) -61);
                  var5 = -94 / ((param3 - 70) / 49);
                  ia.a((byte) 92);
                  fd.field_a.a(((ud) this).field_z + param2, ((ud) this).field_p + param0, ((ud) this).field_J);
                  return;
                }
              } else {
                fd.field_a = new tf(((ud) this).field_E, ((ud) this).field_C);
                h.a(-90, fd.field_a);
                t.d();
                ((ud) this).a(0, 0, true);
                super.a(-((ud) this).field_p + -param0, param1, -param2 - ((ud) this).field_z, (byte) -61);
                var5 = -94 / ((param3 - 70) / 49);
                ia.a((byte) 92);
                fd.field_a.a(((ud) this).field_z + param2, ((ud) this).field_p + param0, ((ud) this).field_J);
                return;
              }
            } else {
              fd.field_a = new tf(((ud) this).field_E, ((ud) this).field_C);
              h.a(-90, fd.field_a);
              t.d();
              ((ud) this).a(0, 0, true);
              super.a(-((ud) this).field_p + -param0, param1, -param2 - ((ud) this).field_z, (byte) -61);
              var5 = -94 / ((param3 - 70) / 49);
              ia.a((byte) 92);
              fd.field_a.a(((ud) this).field_z + param2, ((ud) this).field_p + param0, ((ud) this).field_J);
              return;
            }
          } else {
            if (param1 != 0) {
              return;
            } else {
              ((ud) this).a(param2 - -((ud) this).field_z, param0 - -((ud) this).field_p, true);
              super.a(param0, param1, param2, (byte) 119);
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (!param0) {
          var2 = this.d(param0);
          var3 = -((ud) this).field_J + var2;
          if (var3 <= 0) {
            if (var3 >= 0) {
              L0: {
                L1: {
                  if (((ud) this).field_J != 0) {
                    break L1;
                  } else {
                    if (var2 != 0) {
                      break L1;
                    } else {
                      if (((ud) this).field_N) {
                        break L1;
                      } else {
                        stackOut_54_0 = 1;
                        stackIn_56_0 = stackOut_54_0;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_55_0 = 0;
                stackIn_56_0 = stackOut_55_0;
                break L0;
              }
              return stackIn_56_0 != 0;
            } else {
              L2: {
                L3: {
                  ((ud) this).field_J = ((ud) this).field_J + (-16 + (var3 + 1)) / 16;
                  if (((ud) this).field_J != 0) {
                    break L3;
                  } else {
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (((ud) this).field_N) {
                        break L3;
                      } else {
                        stackOut_48_0 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        break L2;
                      }
                    }
                  }
                }
                stackOut_49_0 = 0;
                stackIn_50_0 = stackOut_49_0;
                break L2;
              }
              return stackIn_50_0 != 0;
            }
          } else {
            ((ud) this).field_J = ((ud) this).field_J + (7 + var3) / 8;
            if (var3 >= 0) {
              L4: {
                L5: {
                  if (((ud) this).field_J != 0) {
                    break L5;
                  } else {
                    if (var2 != 0) {
                      break L5;
                    } else {
                      if (((ud) this).field_N) {
                        break L5;
                      } else {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_42_0 = 0;
                stackIn_43_0 = stackOut_42_0;
                break L4;
              }
              return stackIn_43_0 != 0;
            } else {
              L6: {
                L7: {
                  ((ud) this).field_J = ((ud) this).field_J + (-16 + (var3 + 1)) / 16;
                  if (((ud) this).field_J != 0) {
                    break L7;
                  } else {
                    if (var2 != 0) {
                      break L7;
                    } else {
                      if (((ud) this).field_N) {
                        break L7;
                      } else {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        break L6;
                      }
                    }
                  }
                }
                stackOut_36_0 = 0;
                stackIn_37_0 = stackOut_36_0;
                break L6;
              }
              return stackIn_37_0 != 0;
            }
          }
        } else {
          ((ud) this).a(-46, -6, false);
          var2 = this.d(param0);
          var3 = -((ud) this).field_J + var2;
          if (var3 > 0) {
            ((ud) this).field_J = ((ud) this).field_J + (7 + var3) / 8;
            if (var3 < 0) {
              L8: {
                L9: {
                  ((ud) this).field_J = ((ud) this).field_J + (-16 + (var3 + 1)) / 16;
                  if (((ud) this).field_J != 0) {
                    break L9;
                  } else {
                    if (var2 != 0) {
                      break L9;
                    } else {
                      if (((ud) this).field_N) {
                        break L9;
                      } else {
                        stackOut_27_0 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        break L8;
                      }
                    }
                  }
                }
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L8;
              }
              return stackIn_29_0 != 0;
            } else {
              L10: {
                L11: {
                  if (((ud) this).field_J != 0) {
                    break L11;
                  } else {
                    if (var2 != 0) {
                      break L11;
                    } else {
                      if (((ud) this).field_N) {
                        break L11;
                      } else {
                        stackOut_21_0 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        break L10;
                      }
                    }
                  }
                }
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L10;
              }
              return stackIn_23_0 != 0;
            }
          } else {
            if (var3 >= 0) {
              L12: {
                L13: {
                  if (((ud) this).field_J != 0) {
                    break L13;
                  } else {
                    if (var2 != 0) {
                      break L13;
                    } else {
                      if (((ud) this).field_N) {
                        break L13;
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        break L12;
                      }
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L12;
              }
              return stackIn_16_0 != 0;
            } else {
              ((ud) this).field_J = ((ud) this).field_J + (-16 + (var3 + 1)) / 16;
              if (((ud) this).field_J == 0) {
                if (var2 == 0) {
                  L14: {
                    if (((ud) this).field_N) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L14;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L14;
                    }
                  }
                  return stackIn_10_0 != 0;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        ((ud) this).a(param2, (byte) 88, -param0 + sl.field_c >> 1, kn.field_O - param2 >> 1, param0);
        if (param1 != -110) {
            field_K = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new up[50];
        field_L = new int[4];
        field_O = "<%0> wants to join";
        field_K = false;
    }
}
