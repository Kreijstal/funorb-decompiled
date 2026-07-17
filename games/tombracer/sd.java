/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends lga {
    static int field_K;
    private nua field_I;
    static String field_J;
    private int field_F;
    private iu field_H;
    static int field_G;
    private String field_E;

    final static int a(char param0, byte param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var4 <= var5) {
                      break L4;
                    } else {
                      var8 = param0;
                      var7 = param2.charAt(var5);
                      if (var6 != 0) {
                        if (var7 == var8) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var7 == var8) {
                            var3_int++;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var5++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1 == 93) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                field_G = 37;
                break L2;
              }
              stackOut_12_0 = var3_int;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("sd.F(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              int discarded$2 = sd.a('+', (byte) -127, (CharSequence) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("sd.S(");
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            ((sd) this).field_F = ((sd) this).field_F + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sd.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        it var6 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        iu var14 = null;
        iu var15 = null;
        iu var16 = null;
        oaa var17 = null;
        var8 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var6 = ((sd) this).field_I.b(-4666);
        if (var6 != gla.field_p) {
          if (tea.field_b != var6) {
            var5 = ((sd) this).field_I.a(101);
            if (var5 == null) {
              L0: {
                var5 = ((sd) this).field_E;
                if (var13 == 0) {
                  break L0;
                } else {
                  var5 = ko.field_g;
                  break L0;
                }
              }
              L1: {
                if (var5.equals((Object) (Object) ((sd) this).field_o)) {
                  break L1;
                } else {
                  ((sd) this).field_o = var5;
                  ((sd) this).b(18758);
                  break L1;
                }
              }
              L2: {
                super.a(param0, param1, param2, param3);
                var6 = ((sd) this).field_I.b(-4666);
                var17 = (oaa) (Object) ((sd) this).field_r;
                var9 = ((sd) this).field_i + param0;
                var10 = var17.a(param1, (ae) this, (byte) -89) + (var17.a((ae) this, 14157).b(param2 + -117) >> 1);
                if (gla.field_p == var6) {
                  break L2;
                } else {
                  if (var6 == tea.field_b) {
                    break L2;
                  } else {
                    L3: {
                      if (fp.field_c != var6) {
                        break L3;
                      } else {
                        var14 = pq.field_b[2];
                        var14.a(var9, -(var14.field_q >> 1) + var10, 256);
                        if (var13 != 0) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                    if (var6 == uh.field_k) {
                      var15 = pq.field_b[1];
                      var15.a(var9, -(var15.field_q >> 1) + var10, 256);
                      if (var13 != 0) {
                        break L2;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              L4: {
                var16 = pq.field_b[0];
                var11 = var16.field_n << 1;
                var12 = var16.field_k << 1;
                if (((sd) this).field_H == null) {
                  break L4;
                } else {
                  if (((sd) this).field_H.field_m < var11) {
                    break L4;
                  } else {
                    if (var12 > ((sd) this).field_H.field_q) {
                      break L4;
                    } else {
                      nm.a(((sd) this).field_H, (byte) 120);
                      bea.a();
                      if (var13 == 0) {
                        var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
                        pfa.a(1);
                        ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
                        return;
                      } else {
                        ((sd) this).field_H = new iu(var11, var12);
                        nm.a(((sd) this).field_H, (byte) 121);
                        var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
                        pfa.a(1);
                        ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
                        return;
                      }
                    }
                  }
                }
              }
              ((sd) this).field_H = new iu(var11, var12);
              nm.a(((sd) this).field_H, (byte) 121);
              var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
              pfa.a(1);
              ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
              return;
            } else {
              L5: {
                if (var5.equals((Object) (Object) ((sd) this).field_o)) {
                  break L5;
                } else {
                  ((sd) this).field_o = var5;
                  ((sd) this).b(18758);
                  break L5;
                }
              }
              L6: {
                super.a(param0, param1, param2, param3);
                var6 = ((sd) this).field_I.b(-4666);
                var17 = (oaa) (Object) ((sd) this).field_r;
                var9 = ((sd) this).field_i + param0;
                var10 = var17.a(param1, (ae) this, (byte) -89) + (var17.a((ae) this, 14157).b(param2 + -117) >> 1);
                if (gla.field_p == var6) {
                  break L6;
                } else {
                  if (var6 == tea.field_b) {
                    break L6;
                  } else {
                    L7: {
                      if (fp.field_c != var6) {
                        break L7;
                      } else {
                        var14 = pq.field_b[2];
                        var14.a(var9, -(var14.field_q >> 1) + var10, 256);
                        if (var13 != 0) {
                          break L7;
                        } else {
                          return;
                        }
                      }
                    }
                    if (var6 == uh.field_k) {
                      var15 = pq.field_b[1];
                      var15.a(var9, -(var15.field_q >> 1) + var10, 256);
                      if (var13 != 0) {
                        break L6;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              var16 = pq.field_b[0];
              var11 = var16.field_n << 1;
              var12 = var16.field_k << 1;
              if (((sd) this).field_H != null) {
                if (((sd) this).field_H.field_m >= var11) {
                  if (var12 <= ((sd) this).field_H.field_q) {
                    nm.a(((sd) this).field_H, (byte) 120);
                    bea.a();
                    if (var13 == 0) {
                      var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
                      pfa.a(1);
                      ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
                      return;
                    } else {
                      ((sd) this).field_H = new iu(var11, var12);
                      nm.a(((sd) this).field_H, (byte) 121);
                      var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
                      pfa.a(1);
                      ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
                      return;
                    }
                  } else {
                    ((sd) this).field_H = new iu(var11, var12);
                    nm.a(((sd) this).field_H, (byte) 121);
                    var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
                    pfa.a(1);
                    ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
                    return;
                  }
                } else {
                  ((sd) this).field_H = new iu(var11, var12);
                  nm.a(((sd) this).field_H, (byte) 121);
                  var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
                  pfa.a(1);
                  ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
                  return;
                }
              } else {
                ((sd) this).field_H = new iu(var11, var12);
                nm.a(((sd) this).field_H, (byte) 121);
                var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
                pfa.a(1);
                ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
                return;
              }
            }
          } else {
            L8: {
              var5 = ko.field_g;
              if (var5.equals((Object) (Object) ((sd) this).field_o)) {
                break L8;
              } else {
                ((sd) this).field_o = var5;
                ((sd) this).b(18758);
                break L8;
              }
            }
            L9: {
              L10: {
                super.a(param0, param1, param2, param3);
                var6 = ((sd) this).field_I.b(-4666);
                var17 = (oaa) (Object) ((sd) this).field_r;
                var9 = ((sd) this).field_i + param0;
                var10 = var17.a(param1, (ae) this, (byte) -89) + (var17.a((ae) this, 14157).b(param2 + -117) >> 1);
                if (gla.field_p == var6) {
                  break L10;
                } else {
                  if (var6 == tea.field_b) {
                    break L10;
                  } else {
                    L11: {
                      if (fp.field_c != var6) {
                        break L11;
                      } else {
                        var14 = pq.field_b[2];
                        var14.a(var9, -(var14.field_q >> 1) + var10, 256);
                        if (var13 == 0) {
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (var6 == uh.field_k) {
                      var15 = pq.field_b[1];
                      var15.a(var9, -(var15.field_q >> 1) + var10, 256);
                      if (var13 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
              }
              L12: {
                L13: {
                  var16 = pq.field_b[0];
                  var11 = var16.field_n << 1;
                  var12 = var16.field_k << 1;
                  if (((sd) this).field_H == null) {
                    break L13;
                  } else {
                    if (((sd) this).field_H.field_m < var11) {
                      break L13;
                    } else {
                      if (var12 > ((sd) this).field_H.field_q) {
                        break L13;
                      } else {
                        nm.a(((sd) this).field_H, (byte) 120);
                        bea.a();
                        if (var13 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                }
                ((sd) this).field_H = new iu(var11, var12);
                nm.a(((sd) this).field_H, (byte) 121);
                break L12;
              }
              var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
              pfa.a(1);
              ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
              break L9;
            }
            return;
          }
        } else {
          L14: {
            var5 = ko.field_g;
            if (var5.equals((Object) (Object) ((sd) this).field_o)) {
              break L14;
            } else {
              ((sd) this).field_o = var5;
              ((sd) this).b(18758);
              break L14;
            }
          }
          L15: {
            L16: {
              super.a(param0, param1, param2, param3);
              var6 = ((sd) this).field_I.b(-4666);
              var17 = (oaa) (Object) ((sd) this).field_r;
              var9 = ((sd) this).field_i + param0;
              var10 = var17.a(param1, (ae) this, (byte) -89) + (var17.a((ae) this, 14157).b(param2 + -117) >> 1);
              if (gla.field_p == var6) {
                break L16;
              } else {
                if (var6 == tea.field_b) {
                  break L16;
                } else {
                  L17: {
                    if (fp.field_c != var6) {
                      break L17;
                    } else {
                      var14 = pq.field_b[2];
                      var14.a(var9, -(var14.field_q >> 1) + var10, 256);
                      if (var13 == 0) {
                        break L15;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (var6 == uh.field_k) {
                    var15 = pq.field_b[1];
                    var15.a(var9, -(var15.field_q >> 1) + var10, 256);
                    if (var13 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  } else {
                    break L15;
                  }
                }
              }
            }
            L18: {
              L19: {
                var16 = pq.field_b[0];
                var11 = var16.field_n << 1;
                var12 = var16.field_k << 1;
                if (((sd) this).field_H == null) {
                  break L19;
                } else {
                  if (((sd) this).field_H.field_m < var11) {
                    break L19;
                  } else {
                    if (var12 > ((sd) this).field_H.field_q) {
                      break L19;
                    } else {
                      nm.a(((sd) this).field_H, (byte) 120);
                      bea.a();
                      if (var13 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
              }
              ((sd) this).field_H = new iu(var11, var12);
              nm.a(((sd) this).field_H, (byte) 121);
              break L18;
            }
            var16.a(112, 144, var16.field_n << 4, var16.field_k << 4, -((sd) this).field_F << 10, 4096);
            pfa.a(1);
            ((sd) this).field_H.a(var9 - (var16.field_n >> 1), var10 + -var16.field_k, 256);
            break L15;
          }
          return;
        }
    }

    sd(nua param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (isa) (Object) nk.a(-21819));
        try {
            ((sd) this).field_I = param0;
            ((sd) this).field_E = param1;
            ((sd) this).a((byte) -31, param4, param5, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void g(byte param0) {
        if (param0 != 10) {
            field_J = null;
            field_J = null;
            return;
        }
        field_J = null;
    }

    final String d(byte param0) {
        int var2 = -89 / ((param0 - -58) / 60);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "ESC - cancel this line";
    }
}
