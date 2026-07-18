/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static int field_b;
    static String[] field_a;
    static bg[] field_c;

    final static void a(int param0, int param1, int param2, pk param3, int param4, int param5) {
        RuntimeException var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          gl.c((byte) 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("o.B(").append(50).append(',').append(320).append(',').append(240).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 10 + ',' + 12 + ')');
        }
    }

    final static void b(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        fb var4 = null;
        nd var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = (fb) (Object) hd.field_p.d(9272);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 < -38) {
                    break L2;
                  } else {
                    o.b(48, (byte) 24);
                    break L2;
                  }
                }
                var5 = (nd) (Object) r.field_Q.d(9272);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    gb.a((byte) 15, var5, param0);
                    var5 = (nd) (Object) r.field_Q.e((byte) -119);
                    continue L3;
                  }
                }
              } else {
                mh.a(var4, param0, 0);
                var4 = (fb) (Object) hd.field_p.e((byte) -119);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "o.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          if (this != (Object) (Object) af.field_b) {
            if ((Object) (Object) gb.field_B != this) {
              if (this == (Object) (Object) od.field_g) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_b = 60;
          if (this != (Object) (Object) af.field_b) {
            if ((Object) (Object) gb.field_B == this) {
              return true;
            } else {
              L0: {
                if (this != (Object) (Object) od.field_g) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        hm.field_N = 0;
        bj.field_c = null;
        gi.field_l = null;
        var2 = lg.field_h;
        lg.field_h = ml.field_s;
        jg.field_kb.field_i = jg.field_kb.field_i + 1;
        if (param0 == 51) {
          jg.field_kb.field_l = 2;
          var3 = 58 / ((param1 - -54) / 55);
          ml.field_s = var2;
          if (jg.field_kb.field_i >= 2) {
            if (param0 == 51) {
              return 2;
            } else {
              if (jg.field_kb.field_i < 2) {
                if (4 > jg.field_kb.field_i) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  if (4 > jg.field_kb.field_i) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            if (jg.field_kb.field_i < 2) {
              if (4 > jg.field_kb.field_i) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (50 == param0) {
                return 5;
              } else {
                if (4 > jg.field_kb.field_i) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        } else {
          if (50 != param0) {
            jg.field_kb.field_l = 1;
            var3 = 58 / ((param1 - -54) / 55);
            ml.field_s = var2;
            if (jg.field_kb.field_i >= 2) {
              if (param0 != 51) {
                if (jg.field_kb.field_i < 2) {
                  if (4 <= jg.field_kb.field_i) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param0) {
                    if (4 <= jg.field_kb.field_i) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                return 2;
              }
            } else {
              if (jg.field_kb.field_i < 2) {
                if (4 > jg.field_kb.field_i) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 != param0) {
                  if (4 > jg.field_kb.field_i) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              }
            }
          } else {
            jg.field_kb.field_l = 5;
            var3 = 58 / ((param1 - -54) / 55);
            ml.field_s = var2;
            if (jg.field_kb.field_i >= 2) {
              if (param0 != 51) {
                if (jg.field_kb.field_i < 2) {
                  if (4 <= jg.field_kb.field_i) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param0) {
                    if (4 <= jg.field_kb.field_i) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                return 2;
              }
            } else {
              if (jg.field_kb.field_i < 2) {
                if (4 <= jg.field_kb.field_i) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (50 != param0) {
                  if (4 <= jg.field_kb.field_i) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              }
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Movement modes", "<col=fcfe7f>READY MODE<br></col>When in ready mode your soldier fires accurate shots and will pause if they see a target while moving. Soldiers return to ready mode every time you end the turn.", "<col=fcfe7f>SPRINT MODE<br></col>While in sprint mode a soldier moves faster across the landscape but their accuracy is significantly reduced and the soldier will not take advantage of cover or stop on sighting a new enemy. Remember also that it takes some time to return your gun to the ready position.", "<col=fcfe7f>UNITS WITH PISTOLS OR SHOTGUNS<br></col>Sprint mode is not a problem as your weapons are inaccurate anyway. Run up to your target and shoot them at point blank range before retreating to cover.", "<col=fcfe7f>UNITS WITH RIFLES OR MACHINE GUNS<br></col>Move carefully towards your target making use of cover and save lots of time to fire back if attacked. If you encounter an enemy who you will not be able to neutralise on the current turn, switch to sprint mode and retreat to cover.", "<col=fcfe7f>ARMOUR<br></col>Always remember that without armour your soldiers will not last long in the field. So use cover wisely and don't expose yourself to an ambush."};
    }
}
