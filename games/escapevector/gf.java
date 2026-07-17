/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    int field_j;
    private int field_h;
    int field_k;
    private int field_i;
    static fd field_e;
    int field_m;
    private int field_c;
    private int field_l;
    private int field_d;
    private int field_f;
    static ni field_b;
    static int field_a;
    int field_g;
    private boolean field_n;

    private final int a(int param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (mj.field_d < ((gf) this).field_l) {
            stackOut_2_0 = -mj.field_d + ((gf) this).field_l;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 >= -40) {
          return 14;
        } else {
          return var2;
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = EscapeVector.field_A;
        qk.field_g = null;
        rh.field_I = null;
        ke.field_b = 0;
        var2 = kl.field_n;
        kl.field_n = tl.field_l;
        tl.field_l = var2;
        if (param0 == -78) {
          od.field_j.field_g = od.field_j.field_g + 1;
          if (param1 != 51) {
            if (param1 != 50) {
              L0: {
                od.field_j.field_d = 1;
                if (od.field_j.field_g < 2) {
                  break L0;
                } else {
                  if (param1 != 51) {
                    break L0;
                  } else {
                    return 2;
                  }
                }
              }
              if (od.field_j.field_g < 2) {
                if (od.field_j.field_g < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (od.field_j.field_g < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              L1: {
                od.field_j.field_d = 5;
                if (od.field_j.field_g < 2) {
                  break L1;
                } else {
                  if (param1 != 51) {
                    break L1;
                  } else {
                    return 2;
                  }
                }
              }
              if (od.field_j.field_g < 2) {
                if (od.field_j.field_g < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (od.field_j.field_g < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            L2: {
              od.field_j.field_d = 2;
              if (od.field_j.field_g < 2) {
                break L2;
              } else {
                if (param1 != 51) {
                  break L2;
                } else {
                  return 2;
                }
              }
            }
            if (od.field_j.field_g < 2) {
              if (od.field_j.field_g < 4) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param1 == 50) {
                return 5;
              } else {
                if (od.field_j.field_g < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        } else {
          var4 = null;
          tg discarded$1 = gf.a((String) null, (byte) 43);
          od.field_j.field_g = od.field_j.field_g + 1;
          if (param1 != 51) {
            if (param1 != 50) {
              od.field_j.field_d = 1;
              if (od.field_j.field_g >= 2) {
                if (param1 == 51) {
                  return 2;
                } else {
                  L3: {
                    if (od.field_j.field_g < 2) {
                      break L3;
                    } else {
                      if (param1 == 50) {
                        return 5;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (od.field_j.field_g < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              } else {
                L4: {
                  if (od.field_j.field_g < 2) {
                    break L4;
                  } else {
                    if (param1 == 50) {
                      return 5;
                    } else {
                      break L4;
                    }
                  }
                }
                if (od.field_j.field_g < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              od.field_j.field_d = 5;
              if (od.field_j.field_g >= 2) {
                if (param1 == 51) {
                  return 2;
                } else {
                  L5: {
                    if (od.field_j.field_g < 2) {
                      break L5;
                    } else {
                      if (param1 == 50) {
                        return 5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (od.field_j.field_g < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              } else {
                L6: {
                  if (od.field_j.field_g < 2) {
                    break L6;
                  } else {
                    if (param1 == 50) {
                      return 5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (od.field_j.field_g < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            od.field_j.field_d = 2;
            if (od.field_j.field_g >= 2) {
              if (param1 == 51) {
                return 2;
              } else {
                L7: {
                  if (od.field_j.field_g < 2) {
                    break L7;
                  } else {
                    if (param1 == 50) {
                      return 5;
                    } else {
                      break L7;
                    }
                  }
                }
                if (od.field_j.field_g < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              L8: {
                if (od.field_j.field_g < 2) {
                  break L8;
                } else {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    break L8;
                  }
                }
              }
              if (od.field_j.field_g < 4) {
                return -1;
              } else {
                return 1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((gf) this).field_i = param3;
        if (param0 != 15135) {
          ((gf) this).field_k = 79;
          ((gf) this).field_d = param1;
          ((gf) this).field_f = param2;
          return;
        } else {
          ((gf) this).field_d = param1;
          ((gf) this).field_f = param2;
          return;
        }
    }

    private final int a(byte param0) {
        int var2 = this.a(-73);
        int var3 = ((gf) this).field_l > var2 ? (-var2 + ((gf) this).field_l) * ((gf) this).field_h / ((gf) this).field_l : 0;
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param5 > -127) {
          ((gf) this).a(98, -122, -22, -60, -56, (byte) -128);
          ((gf) this).a(15135, param4, param2, param0);
          ((gf) this).field_h = param3;
          ((gf) this).field_c = param1;
          ((gf) this).field_n = true;
          return;
        } else {
          ((gf) this).a(15135, param4, param2, param0);
          ((gf) this).field_h = param3;
          ((gf) this).field_c = param1;
          ((gf) this).field_n = true;
          return;
        }
    }

    final static tg a(String param0, byte param1) {
        Object var2 = null;
        tg var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        tg stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        tg stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            if (null != ml.field_a) {
              L1: {
                var6 = (CharSequence) (Object) param0;
                var2 = (Object) (Object) sf.a(-104, var6);
                if (var2 == null) {
                  var2 = (Object) (Object) var6;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = (tg) (Object) ml.field_a.a(-82, (long)((String) var2).hashCode());
              L2: while (true) {
                if (var3 == null) {
                  var4 = -98 / ((param1 - -63) / 57);
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L3: {
                    var7 = (CharSequence) (Object) var3.field_ob;
                    var4_ref_String = sf.a(-75, var7);
                    if (var4_ref_String == null) {
                      var4_ref_String = var3.field_ob;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (!var4_ref_String.equals(var2)) {
                    var3 = (tg) (Object) ml.field_a.a((byte) -36);
                    continue L2;
                  } else {
                    stackOut_13_0 = (tg) var3;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (tg) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_18_0 = var2;
            stackOut_18_1 = new StringBuilder().append("gf.F(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return (tg) (Object) stackIn_17_0;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var2 = ((gf) this).field_g + ((gf) this).field_j;
        if (param0 >= 32) {
          var3 = ((gf) this).field_m + ((gf) this).field_k;
          var4 = this.a(-41);
          if (((gf) this).field_n) {
            var5 = this.a((byte) -57);
            eh.a(var5, ((gf) this).field_j, ((gf) this).field_k, ((gf) this).field_i, ((gf) this).field_f, var3, -3, var2, ((gf) this).field_d, ((gf) this).field_c, var4);
            return;
          } else {
            fc.a(var4, ((gf) this).field_j, var2, var3, true, 29788, false, ((gf) this).field_d, ((gf) this).field_i, ((gf) this).field_f, ((gf) this).field_k, true);
            return;
          }
        } else {
          ((gf) this).field_c = -56;
          var3 = ((gf) this).field_m + ((gf) this).field_k;
          var4 = this.a(-41);
          if (((gf) this).field_n) {
            var5 = this.a((byte) -57);
            eh.a(var5, ((gf) this).field_j, ((gf) this).field_k, ((gf) this).field_i, ((gf) this).field_f, var3, -3, var2, ((gf) this).field_d, ((gf) this).field_c, var4);
            return;
          } else {
            fc.a(var4, ((gf) this).field_j, var2, var3, true, 29788, false, ((gf) this).field_d, ((gf) this).field_i, ((gf) this).field_f, ((gf) this).field_k, true);
            return;
          }
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_b = null;
    }

    gf(int param0, int param1, int param2, int param3, int param4) {
        ((gf) this).field_k = param1;
        ((gf) this).field_j = param0;
        ((gf) this).field_l = param4;
        ((gf) this).field_g = param2;
        ((gf) this).field_m = param3;
    }

    static {
    }
}
