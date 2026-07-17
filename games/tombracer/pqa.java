/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pqa extends dg {
    private int field_q;
    static String field_r;
    private ut field_n;
    static int[] field_m;
    static int field_p;
    private int field_o;

    final static void i(int param0) {
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        if (mla.field_a <= 0) {
          if (0 >= gt.field_a) {
            if (0 < fp.field_e) {
              fp.field_e = fp.field_e - 1;
              if (0 >= mla.field_a) {
                if (gt.field_a <= 0) {
                  if (fp.field_e <= 0) {
                    return;
                  } else {
                    dga.a(fp.field_e, 199);
                    return;
                  }
                } else {
                  dga.a(gt.field_a, 199);
                  if (fp.field_e <= 0) {
                    return;
                  } else {
                    dga.a(fp.field_e, 199);
                    return;
                  }
                }
              } else {
                ji.a(16);
                if (gt.field_a <= 0) {
                  if (fp.field_e <= 0) {
                    return;
                  } else {
                    dga.a(fp.field_e, 199);
                    return;
                  }
                } else {
                  dga.a(gt.field_a, 199);
                  if (fp.field_e <= 0) {
                    return;
                  } else {
                    dga.a(fp.field_e, 199);
                    return;
                  }
                }
              }
            } else {
              if (0 >= mla.field_a) {
                if (gt.field_a <= 0) {
                  if (fp.field_e > 0) {
                    dga.a(fp.field_e, 199);
                    return;
                  } else {
                    return;
                  }
                } else {
                  dga.a(gt.field_a, 199);
                  if (fp.field_e > 0) {
                    dga.a(fp.field_e, 199);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ji.a(16);
                if (gt.field_a <= 0) {
                  if (fp.field_e > 0) {
                    dga.a(fp.field_e, 199);
                    return;
                  } else {
                    return;
                  }
                } else {
                  dga.a(gt.field_a, 199);
                  if (fp.field_e <= 0) {
                    return;
                  } else {
                    dga.a(fp.field_e, 199);
                    return;
                  }
                }
              }
            }
          } else {
            gt.field_a = gt.field_a - 1;
            if (0 >= mla.field_a) {
              if (gt.field_a <= 0) {
                if (fp.field_e > 0) {
                  dga.a(fp.field_e, 199);
                  return;
                } else {
                  return;
                }
              } else {
                dga.a(gt.field_a, 199);
                if (fp.field_e > 0) {
                  dga.a(fp.field_e, 199);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ji.a(16);
              if (gt.field_a <= 0) {
                if (fp.field_e > 0) {
                  dga.a(fp.field_e, 199);
                  return;
                } else {
                  return;
                }
              } else {
                L0: {
                  dga.a(gt.field_a, 199);
                  if (fp.field_e <= 0) {
                    break L0;
                  } else {
                    dga.a(fp.field_e, 199);
                    break L0;
                  }
                }
                return;
              }
            }
          }
        } else {
          mla.field_a = mla.field_a - 1;
          if (0 < mla.field_a) {
            ji.a(16);
            if (gt.field_a > 0) {
              dga.a(gt.field_a, 199);
              if (fp.field_e > 0) {
                dga.a(fp.field_e, 199);
                return;
              } else {
                return;
              }
            } else {
              L1: {
                if (fp.field_e <= 0) {
                  break L1;
                } else {
                  dga.a(fp.field_e, 199);
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (gt.field_a <= 0) {
                break L2;
              } else {
                dga.a(gt.field_a, 199);
                break L2;
              }
            }
            L3: {
              if (fp.field_e <= 0) {
                break L3;
              } else {
                dga.a(fp.field_e, 199);
                break L3;
              }
            }
            return;
          }
        }
    }

    final void a(gma param0, int param1, gr param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pqa.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    pqa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        ((pqa) this).field_q = 0;
        ((pqa) this).field_o = 0;
    }

    public static void n(byte param0) {
        field_m = null;
        field_r = null;
    }

    pqa(int param0) {
        super(param0);
        ((pqa) this).field_q = 0;
        ((pqa) this).field_o = 0;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        la var4 = null;
        hr var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        la var11 = null;
        hr var12 = null;
        hr var14 = null;
        hr var16 = null;
        la var18 = null;
        hr var19 = null;
        hr var20 = null;
        hr var21 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        if (null != ((pqa) this).field_n) {
          if (((pqa) this).field_k.a(-61)) {
            var2 = ((pqa) this).field_n.b(-113);
            var3 = ((pqa) this).field_n.j((byte) -108);
            if (!((pqa) this).field_n.k((byte) -74).b((byte) 120)) {
              ((pqa) this).field_q = var3;
              var18 = ((pqa) this).a(param0 + 44);
              var5 = var18.a(((pqa) this).b((byte) 42), ((pqa) this).c((byte) 118) - -2097152, (byte) 100, ((pqa) this).e((byte) -92) + 8 << 16);
              var5.a(false, 32, 12, 4, 10 + uca.field_c.a(10, param0 + 1));
              var6 = 262144 + uca.field_c.a(262144, 0);
              var5.a(var6, -var6 / 32, 0, 0, 0, 0, (byte) -20);
              var5.a(uca.field_c.a(2048, param0 ^ param0), -16 + uca.field_c.a(32, 0), param0 ^ 118);
              if (((pqa) this).field_q > 10) {
                var2 -= 25;
                var7 = 0;
                if (((pqa) this).field_q < var2) {
                  if (((pqa) this).field_o <= 0) {
                    L0: {
                      ((pqa) this).field_o = (var2 + -((pqa) this).field_q) / 8;
                      var7 = 1;
                      if (var7 == 0) {
                        break L0;
                      } else {
                        var20 = var18.a(uca.field_c.a(var18.m((byte) -86), 0), uca.field_c.a(var18.s(-125), 0), (byte) 100, 1048576);
                        var20.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
                        var20.a(65536, 0, param0 ^ 118, 0);
                        var20.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
                        break L0;
                      }
                    }
                    return;
                  } else {
                    L1: {
                      ((pqa) this).field_o = ((pqa) this).field_o - 1;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        var21 = var18.a(uca.field_c.a(var18.m((byte) -86), 0), uca.field_c.a(var18.s(-125), 0), (byte) 100, 1048576);
                        var21.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
                        var21.a(65536, 0, param0 ^ 118, 0);
                        var21.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
                        break L1;
                      }
                    }
                    return;
                  }
                } else {
                  L2: {
                    var7 = 1;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      var19 = var18.a(uca.field_c.a(var18.m((byte) -86), 0), uca.field_c.a(var18.s(-125), 0), (byte) 100, 1048576);
                      var19.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
                      var19.a(65536, 0, param0 ^ 118, 0);
                      var19.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              ((pqa) this).field_q = var2;
              var11 = ((pqa) this).a(param0 + 44);
              var4 = var11;
              var5 = var11.a(((pqa) this).b((byte) 42), ((pqa) this).c((byte) 118) - -2097152, (byte) 100, ((pqa) this).e((byte) -92) + 8 << 16);
              var5.a(false, 32, 12, 4, 10 + uca.field_c.a(10, param0 + 1));
              var6 = 262144 + uca.field_c.a(262144, 0);
              var5.a(var6, -var6 / 32, 0, 0, 0, 0, (byte) -20);
              var5.a(uca.field_c.a(2048, param0 ^ param0), -16 + uca.field_c.a(32, 0), param0 ^ 118);
              if (((pqa) this).field_q > 10) {
                var2 -= 25;
                var7 = 0;
                if (((pqa) this).field_q < var2) {
                  if (((pqa) this).field_o <= 0) {
                    L3: {
                      ((pqa) this).field_o = (var2 + -((pqa) this).field_q) / 8;
                      var7 = 1;
                      if (var7 == 0) {
                        break L3;
                      } else {
                        var14 = var11.a(uca.field_c.a(var11.m((byte) -86), 0), uca.field_c.a(var11.s(-125), 0), (byte) 100, 1048576);
                        var14.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
                        var14.a(65536, 0, param0 ^ 118, 0);
                        var14.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L4: {
                      ((pqa) this).field_o = ((pqa) this).field_o - 1;
                      if (var7 == 0) {
                        break L4;
                      } else {
                        var16 = var11.a(uca.field_c.a(var11.m((byte) -86), 0), uca.field_c.a(var11.s(-125), 0), (byte) 100, 1048576);
                        var16.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
                        var16.a(65536, 0, param0 ^ 118, 0);
                        var16.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
                        break L4;
                      }
                    }
                    return;
                  }
                } else {
                  L5: {
                    var7 = 1;
                    if (var7 == 0) {
                      break L5;
                    } else {
                      var12 = var11.a(uca.field_c.a(var11.m((byte) -86), 0), uca.field_c.a(var11.s(-125), 0), (byte) 100, 1048576);
                      var12.a(false, 64, 12, 8, uca.field_c.a(25, 0) + 25);
                      var12.a(65536, 0, param0 ^ 118, 0);
                      var12.a(uca.field_c.a(2048, 0), -16 + uca.field_c.a(32, 0), -96);
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            ((pqa) this).field_q = 0;
            return;
          }
        } else {
          ((pqa) this).field_q = 0;
          return;
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            super.a(param0, param1, param2);
            if (param0 instanceof ut) {
              ((pqa) this).field_n = (ut) (Object) param0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("pqa.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
    }

    final void a(byte param0, kh param1) {
        try {
            int var3_int = -121 / ((param0 - -8) / 40);
            super.a((byte) -64, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pqa.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(124, param1, param2);
              if (param0 >= 119) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pqa.G(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        try {
            int var6_int = 92 % ((param4 - -38) / 47);
            var7 = dfa.a(4096 - ((pqa) this).field_h.g(-25787) >> 2, 2048, -74);
            gqa.a(var7, -83584144, param1, param2, df.field_J[6], param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pqa.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Names cannot contain consecutive spaces";
    }
}
