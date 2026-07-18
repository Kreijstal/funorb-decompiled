/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends rj {
    static md field_K;
    static String[] field_F;
    static String field_I;
    private cn field_B;
    private cn field_z;
    boolean field_D;
    static int field_J;
    private cn field_C;
    static String[] field_E;
    private cn field_A;
    private boolean field_G;

    final void a(cn param0, cn param1, cn param2, cn param3, int param4) {
        try {
            this.a(-66, param0);
            ((pp) this).field_C = param1;
            if (param4 <= 15) {
                field_E = null;
            }
            ((pp) this).field_A = param3;
            ((pp) this).field_z = param2;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "pp.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var9 = DungeonAssault.field_K;
        if (param1 == 8187) {
          if (!((pp) this).field_D) {
            return;
          } else {
            if (((pp) this).field_w) {
              L0: {
                if (this == (Object) (Object) wi.field_ob) {
                  stackOut_9_0 = mo.field_a;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((pp) this).field_p;
                  stackIn_10_0 = stackOut_8_0;
                  break L0;
                }
              }
              L1: {
                var4 = stackIn_10_0;
                var5 = var4 - ((pp) this).field_m >> 2;
                if (var5 <= 64) {
                  break L1;
                } else {
                  var5 = 64;
                  break L1;
                }
              }
              var6 = var5 + (((pp) this).field_p + -mo.field_a);
              if (!((pp) this).field_G) {
                if (this != (Object) (Object) wi.field_ob) {
                  if (var6 > 0) {
                    L2: {
                      if ((Object) (Object) wi.field_ob != this) {
                        ((pp) this).field_B.h(((pp) this).field_t - -param0, param2 + ((pp) this).field_i);
                        var7 = var6;
                        ((pp) this).field_z.d(param0 + ((pp) this).field_t, param2 + ((pp) this).field_i, 4 * var7);
                        break L2;
                      } else {
                        var7 = var5;
                        ((pp) this).field_z.h(((pp) this).field_t - -param0, param2 + ((pp) this).field_i);
                        break L2;
                      }
                    }
                    L3: {
                      var8 = (int)((te.c(mo.field_a, 1, 0.015625) + 2.0) * (double)var7);
                      if (0 <= var8) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                    ((pp) this).field_C.b(((pp) this).field_t - -param0, ((pp) this).field_i - -param2, var8);
                    return;
                  } else {
                    ((pp) this).field_B.h(param0 + ((pp) this).field_t, param2 + ((pp) this).field_i);
                    return;
                  }
                } else {
                  L4: {
                    if ((Object) (Object) wi.field_ob != this) {
                      ((pp) this).field_B.h(((pp) this).field_t - -param0, param2 + ((pp) this).field_i);
                      var7 = var6;
                      ((pp) this).field_z.d(param0 + ((pp) this).field_t, param2 + ((pp) this).field_i, 4 * var7);
                      break L4;
                    } else {
                      var7 = var5;
                      ((pp) this).field_z.h(((pp) this).field_t - -param0, param2 + ((pp) this).field_i);
                      break L4;
                    }
                  }
                  L5: {
                    var8 = (int)((te.c(mo.field_a, 1, 0.015625) + 2.0) * (double)var7);
                    if (0 <= var8) {
                      break L5;
                    } else {
                      var8 = 0;
                      break L5;
                    }
                  }
                  ((pp) this).field_C.b(((pp) this).field_t - -param0, ((pp) this).field_i - -param2, var8);
                  return;
                }
              } else {
                L6: {
                  if ((Object) (Object) wi.field_ob != this) {
                    ((pp) this).field_B.h(((pp) this).field_t - -param0, param2 + ((pp) this).field_i);
                    var7 = var6;
                    ((pp) this).field_z.d(param0 + ((pp) this).field_t, param2 + ((pp) this).field_i, 4 * var7);
                    break L6;
                  } else {
                    var7 = var5;
                    ((pp) this).field_z.h(((pp) this).field_t - -param0, param2 + ((pp) this).field_i);
                    break L6;
                  }
                }
                L7: {
                  var8 = (int)((te.c(mo.field_a, 1, 0.015625) + 2.0) * (double)var7);
                  if (0 <= var8) {
                    break L7;
                  } else {
                    var8 = 0;
                    break L7;
                  }
                }
                ((pp) this).field_C.b(((pp) this).field_t - -param0, ((pp) this).field_i - -param2, var8);
                return;
              }
            } else {
              ((pp) this).field_A.h(param0 + ((pp) this).field_t, ((pp) this).field_i + param2);
              return;
            }
          }
        } else {
          return;
        }
    }

    private pp(cn param0, cn param1, cn param2, cn param3, int param4, int param5, int param6) {
        super(param4, param5, param0.field_y, param0.field_v, param6);
        try {
            ((pp) this).field_D = true;
            ((pp) this).field_z = param2;
            ((pp) this).field_A = param1;
            ((pp) this).field_B = param0;
            ((pp) this).field_C = param3;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "pp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
            ((pp) this).field_C = null;
            throw new RuntimeException("Unsupported");
        }
        throw new RuntimeException("Unsupported");
    }

    pp(cn param0, cn param1, cn param2, cn param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4, param5, 0);
    }

    private final void a(int param0, cn param1) {
        try {
            ((pp) this).field_z = param1;
            ((pp) this).field_B = param1;
            super.a(false, ((pp) this).field_B.field_y, ((pp) this).field_B.field_v);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "pp.B(" + -66 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_F = null;
        field_E = null;
        field_K = null;
        field_I = null;
    }

    final static boolean a(int param0, char param1) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        if (param0 < -15) {
          if (param1 < 48) {
            if (param1 < 65) {
              if (97 <= param1) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 <= 90) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (97 > param1) {
                      break L1;
                    } else {
                      if (param1 > 122) {
                        break L1;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param1 > 57) {
              if (param1 < 65) {
                if (97 <= param1) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L2: {
                    L3: {
                      if (97 > param1) {
                        break L3;
                      } else {
                        if (param1 > 122) {
                          break L3;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_F = null;
          if (param1 >= 48) {
            if (param1 > 57) {
              if (param1 < 65) {
                if (97 <= param1) {
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
                  L4: {
                    L5: {
                      if (97 > param1) {
                        break L5;
                      } else {
                        if (param1 > 122) {
                          break L5;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param1 < 65) {
              if (97 <= param1) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 > 90) {
                if (97 <= param1) {
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
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_I = "Go Back";
        field_E = new String[]{"Rooms", "Rooms you have not yet visited are dark. Your raiders will light torches in each new room as they enter."};
        field_J = -1;
    }
}
