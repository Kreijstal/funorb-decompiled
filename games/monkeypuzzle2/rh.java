/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rh extends ua {
    private int field_D;
    boolean field_z;
    static boolean field_B;
    static int field_C;
    private kj field_A;

    private final int m(int param0) {
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 11) {
                break L1;
              } else {
                boolean discarded$2 = ((rh) this).k(74);
                break L1;
              }
            }
            L2: {
              if (!((rh) this).field_z) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                if (this == (Object) (Object) ((rh) this).field_A.j(-106)) {
                  stackOut_9_0 = 256;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_11_0 = stackOut_7_0;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "rh.EB(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final we a(boolean param0) {
        we var2 = null;
        RuntimeException var2_ref = null;
        we stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        we stackOut_3_0 = null;
        Object stackOut_8_0 = null;
        try {
          L0: {
            var2 = super.a(param0);
            if (null != var2) {
              stackOut_3_0 = (we) var2;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_B = true;
                  break L1;
                }
              }
              stackOut_8_0 = this;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2_ref, "rh.CB(" + param0 + ')');
        }
        return (we) this;
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -117) {
                break L1;
              } else {
                int discarded$2 = rh.a(-20);
                break L1;
              }
            }
            cd.a(-1);
            hj.field_L = true;
            fk.field_a = true;
            wg.field_j.k(param0 ^ -29);
            vi.a(eg.field_f, 12345, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "rh.SA(" + param0 + ')');
        }
    }

    rh(kj param0, int param1, int param2) {
        super(tf.field_b + -param1 >> 1, uj.field_l - param2 >> 1, param1, param2, (ml) null);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((rh) this).field_A = param0;
            ((rh) this).field_z = false;
            ((rh) this).field_D = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rh.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 1) {
              stackOut_3_0 = mg.field_s;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -111;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "rh.BB(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((rh) this).field_D == 0) {
              return;
            } else {
              if (256 > ((rh) this).field_D) {
                L1: {
                  L2: {
                    if (vg.field_M == null) {
                      break L2;
                    } else {
                      if (((rh) this).field_l > vg.field_M.field_k) {
                        break L2;
                      } else {
                        if (~vg.field_M.field_j <= ~((rh) this).field_p) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  vg.field_M = new le(((rh) this).field_l, ((rh) this).field_p);
                  break L1;
                }
                mc.a(param0 ^ -8495, vg.field_M);
                ge.d();
                ((rh) this).a(false, 0, 0);
                super.a(param0, param1, -param2 - ((rh) this).field_e, -((rh) this).field_r + -param3);
                tj.b(653);
                vg.field_M.b(((rh) this).field_r + param3, param2 + ((rh) this).field_e, ((rh) this).field_D);
                break L0;
              } else {
                if (param1 == 0) {
                  ((rh) this).a(false, param3 - -((rh) this).field_r, param2 - -((rh) this).field_e);
                  super.a(30, param1, param2, param3);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var5, "rh.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    abstract void a(boolean param0, int param1, int param2);

    boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            ((rh) this).field_D = this.m(108);
            if (!param0) {
              L1: {
                L2: {
                  if (((rh) this).field_D != 0) {
                    break L2;
                  } else {
                    if (((rh) this).field_z) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "rh.Q(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(int param0, ad param1) {
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_145_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        RuntimeException stackOut_144_0 = null;
        StringBuilder stackOut_144_1 = null;
        String stackOut_144_2 = null;
        RuntimeException stackOut_142_0 = null;
        StringBuilder stackOut_142_1 = null;
        String stackOut_142_2 = null;
        try {
          L0: {
            L1: {
              gf.field_b = param1;
              var2 = o.a((byte) 76, "score_colon_space");
              if (null != var2) {
                String discarded$4 = be.a(var2, (byte) 112);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2 = o.a((byte) 76, "instructions_1");
              if (var2 != null) {
                mk.field_j = be.a(var2, (byte) 111);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2 = o.a((byte) 76, "instructions_2");
              if (null != var2) {
                je.field_a = be.a(var2, (byte) -104);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = o.a((byte) 76, "tips,0");
              if (var2 != null) {
                th.field_n[0] = be.a(var2, (byte) 68);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var2 = o.a((byte) 76, "tips,1");
              if (null == var2) {
                break L5;
              } else {
                th.field_n[1] = be.a(var2, (byte) 100);
                break L5;
              }
            }
            L6: {
              var2 = o.a((byte) 76, "tips,2");
              if (null != var2) {
                th.field_n[2] = be.a(var2, (byte) 66);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var2 = o.a((byte) 76, "tips,3");
              if (null != var2) {
                th.field_n[3] = be.a(var2, (byte) -36);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var2 = o.a((byte) 76, "tips,4");
              if (null != var2) {
                th.field_n[4] = be.a(var2, (byte) 100);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var2 = o.a((byte) 76, "notShowingTips");
              if (var2 == null) {
                break L9;
              } else {
                lg.field_I = be.a(var2, (byte) -57);
                break L9;
              }
            }
            L10: {
              var2 = o.a((byte) 76, "youHaveSeen");
              if (null == var2) {
                break L10;
              } else {
                jg.field_kb = be.a(var2, (byte) -44);
                break L10;
              }
            }
            L11: {
              var2 = o.a((byte) 76, "wellDone");
              if (null == var2) {
                break L11;
              } else {
                wj.field_h = be.a(var2, (byte) -87);
                break L11;
              }
            }
            L12: {
              var2 = o.a((byte) 76, "youScored");
              if (var2 == null) {
                break L12;
              } else {
                cl.field_b = be.a(var2, (byte) -66);
                break L12;
              }
            }
            L13: {
              var2 = o.a((byte) 76, "pressEnter");
              if (null != var2) {
                lb.field_A = be.a(var2, (byte) 77);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2 = o.a((byte) 76, "levelComplete");
              if (null != var2) {
                sc.field_d = be.a(var2, (byte) -109);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var2 = o.a((byte) 76, "speedBonus");
              if (var2 == null) {
                break L15;
              } else {
                ff.field_a = be.a(var2, (byte) 122);
                break L15;
              }
            }
            L16: {
              var2 = o.a((byte) 76, "cancel");
              if (null == var2) {
                break L16;
              } else {
                String discarded$5 = be.a(var2, (byte) 119);
                break L16;
              }
            }
            L17: {
              var2 = o.a((byte) 76, "close");
              if (var2 != null) {
                String discarded$6 = be.a(var2, (byte) -41);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2 = o.a((byte) 76, "members");
              if (var2 == null) {
                break L18;
              } else {
                String discarded$7 = be.a(var2, (byte) 105);
                break L18;
              }
            }
            L19: {
              var2 = o.a((byte) 76, "tipsColon");
              if (var2 == null) {
                break L19;
              } else {
                pe.field_c = be.a(var2, (byte) -80);
                break L19;
              }
            }
            L20: {
              var2 = o.a((byte) 76, "achievement_names,0");
              if (var2 == null) {
                break L20;
              } else {
                rb.field_hb[0] = be.a(var2, (byte) -44);
                break L20;
              }
            }
            L21: {
              var2 = o.a((byte) 76, "achievement_names,1");
              if (null != var2) {
                rb.field_hb[1] = be.a(var2, (byte) 94);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              var2 = o.a((byte) 76, "achievement_names,2");
              if (null != var2) {
                rb.field_hb[2] = be.a(var2, (byte) -68);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var2 = o.a((byte) 76, "achievement_names,3");
              if (null != var2) {
                rb.field_hb[3] = be.a(var2, (byte) 89);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var2 = o.a((byte) 76, "achievement_names,4");
              if (null == var2) {
                break L24;
              } else {
                rb.field_hb[4] = be.a(var2, (byte) 122);
                break L24;
              }
            }
            L25: {
              var2 = o.a((byte) 76, "achievement_names,5");
              if (null != var2) {
                rb.field_hb[5] = be.a(var2, (byte) -107);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2 = o.a((byte) 76, "achievement_names,6");
              if (null != var2) {
                rb.field_hb[6] = be.a(var2, (byte) -89);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2 = o.a((byte) 76, "achievement_names,7");
              if (var2 != null) {
                rb.field_hb[7] = be.a(var2, (byte) 85);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2 = o.a((byte) 76, "achievement_names,8");
              if (null == var2) {
                break L28;
              } else {
                rb.field_hb[8] = be.a(var2, (byte) -28);
                break L28;
              }
            }
            L29: {
              var2 = o.a((byte) 76, "achievement_names,9");
              if (null == var2) {
                break L29;
              } else {
                rb.field_hb[9] = be.a(var2, (byte) 70);
                break L29;
              }
            }
            L30: {
              var2 = o.a((byte) 76, "achievement_criteria,0");
              if (null == var2) {
                break L30;
              } else {
                ki.field_r[0] = be.a(var2, (byte) 87);
                break L30;
              }
            }
            L31: {
              var2 = o.a((byte) 76, "achievement_criteria,1");
              if (null != var2) {
                ki.field_r[1] = be.a(var2, (byte) -122);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2 = o.a((byte) 76, "achievement_criteria,2");
              if (null == var2) {
                break L32;
              } else {
                ki.field_r[2] = be.a(var2, (byte) 92);
                break L32;
              }
            }
            L33: {
              var2 = o.a((byte) 76, "achievement_criteria,3");
              if (var2 == null) {
                break L33;
              } else {
                ki.field_r[3] = be.a(var2, (byte) 84);
                break L33;
              }
            }
            L34: {
              var2 = o.a((byte) 76, "achievement_criteria,4");
              if (var2 == null) {
                break L34;
              } else {
                ki.field_r[4] = be.a(var2, (byte) 65);
                break L34;
              }
            }
            var2 = o.a((byte) 76, "achievement_criteria,5");
            if (param0 == -9585) {
              L35: {
                if (null != var2) {
                  ki.field_r[5] = be.a(var2, (byte) 125);
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                var2 = o.a((byte) 76, "achievement_criteria,6");
                if (var2 == null) {
                  break L36;
                } else {
                  ki.field_r[6] = be.a(var2, (byte) -33);
                  break L36;
                }
              }
              L37: {
                var2 = o.a((byte) 76, "achievement_criteria,7");
                if (var2 == null) {
                  break L37;
                } else {
                  ki.field_r[7] = be.a(var2, (byte) -115);
                  break L37;
                }
              }
              L38: {
                var2 = o.a((byte) 76, "achievement_criteria,8");
                if (null != var2) {
                  ki.field_r[8] = be.a(var2, (byte) -106);
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                var2 = o.a((byte) 76, "achievement_criteria,9");
                if (null != var2) {
                  ki.field_r[9] = be.a(var2, (byte) 95);
                  break L39;
                } else {
                  break L39;
                }
              }
              gf.field_b = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L40: {
            var2_ref = decompiledCaughtException;
            stackOut_141_0 = (RuntimeException) var2_ref;
            stackOut_141_1 = new StringBuilder().append("rh.WA(").append(param0).append(',');
            stackIn_144_0 = stackOut_141_0;
            stackIn_144_1 = stackOut_141_1;
            stackIn_142_0 = stackOut_141_0;
            stackIn_142_1 = stackOut_141_1;
            if (param1 == null) {
              stackOut_144_0 = (RuntimeException) (Object) stackIn_144_0;
              stackOut_144_1 = (StringBuilder) (Object) stackIn_144_1;
              stackOut_144_2 = "null";
              stackIn_145_0 = stackOut_144_0;
              stackIn_145_1 = stackOut_144_1;
              stackIn_145_2 = stackOut_144_2;
              break L40;
            } else {
              stackOut_142_0 = (RuntimeException) (Object) stackIn_142_0;
              stackOut_142_1 = (StringBuilder) (Object) stackIn_142_1;
              stackOut_142_2 = "{...}";
              stackIn_145_0 = stackOut_142_0;
              stackIn_145_1 = stackOut_142_1;
              stackIn_145_2 = stackOut_142_2;
              break L40;
            }
          }
          throw la.a((Throwable) (Object) stackIn_145_0, stackIn_145_2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        try {
            ((rh) this).a(param0, 13361, tf.field_b + -param2 >> 1, param2, -param0 + uj.field_l >> 1);
            int var4_int = -46 / ((60 - param1) / 49);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "rh.AB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean k(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -23913) {
                break L1;
              } else {
                ((rh) this).field_z = false;
                break L1;
              }
            }
            L2: {
              var2_int = this.m(93);
              var3 = var2_int - ((rh) this).field_D;
              if (0 >= var3) {
                break L2;
              } else {
                ((rh) this).field_D = ((rh) this).field_D + (8 + (var3 + -1)) / 8;
                break L2;
              }
            }
            L3: {
              if (var3 >= 0) {
                break L3;
              } else {
                ((rh) this).field_D = ((rh) this).field_D + (1 + var3 - 16) / 16;
                break L3;
              }
            }
            L4: {
              L5: {
                if (((rh) this).field_D != 0) {
                  break L5;
                } else {
                  if (0 != var2_int) {
                    break L5;
                  } else {
                    if (((rh) this).field_z) {
                      break L5;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_19_0 = stackOut_16_0;
                      break L4;
                    }
                  }
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "rh.BA(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static void l(int param0) {
        RuntimeException var1 = null;
        hb var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var4_int = 0;
        String var5_ref_String = null;
        int var5 = 0;
        rb var6 = null;
        String var6_ref = null;
        String var7 = null;
        rb var7_ref = null;
        String var8 = null;
        rb var8_ref = null;
        int var9 = 0;
        int stackIn_11_0 = 0;
        rb stackIn_52_0 = null;
        rb stackIn_57_0 = null;
        RuntimeException decompiledCaughtException = null;
        rb stackOut_51_0 = null;
        rb stackOut_56_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = MonkeyPuzzle2.field_D;
            var2 = -22 % ((param0 - 37) / 33);
            var3 = var1_ref.a((byte) 114);
            if (var3 != 0) {
              if (var3 == 1) {
                L1: {
                  if (null == pj.field_a) {
                    pj.field_a = new vd(128);
                    nc.field_f = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var4 = var1_ref.f(-1);
                  if (var4.equals((Object) (Object) "")) {
                    var4 = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var5_ref_String = var1_ref.f(-1);
                  var6_ref = var1_ref.f(-1);
                  var7_ref = ch.a(var5_ref_String, -1);
                  if (var7_ref != null) {
                    break L3;
                  } else {
                    var7_ref = ch.a(var6_ref, -1);
                    if (var7_ref == null) {
                      break L3;
                    } else {
                      pj.field_a.a((bf) (Object) var7_ref, (long)pl.a((byte) 123, (CharSequence) (Object) var5_ref_String).hashCode(), -101);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null == var7_ref) {
                    var7_ref = new rb();
                    pj.field_a.a((bf) (Object) var7_ref, (long)pl.a((byte) 109, (CharSequence) (Object) var5_ref_String).hashCode(), -98);
                    int fieldTemp$3 = nc.field_f;
                    nc.field_f = nc.field_f + 1;
                    var7_ref.field_gb = fieldTemp$3;
                    kc.field_a.a(-8212, (ug) (Object) var7_ref);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var4 == null) {
                    break L5;
                  } else {
                    var4 = var4.intern();
                    break L5;
                  }
                }
                var7_ref.field_bb = var4;
                var7_ref.field_db = var5_ref_String;
                var7_ref.c(-19822);
                var8_ref = (rb) (Object) kc.field_a.a((byte) -117);
                L6: while (true) {
                  L7: {
                    L8: {
                      if (null == var8_ref) {
                        break L8;
                      } else {
                        stackOut_51_0 = (rb) var8_ref;
                        stackIn_57_0 = stackOut_51_0;
                        stackIn_52_0 = stackOut_51_0;
                        if (var9 != 0) {
                          break L7;
                        } else {
                          if (!ld.a(stackIn_52_0, -24612, var7_ref)) {
                            break L8;
                          } else {
                            var8_ref = (rb) (Object) kc.field_a.d((byte) 63);
                            if (var9 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    stackOut_56_0 = (rb) var8_ref;
                    stackIn_57_0 = stackOut_56_0;
                    break L7;
                  }
                  L9: {
                    L10: {
                      if (stackIn_57_0 != null) {
                        break L10;
                      } else {
                        kc.field_a.a(-8212, (ug) (Object) var7_ref);
                        if (var9 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ja.a((ug) (Object) var8_ref, (ug) (Object) var7_ref, -99);
                    break L9;
                  }
                  return;
                }
              } else {
                if (var3 != 2) {
                  if (3 == var3) {
                    L11: {
                      if (ci.field_b == 2) {
                        ci.field_b = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return;
                  } else {
                    if (var3 != 4) {
                      kk.a("F1: " + bh.a((byte) -109), (byte) 115, (Throwable) null);
                      gk.a(-1);
                      break L0;
                    } else {
                      ci.field_b = 1;
                      var4 = var1_ref.f(-1);
                      cm.field_G = var4.intern();
                      var5 = var1_ref.a((byte) 114);
                      cm.a(var5, (byte) -117);
                      return;
                    }
                  }
                } else {
                  L12: {
                    if (ci.field_b != 1) {
                      break L12;
                    } else {
                      ci.field_b = 2;
                      break L12;
                    }
                  }
                  return;
                }
              }
            } else {
              L13: {
                if (null != ah.field_b) {
                  break L13;
                } else {
                  ah.field_b = new vd(128);
                  jj.field_F = 0;
                  break L13;
                }
              }
              L14: {
                if (var1_ref.a((byte) 114) != 1) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L14;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L14;
                }
              }
              L15: {
                var4_int = stackIn_11_0;
                var5_ref_String = var1_ref.f(-1);
                if (var4_int == 0) {
                  break L15;
                } else {
                  String discarded$4 = var1_ref.f(-1);
                  break L15;
                }
              }
              L16: {
                var6 = ja.a(var5_ref_String, -1684349368);
                var7 = var1_ref.f(-1);
                var8 = pl.a((byte) 115, (CharSequence) (Object) var5_ref_String);
                if (null == var8) {
                  var8 = var5_ref_String;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (null != var6) {
                  break L17;
                } else {
                  var6 = ja.a(var7, -1684349368);
                  if (var6 == null) {
                    break L17;
                  } else {
                    ah.field_b.a((bf) (Object) var6, (long)var8.hashCode(), -90);
                    break L17;
                  }
                }
              }
              L18: {
                if (var6 == null) {
                  var6 = new rb();
                  ah.field_b.a((bf) (Object) var6, (long)var8.hashCode(), -98);
                  int fieldTemp$5 = jj.field_F;
                  jj.field_F = jj.field_F + 1;
                  var6.field_gb = fieldTemp$5;
                  wl.field_d.a(-8212, (ug) (Object) var6);
                  break L18;
                } else {
                  break L18;
                }
              }
              var6.field_db = var5_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "rh.DB(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = true;
    }
}
