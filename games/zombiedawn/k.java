/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends vf {
    static String field_r;
    static int field_t;
    private v[] field_s;

    public static void c(int param0) {
        field_r = null;
        int var1 = 0;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        v var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              bi.c(param4 - -param3.field_k, param3.field_j + param2, param3.field_i, param3.field_n, 10197915);
              if (param1) {
                if (((an) (Object) param3).field_x) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 0;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param1) {
                if (param3.e(-17741)) {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_12_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_12_0;
              var8 = 0;
              if (var6_int != 0) {
                stackOut_14_0 = 2394342;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 16777215;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_15_0;
              if (var7 != 0) {
                var8 = var8 | 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var6_int != 0) {
                var8 = var8 | 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var10 = ((k) this).field_s[var8];
              var11 = (-var10.field_j + param3.field_i) / 2 + (param4 + param3.field_k);
              var12 = (-var10.field_d + param3.field_n) / 2 + (param2 - -param3.field_j);
              var13 = param3.field_k + (param4 + param3.field_i / 2);
              if (param0 == 16777215) {
                break L6;
              } else {
                int discarded$1 = k.a(-100, -115);
                break L6;
              }
            }
            var10.a(var11, var12);
            ((k) this).field_m.a(((k) this).b(12307, param3), var13, param2, var9, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6;
            stackOut_25_1 = new StringBuilder().append("k.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        hi.field_O = null;
        if (param1 == 50) {
          sb.field_a = null;
          jd.field_a = 0;
          var2 = bd.field_j;
          bd.field_j = qj.field_e;
          qj.field_e = var2;
          if (param0 == 51) {
            tf.field_c.field_e = 2;
            tf.field_c.field_h = tf.field_c.field_h + 1;
            if (tf.field_c.field_h < 2) {
              L0: {
                if (2 > tf.field_c.field_h) {
                  break L0;
                } else {
                  if (50 != param0) {
                    break L0;
                  } else {
                    return 5;
                  }
                }
              }
              if (tf.field_c.field_h < 4) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param0 == 51) {
                return 2;
              } else {
                L1: {
                  if (2 > tf.field_c.field_h) {
                    break L1;
                  } else {
                    if (50 != param0) {
                      break L1;
                    } else {
                      return 5;
                    }
                  }
                }
                if (tf.field_c.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (param0 == 50) {
              tf.field_c.field_e = 5;
              tf.field_c.field_h = tf.field_c.field_h + 1;
              if (tf.field_c.field_h < 2) {
                L2: {
                  if (2 > tf.field_c.field_h) {
                    break L2;
                  } else {
                    if (50 != param0) {
                      break L2;
                    } else {
                      return 5;
                    }
                  }
                }
                if (tf.field_c.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param0 == 51) {
                  return 2;
                } else {
                  L3: {
                    if (2 > tf.field_c.field_h) {
                      break L3;
                    } else {
                      if (50 != param0) {
                        break L3;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (tf.field_c.field_h < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              tf.field_c.field_e = 1;
              tf.field_c.field_h = tf.field_c.field_h + 1;
              if (tf.field_c.field_h < 2) {
                L4: {
                  if (2 > tf.field_c.field_h) {
                    break L4;
                  } else {
                    if (50 != param0) {
                      break L4;
                    } else {
                      return 5;
                    }
                  }
                }
                if (tf.field_c.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param0 == 51) {
                  return 2;
                } else {
                  L5: {
                    if (2 > tf.field_c.field_h) {
                      break L5;
                    } else {
                      if (50 != param0) {
                        break L5;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (tf.field_c.field_h < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        } else {
          field_r = null;
          sb.field_a = null;
          jd.field_a = 0;
          var2 = bd.field_j;
          bd.field_j = qj.field_e;
          qj.field_e = var2;
          if (param0 == 51) {
            tf.field_c.field_e = 2;
            tf.field_c.field_h = tf.field_c.field_h + 1;
            if (tf.field_c.field_h >= 2) {
              if (param0 == 51) {
                return 2;
              } else {
                if (2 <= tf.field_c.field_h) {
                  if (50 != param0) {
                    if (tf.field_c.field_h < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  if (tf.field_c.field_h < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (2 <= tf.field_c.field_h) {
                if (50 == param0) {
                  return 5;
                } else {
                  if (tf.field_c.field_h < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              } else {
                if (tf.field_c.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (param0 == 50) {
              tf.field_c.field_e = 5;
              tf.field_c.field_h = tf.field_c.field_h + 1;
              if (tf.field_c.field_h >= 2) {
                if (param0 == 51) {
                  return 2;
                } else {
                  if (2 <= tf.field_c.field_h) {
                    if (50 != param0) {
                      if (tf.field_c.field_h < 4) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (tf.field_c.field_h < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                L6: {
                  if (2 > tf.field_c.field_h) {
                    break L6;
                  } else {
                    if (50 != param0) {
                      break L6;
                    } else {
                      return 5;
                    }
                  }
                }
                if (tf.field_c.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              tf.field_c.field_e = 1;
              tf.field_c.field_h = tf.field_c.field_h + 1;
              if (tf.field_c.field_h >= 2) {
                if (param0 == 51) {
                  return 2;
                } else {
                  if (2 <= tf.field_c.field_h) {
                    if (50 != param0) {
                      if (tf.field_c.field_h < 4) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (tf.field_c.field_h < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                L7: {
                  if (2 > tf.field_c.field_h) {
                    break L7;
                  } else {
                    if (50 != param0) {
                      break L7;
                    } else {
                      return 5;
                    }
                  }
                }
                if (tf.field_c.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        }
    }

    k(v[] param0) {
        try {
            ((k) this).field_s = param0;
            ((k) this).field_m = ia.field_e;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Friends can be added in multiplayer<nbsp>games";
    }
}
