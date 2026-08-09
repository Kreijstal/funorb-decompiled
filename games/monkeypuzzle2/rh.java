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
        try {
          L0: {
            L1: {
              if (param0 > 11) {
                break L1;
              } else {
                this.k(74);
                break L1;
              }
            }
            L2: {
              if (!this.field_z) {
                stackIn_11_0 = 0;
                break L2;
              } else {
                if (this == this.field_A.j(-106)) {
                  stackIn_11_0 = 256;
                  break L2;
                } else {
                  stackIn_11_0 = 0;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "rh.EB(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final we a(boolean param0) {
        we var2 = null;
        RuntimeException var2_ref = null;
        we stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = super.a(param0);
            if (null != var2) {
              stackIn_4_0 = (we) (var2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_B = true;
                  break L1;
                }
              }
              stackIn_9_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "rh.CB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return (we) (this);
        }
    }

    final static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -117) {
                break L1;
              } else {
                rh.a(-20);
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
          throw la.a((Throwable) ((Object) var1), "rh.SA(" + param0 + ')');
        }
    }

    rh(kj param0, int param1, int param2) {
        super(tf.field_b + -param1 >> 897308769, uj.field_l - param2 >> 2142624417, param1, param2, (ml) null);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_A = param0;
            this.field_z = false;
            this.field_D = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("rh.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              stackIn_4_0 = mg.field_s;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -111;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "rh.BB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (this.field_D == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (256 > this.field_D) {
                L1: {
                  L2: {
                    if (vg.field_M == null) {
                      break L2;
                    } else {
                      if (this.field_l > vg.field_M.field_k) {
                        break L2;
                      } else {
                        if ((vg.field_M.field_j ^ -1) <= (this.field_p ^ -1)) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  vg.field_M = new le(this.field_l, this.field_p);
                  break L1;
                }
                mc.a(param0 ^ -8495, vg.field_M);
                ge.d();
                this.a(false, 0, 0);
                super.a(param0, param1, -param2 - this.field_e, -this.field_r + -param3);
                tj.b(653);
                vg.field_M.b(this.field_r + param3, param2 + this.field_e, this.field_D);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if ((param1 ^ -1) == -1) {
                  this.a(false, param3 - -this.field_r, param2 - -this.field_e);
                  super.a(30, param1, param2, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var5), "rh.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    abstract void a(boolean param0, int param1, int param2);

    boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_D = this.m(108);
            if (!param0) {
              L1: {
                L2: {
                  if ((this.field_D ^ -1) != -1) {
                    break L2;
                  } else {
                    if (this.field_z) {
                      break L2;
                    } else {
                      stackIn_10_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "rh.Q(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static void a(int param0, ad param1) {
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_145_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              gf.field_b = param1;
              var2 = o.a((byte) 76, "score_colon_space");
              if (null != var2) {
                be.a(var2, (byte) 112);
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
                be.a(var2, (byte) 119);
                break L16;
              }
            }
            L17: {
              var2 = o.a((byte) 76, "close");
              if (var2 != null) {
                be.a(var2, (byte) -41);
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
                be.a(var2, (byte) 105);
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L40: {
            var2_ref = decompiledCaughtException;
            stackIn_144_0 = (RuntimeException) (var2_ref);

            stackIn_144_1 = new StringBuilder().append("rh.WA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_145_0 = (RuntimeException) ((Object) stackIn_144_0);
              stackIn_145_1 = (StringBuilder) ((Object) stackIn_144_1);
              stackIn_145_2 = "null";
              break L40;
            } else {
              stackIn_145_0 = (RuntimeException) ((Object) stackIn_144_0);
              stackIn_145_1 = (StringBuilder) ((Object) stackIn_144_1);
              stackIn_145_2 = "{...}";
              break L40;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_145_0), stackIn_145_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        try {
            this.a(param0, 13361, tf.field_b + -param2 >> -1889573727, param2, -param0 + uj.field_l >> 1879069089);
            int var4_int = -46 / ((60 - param1) / 49);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "rh.AB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean k(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -23913) {
                break L1;
              } else {
                this.field_z = false;
                break L1;
              }
            }
            L2: {
              var2_int = this.m(93);
              var3 = var2_int - this.field_D;
              if (0 >= var3) {
                break L2;
              } else {
                this.field_D = this.field_D + (8 + (var3 + -1)) / 8;
                break L2;
              }
            }
            L3: {
              if ((var3 ^ -1) <= -1) {
                break L3;
              } else {
                this.field_D = this.field_D + (1 + var3 - 16) / 16;
                break L3;
              }
            }
            L4: {
              L5: {
                if ((this.field_D ^ -1) != -1) {
                  break L5;
                } else {
                  if (0 != var2_int) {
                    break L5;
                  } else {
                    if (this.field_z) {
                      break L5;
                    } else {
                      stackIn_19_0 = 1;
                      break L4;
                    }
                  }
                }
              }
              stackIn_19_0 = 0;
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "rh.BA(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static void l(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        rb stackIn_57_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hb var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int var4_int = 0;
        String var5_ref_String = null;
        int var5 = 0;
        String var6 = null;
        rb var6_ref = null;
        rb var7 = null;
        String var7_ref = null;
        rb var8 = null;
        String var8_ref = null;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1 = MonkeyPuzzle2.field_D;
            var2 = -22 % ((param0 - 37) / 33);
            var3 = var1.a((byte) 114);
            if ((var3 ^ -1) != -1) {
              if (-2 == (var3 ^ -1)) {
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
                  var4 = var1.f(-1);
                  if (((String) (var4)).equals("")) {
                    var4 = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var5_ref_String = var1.f(-1);
                  var6 = var1.f(-1);
                  var7 = ch.a(var5_ref_String, -1);
                  if (var7 != null) {
                    break L3;
                  } else {
                    var7 = ch.a(var6, -1);
                    if (var7 == null) {
                      break L3;
                    } else {
                      pj.field_a.a(var7, (long)pl.a((byte) 123, (CharSequence) ((Object) var5_ref_String)).hashCode(), -101);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null == var7) {
                    var7 = new rb();
                    pj.field_a.a(var7, (long)pl.a((byte) 109, (CharSequence) ((Object) var5_ref_String)).hashCode(), -98);
                    fieldTemp$0 = nc.field_f;
                    nc.field_f = nc.field_f + 1;
                    var7.field_gb = fieldTemp$0;
                    kc.field_a.a(-8212, var7);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var4 == null) {
                    break L5;
                  } else {
                    var4 = ((String) (var4)).intern();
                    break L5;
                  }
                }
                var7.field_bb = (String) (var4);
                var7.field_db = var5_ref_String;
                var7.c(-19822);
                var8 = (rb) ((Object) kc.field_a.a((byte) -117));
                L6: while (true) {
                  L7: {
                    L8: {
                      if (null == var8) {
                        break L8;
                      } else {
                        stackIn_57_0 = (rb) (var8);

                        if (var9 != 0) {
                          break L7;
                        } else {
                          if (!ld.a(stackIn_57_0, -24612, var7)) {
                            break L8;
                          } else {
                            var8 = (rb) ((Object) kc.field_a.d((byte) 63));
                            if (var9 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    stackIn_57_0 = (rb) (var8);
                    break L7;
                  }
                  L9: {
                    L10: {
                      if (stackIn_57_0 != null) {
                        break L10;
                      } else {
                        kc.field_a.a(-8212, var7);
                        if (var9 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ja.a(var8, var7, -99);
                    break L9;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
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
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var3 != 4) {
                      kk.a("F1: " + bh.a((byte) -109), (byte) 115, (Throwable) null);
                      gk.a(-1);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      ci.field_b = 1;
                      var4 = var1.f(-1);
                      cm.field_G = ((String) (var4)).intern();
                      var5 = var1.a((byte) 114);
                      cm.a(var5, (byte) -117);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  L12: {
                    if ((ci.field_b ^ -1) != -2) {
                      break L12;
                    } else {
                      ci.field_b = 2;
                      break L12;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
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
                if (var1.a((byte) 114) != 1) {
                  stackIn_11_0 = 0;
                  break L14;
                } else {
                  stackIn_11_0 = 1;
                  break L14;
                }
              }
              L15: {
                var4_int = stackIn_11_0;
                var5_ref_String = var1.f(-1);
                if (var4_int == 0) {
                  break L15;
                } else {
                  var1.f(-1);
                  break L15;
                }
              }
              L16: {
                var6_ref = ja.a(var5_ref_String, -1684349368);
                var7_ref = var1.f(-1);
                var8_ref = pl.a((byte) 115, (CharSequence) ((Object) var5_ref_String));
                if (null == var8_ref) {
                  var8_ref = var5_ref_String;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (null != var6_ref) {
                  break L17;
                } else {
                  var6_ref = ja.a(var7_ref, -1684349368);
                  if (var6_ref == null) {
                    break L17;
                  } else {
                    ah.field_b.a(var6_ref, (long)var8_ref.hashCode(), -90);
                    break L17;
                  }
                }
              }
              L18: {
                if (var6_ref == null) {
                  var6_ref = new rb();
                  ah.field_b.a(var6_ref, (long)var8_ref.hashCode(), -98);
                  fieldTemp$1 = jj.field_F;
                  jj.field_F = jj.field_F + 1;
                  var6_ref.field_gb = fieldTemp$1;
                  wl.field_d.a(-8212, var6_ref);
                  break L18;
                } else {
                  break L18;
                }
              }
              var6_ref.field_db = var5_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "rh.DB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    static {
        field_B = true;
    }
}
