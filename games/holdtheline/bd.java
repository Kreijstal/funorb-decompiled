/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends cj {
    private ia field_U;
    static int field_S;
    private int field_N;
    static gn field_Q;
    static int[] field_R;
    private hj field_T;
    static int[] field_V;
    private String field_P;
    static int field_W;

    final boolean a(n param0, int param1) {
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
            if (param1 == -25823) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_V = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("bd.NB(");
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
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        oc.field_c = null;
        lc.field_g = 0;
        tl.field_y = null;
        if (param1 == 8077) {
          var2 = lg.field_e;
          lg.field_e = fh.field_g;
          fh.field_g = var2;
          if (param0 == 51) {
            L0: {
              ce.field_n.field_f = 2;
              ce.field_n.field_c = ce.field_n.field_c + 1;
              if (ce.field_n.field_c < 2) {
                break L0;
              } else {
                if (51 != param0) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if (ce.field_n.field_c < 2) {
              if (4 > ce.field_n.field_c) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param0 == 50) {
                return 5;
              } else {
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (param0 != 50) {
              L1: {
                ce.field_n.field_f = 1;
                ce.field_n.field_c = ce.field_n.field_c + 1;
                if (ce.field_n.field_c < 2) {
                  break L1;
                } else {
                  if (51 != param0) {
                    break L1;
                  } else {
                    return 2;
                  }
                }
              }
              if (ce.field_n.field_c < 2) {
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param0 == 50) {
                  return 5;
                } else {
                  if (4 > ce.field_n.field_c) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              L2: {
                ce.field_n.field_f = 5;
                ce.field_n.field_c = ce.field_n.field_c + 1;
                if (ce.field_n.field_c < 2) {
                  break L2;
                } else {
                  if (51 != param0) {
                    break L2;
                  } else {
                    return 2;
                  }
                }
              }
              if (ce.field_n.field_c < 2) {
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param0 == 50) {
                  return 5;
                } else {
                  if (4 > ce.field_n.field_c) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        } else {
          field_Q = null;
          var2 = lg.field_e;
          lg.field_e = fh.field_g;
          fh.field_g = var2;
          if (param0 == 51) {
            ce.field_n.field_f = 2;
            ce.field_n.field_c = ce.field_n.field_c + 1;
            if (ce.field_n.field_c >= 2) {
              if (51 == param0) {
                return 2;
              } else {
                L3: {
                  if (ce.field_n.field_c < 2) {
                    break L3;
                  } else {
                    if (param0 == 50) {
                      return 5;
                    } else {
                      break L3;
                    }
                  }
                }
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              L4: {
                if (ce.field_n.field_c < 2) {
                  break L4;
                } else {
                  if (param0 == 50) {
                    return 5;
                  } else {
                    break L4;
                  }
                }
              }
              if (4 > ce.field_n.field_c) {
                return -1;
              } else {
                return 1;
              }
            }
          } else {
            if (param0 != 50) {
              ce.field_n.field_f = 1;
              ce.field_n.field_c = ce.field_n.field_c + 1;
              if (ce.field_n.field_c >= 2) {
                if (51 == param0) {
                  return 2;
                } else {
                  L5: {
                    if (ce.field_n.field_c < 2) {
                      break L5;
                    } else {
                      if (param0 == 50) {
                        return 5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (4 > ce.field_n.field_c) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              } else {
                L6: {
                  if (ce.field_n.field_c < 2) {
                    break L6;
                  } else {
                    if (param0 == 50) {
                      return 5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              ce.field_n.field_f = 5;
              ce.field_n.field_c = ce.field_n.field_c + 1;
              if (ce.field_n.field_c >= 2) {
                if (51 == param0) {
                  return 2;
                } else {
                  L7: {
                    if (ce.field_n.field_c < 2) {
                      break L7;
                    } else {
                      if (param0 == 50) {
                        return 5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (4 > ce.field_n.field_c) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              } else {
                L8: {
                  if (ce.field_n.field_c < 2) {
                    break L8;
                  } else {
                    if (param0 == 50) {
                      return 5;
                    } else {
                      break L8;
                    }
                  }
                }
                if (4 > ce.field_n.field_c) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_V = null;
        field_Q = null;
        field_R = null;
    }

    final String f(int param0) {
        if (param0 == 0) {
            return null;
        }
        field_S = -9;
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        fd var6 = null;
        vc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var15 = null;
        hj var16 = null;
        hj var17 = null;
        hj var18 = null;
        L0: {
          L1: {
            L2: {
              var13 = HoldTheLine.field_D;
              var6 = ((bd) this).field_U.b(-7447);
              if (hh.field_d == var6) {
                break L2;
              } else {
                if (um.field_a == var6) {
                  break L2;
                } else {
                  var5 = ((bd) this).field_U.b((byte) -59);
                  if (var5 == null) {
                    var5 = ((bd) this).field_P;
                    break L1;
                  } else {
                    if (var5.equals((Object) (Object) ((bd) this).field_q)) {
                      break L0;
                    } else {
                      ((bd) this).field_q = var5;
                      ((bd) this).j(0);
                      break L0;
                    }
                  }
                }
              }
            }
            var5 = hg.field_N;
            break L1;
          }
          if (var5.equals((Object) (Object) ((bd) this).field_q)) {
            break L0;
          } else {
            ((bd) this).field_q = var5;
            ((bd) this).j(0);
            break L0;
          }
        }
        super.a(param0, param1, param2, param3);
        var6 = ((bd) this).field_U.b(-7447);
        var8 = (vc) (Object) ((bd) this).field_l;
        var9 = ((bd) this).field_k + param2;
        var10 = var8.a(-1337403295, (n) this, param1) + (var8.a((byte) 20, (n) this).a(-93) >> 1);
        if (hh.field_d == var6) {
          var18 = ef.field_i[0];
          var11 = var18.field_o << 1;
          var12 = var18.field_v << 1;
          if (null != ((bd) this).field_T) {
            if (var11 <= ((bd) this).field_T.field_s) {
              if (((bd) this).field_T.field_y < var12) {
                ((bd) this).field_T = new hj(var11, var12);
                hf.a(((bd) this).field_T, -1);
                var18.b(112, 144, var18.field_o << 4, var18.field_v << 4, -((bd) this).field_N << 10, 4096);
                dm.b((byte) -10);
                ((bd) this).field_T.b(-(var18.field_o >> 1) + var9, -var18.field_v + var10, 256);
                return;
              } else {
                hf.a(((bd) this).field_T, -1);
                tc.c();
                var18.b(112, 144, var18.field_o << 4, var18.field_v << 4, -((bd) this).field_N << 10, 4096);
                dm.b((byte) -10);
                ((bd) this).field_T.b(-(var18.field_o >> 1) + var9, -var18.field_v + var10, 256);
                return;
              }
            } else {
              ((bd) this).field_T = new hj(var11, var12);
              hf.a(((bd) this).field_T, -1);
              var18.b(112, 144, var18.field_o << 4, var18.field_v << 4, -((bd) this).field_N << 10, 4096);
              dm.b((byte) -10);
              ((bd) this).field_T.b(-(var18.field_o >> 1) + var9, -var18.field_v + var10, 256);
              return;
            }
          } else {
            ((bd) this).field_T = new hj(var11, var12);
            hf.a(((bd) this).field_T, -1);
            var18.b(112, 144, var18.field_o << 4, var18.field_v << 4, -((bd) this).field_N << 10, 4096);
            dm.b((byte) -10);
            ((bd) this).field_T.b(-(var18.field_o >> 1) + var9, -var18.field_v + var10, 256);
            return;
          }
        } else {
          if (var6 != um.field_a) {
            if (g.field_k == var6) {
              var15 = ef.field_i[2];
              var15.b(var9, var10 - (var15.field_y >> 1), 256);
              return;
            } else {
              L3: {
                if (tg.field_d != var6) {
                  break L3;
                } else {
                  var16 = ef.field_i[1];
                  var16.b(var9, var10 + -(var16.field_y >> 1), 256);
                  break L3;
                }
              }
              return;
            }
          } else {
            var17 = ef.field_i[0];
            var11 = var17.field_o << 1;
            var12 = var17.field_v << 1;
            if (null != ((bd) this).field_T) {
              if (var11 <= ((bd) this).field_T.field_s) {
                if (((bd) this).field_T.field_y < var12) {
                  ((bd) this).field_T = new hj(var11, var12);
                  hf.a(((bd) this).field_T, -1);
                  var17.b(112, 144, var17.field_o << 4, var17.field_v << 4, -((bd) this).field_N << 10, 4096);
                  dm.b((byte) -10);
                  ((bd) this).field_T.b(-(var17.field_o >> 1) + var9, -var17.field_v + var10, 256);
                  return;
                } else {
                  hf.a(((bd) this).field_T, -1);
                  tc.c();
                  var17.b(112, 144, var17.field_o << 4, var17.field_v << 4, -((bd) this).field_N << 10, 4096);
                  dm.b((byte) -10);
                  ((bd) this).field_T.b(-(var17.field_o >> 1) + var9, -var17.field_v + var10, 256);
                  return;
                }
              } else {
                ((bd) this).field_T = new hj(var11, var12);
                hf.a(((bd) this).field_T, -1);
                var17.b(112, 144, var17.field_o << 4, var17.field_v << 4, -((bd) this).field_N << 10, 4096);
                dm.b((byte) -10);
                ((bd) this).field_T.b(-(var17.field_o >> 1) + var9, -var17.field_v + var10, 256);
                return;
              }
            } else {
              ((bd) this).field_T = new hj(var11, var12);
              hf.a(((bd) this).field_T, -1);
              var17.b(112, 144, var17.field_o << 4, var17.field_v << 4, -((bd) this).field_N << 10, 4096);
              dm.b((byte) -10);
              ((bd) this).field_T.b(-(var17.field_o >> 1) + var9, -var17.field_v + var10, 256);
              return;
            }
          }
        }
    }

    bd(ia param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (dh) (Object) cj.k(105));
        try {
            ((bd) this).field_P = param1;
            ((bd) this).field_U = param0;
            ((bd) this).a(param2, (byte) 122, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "bd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static kk a(byte param0, ee param1, el param2, int param3) {
        kk var4 = null;
        RuntimeException var4_ref = null;
        kk stackIn_3_0 = null;
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
        kk stackOut_2_0 = null;
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
            L1: {
              var4 = mo.a(param3, 2931, param1, param2);
              if (param0 > 2) {
                break L1;
              } else {
                field_W = 35;
                break L1;
              }
            }
            rl.field_J.a((byte) -73, (hl) (Object) var4);
            stackOut_2_0 = (kk) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("bd.O(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    final static ui a(int param0, int param1, int param2, el param3) {
        RuntimeException var4 = null;
        ui stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ui stackOut_2_0 = null;
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
            L1: {
              if (param0 == 17405) {
                break L1;
              } else {
                int discarded$2 = bd.a(34, 10);
                break L1;
              }
            }
            stackOut_2_0 = lg.a(db.a(param3, 100, param1, param2), (byte) -68);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("bd.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, n param1, int param2, byte param3) {
        try {
            ((bd) this).field_N = ((bd) this).field_N + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "bd.JA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new int[4];
        field_S = -20;
        field_V = new int[4];
    }
}
