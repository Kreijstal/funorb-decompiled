/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sfa {
    private int field_e;
    static llb field_d;
    private tj field_a;
    private ml field_c;
    private int field_b;

    final void b(byte param0) {
        int var2 = 51 / ((64 - param0) / 50);
        ((sfa) this).field_c = null;
        ((sfa) this).field_a = null;
    }

    final boolean a(byte param0) {
        int var2 = 113 % ((56 - param0) / 32);
        return null != ((sfa) this).field_c ? true : false;
    }

    final void a(int param0, ml param1, tj param2, byte param3, int param4) {
        try {
            ((sfa) this).field_e = param4;
            ((sfa) this).field_b = param0;
            ((sfa) this).field_c = param1;
            if (param3 != 61) {
                Object var7 = null;
                ((sfa) this).a((pe) null, -17, (anb) null, false);
            }
            ((sfa) this).field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sfa.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
    }

    public sfa() {
        ((sfa) this).b((byte) 118);
    }

    final void a(pe param0, int param1, anb param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        wfb var6 = null;
        int var7 = 0;
        int var8 = 0;
        wfb var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (((sfa) this).field_a.g((byte) -104) != 1) {
                if (3 != ((sfa) this).field_a.g((byte) -104)) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5_int = stackIn_7_0;
              if (((sfa) this).field_a.g((byte) -104) != 3) {
                break L2;
              } else {
                ((sfa) this).field_a.a(((sfa) this).field_b, ((sfa) this).field_e, 127);
                break L2;
              }
            }
            L3: {
              if (2 == ((sfa) this).field_a.g((byte) -104)) {
                L4: {
                  if (!(param2 instanceof sg)) {
                    break L4;
                  } else {
                    if (((sg) (Object) param2).o((byte) -117) != ((sfa) this).field_a.b(false)) {
                      break L4;
                    } else {
                      if (((sg) (Object) param2).q((byte) 115) == ((sfa) this).field_a.e(param1 + 513)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var6_int = laa.field_o;
                param2.a(((sfa) this).field_a.field_h * var6_int, ((sfa) this).field_e, ((sfa) this).field_b, (byte) -119, var6_int * ((sfa) this).field_a.field_f);
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              if (((sfa) this).field_a.g((byte) -104) != 5) {
                break L5;
              } else {
                var6_int = db.field_q;
                param2.a(((sfa) this).field_a.field_h * var6_int, ((sfa) this).field_e, ((sfa) this).field_b, (byte) -116, ((sfa) this).field_a.field_f * var6_int);
                break L5;
              }
            }
            L6: {
              if (((sfa) this).field_a.g((byte) -104) == 6) {
                L7: {
                  L8: {
                    if (param3) {
                      break L8;
                    } else {
                      if (cva.field_o != 1) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param0.a(0, gib.field_a, ((sfa) this).field_a.e(512), ((sfa) this).field_a.b(false), false, ((sfa) this).field_e, ((sfa) this).field_b);
                  break L7;
                }
                param3 = false;
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (!param3) {
                break L9;
              } else {
                L10: {
                  var6 = ((sfa) this).field_c.i((byte) -112);
                  if (((sfa) this).field_a.g((byte) -104) != 3) {
                    if (((sfa) this).field_a.g((byte) -104) == 1) {
                      rmb.a(((sfa) this).field_b, param2.c(false), 40, 106, ((sfa) this).field_e);
                      break L10;
                    } else {
                      if (!var6.field_r) {
                        if (var6.field_B == 0) {
                          qba.a(20382, ((sfa) this).field_e, 60, ((sfa) this).field_b, 1);
                          break L10;
                        } else {
                          qba.a(20382, ((sfa) this).field_e, 56, ((sfa) this).field_b, 1);
                          break L10;
                        }
                      } else {
                        qba.a(20382, ((sfa) this).field_e, 77, ((sfa) this).field_b, 1);
                        break L10;
                      }
                    }
                  } else {
                    rmb.a(((sfa) this).field_b, param2.c(false), 70, -48, ((sfa) this).field_e);
                    break L10;
                  }
                }
                L11: {
                  var7 = 5;
                  var8 = ((sfa) this).field_a.g((byte) -104);
                  if (var8 != 1) {
                    if (var8 == 0) {
                      var7 = ehb.field_e;
                      break L11;
                    } else {
                      if (var8 != 2) {
                        if (var8 != 3) {
                          if (var8 != 4) {
                            if (5 != var8) {
                              break L11;
                            } else {
                              var7 = fmb.field_r;
                              break L11;
                            }
                          } else {
                            var7 = gaa.field_p;
                            break L11;
                          }
                        } else {
                          var7 = pea.field_b;
                          break L11;
                        }
                      } else {
                        var7 = km.field_o;
                        break L11;
                      }
                    }
                  } else {
                    var7 = mc.field_u;
                    break L11;
                  }
                }
                L12: {
                  var8 = ((sfa) this).field_c.a(((sfa) this).field_a.c((byte) 68), (byte) 40);
                  if (var8 > 0) {
                    var5_int = 0;
                    ((sfa) this).field_a.b(var8, 110);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  param0.a(sva.field_m, ((sfa) this).field_b, ((sfa) this).field_e, ei.field_a, 11184895, var7, dw.field_b);
                  var9 = var6;
                  if (!((sfa) this).field_c.k((byte) 99)) {
                    break L13;
                  } else {
                    if (var9.field_y > 0) {
                      param2.field_k.a(true, ((sfa) this).field_c, param0, 60, param2);
                      param2.field_k.a((byte) 102, param2);
                      param0.a(1, var9.field_y, ((sfa) this).field_a.e(param1 ^ -513), ((sfa) this).field_a.b(false), false, ((sfa) this).field_c.b(true), ((sfa) this).field_c.a((byte) 74));
                      break L9;
                    } else {
                      break L13;
                    }
                  }
                }
                if (bka.field_p != 1) {
                  break L9;
                } else {
                  if (!((sfa) this).field_c.k((byte) 71)) {
                    break L9;
                  } else {
                    if (((sfa) this).field_c != param2.field_k) {
                      int discarded$1 = ((sfa) this).field_c.a(true, false, var9.field_p);
                      param2.field_k.a(true, ((sfa) this).field_c, param0, param1 ^ -39, param2);
                      param2.field_k.a((byte) 97, param2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L14: {
              if (var5_int != 0) {
                ((sfa) this).field_a.b(-3846);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (param1 == -1) {
                break L15;
              } else {
                ((sfa) this).field_a = null;
                break L15;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var5;
            stackOut_70_1 = new StringBuilder().append("sfa.B(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L16;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L16;
            }
          }
          L17: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44).append(param1).append(44);
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L17;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L17;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param3 + 41);
        }
    }

    static {
    }
}
