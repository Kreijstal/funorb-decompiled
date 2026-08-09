/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class me extends wb {
    private jn field_fb;
    private int field_cb;
    private int field_db;
    private int field_hb;
    private int field_gb;
    private int field_eb;
    private ag field_bb;
    private je field_ab;
    static bd[] field_ib;

    final void o(int param0) {
        if (bf.field_j != this.field_ab) {
          this.field_gb = 0;
          this.field_ab = u.field_d;
          this.a(this.field_bb, -9797);
          this.field_bb = null;
          if (param0 != 20) {
            this.field_bb = (ag) null;
            this.field_fb.field_D = 0;
            return;
          } else {
            this.field_fb.field_D = 0;
            return;
          }
        } else {
          return;
        }
    }

    void b(ag param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == 110) {
                break L1;
              } else {
                this.field_bb = (ag) null;
                break L1;
              }
            }
            L2: {
              L3: {
                this.field_bb = param0;
                if (this.field_ab == oa.field_k) {
                  break L3;
                } else {
                  L4: {
                    if (this.field_ab == bf.field_j) {
                      break L4;
                    } else {
                      this.field_ab = bf.field_j;
                      this.field_gb = 0;
                      if (!HostileSpawn.field_I) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  break L2;
                }
              }
              this.a(this.field_eb, 12 + this.field_bb.field_s, 88, this.field_bb.field_x + 12 - -this.field_cb);
              this.field_gb = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("me.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 != -56) {
            me.f((byte) 91);
            field_ib = null;
            return;
        }
        field_ib = null;
    }

    final static boolean a(boolean param0, int param1) {
        try {
            long dupTemp$1 = 0L;
            en var2 = null;
            IOException var2_ref = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null != oa.field_l) {
                break L0;
              } else {
                oa.field_l = uj.field_k.a(uc.field_d, 101, cb.field_c);
                break L0;
              }
            }
            if (param1 >= 87) {
              if (oa.field_l.field_f == 0) {
                return false;
              } else {
                dupTemp$1 = hn.a((byte) 80);
                gf.field_h = dupTemp$1;
                bb.field_c = dupTemp$1;
                if (oa.field_l.field_f != 1) {
                  rc.field_a = sg.field_c;
                  oa.field_l = null;
                  return true;
                } else {
                  try {
                    L1: {
                      L2: {
                        ag.field_t = new td((java.net.Socket) (oa.field_l.field_c), uj.field_k);
                        s.field_b.field_i = 0;
                        var2 = sc.field_g;
                        if (param0) {
                          stackIn_11_0 = -2;
                          break L2;
                        } else {
                          stackIn_11_0 = -1;
                          break L2;
                        }
                      }
                      bj.field_f = stackIn_11_0;
                      ae.field_u = stackIn_11_0;
                      ne.field_o = stackIn_11_0;
                      rc.field_a = sa.field_c;
                      var2.field_i = 0;
                      hm.a(og.field_c, rl.field_b, s.field_b, ea.field_c, 4122);
                      mb.d(-1, -22370);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                    rc.field_a = sg.field_c;
                    if (HostileSpawn.field_I) {
                      rc.field_a = sg.field_c;
                      oa.field_l = null;
                      return true;
                    } else {
                      oa.field_l = null;
                      return true;
                    }
                  }
                  oa.field_l = null;
                  return true;
                }
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean l(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        ag var4;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 == 65393) {
          if (this.field_ab != null) {
            if (bf.field_j != this.field_ab) {
              if (this.field_ab == u.field_d) {
                fieldTemp$0 = this.field_gb + 1;
                this.field_gb = this.field_gb + 1;
                if (this.field_db != fieldTemp$0) {
                  this.field_fb.field_D = (this.field_gb << -754436728) / this.field_db;
                  if (var3 != 0) {
                    this.field_fb.field_D = 256;
                    this.field_ab = null;
                    return super.l(65393);
                  } else {
                    return super.l(65393);
                  }
                } else {
                  this.field_fb.field_D = 256;
                  this.field_ab = null;
                  return super.l(65393);
                }
              } else {
                return super.l(65393);
              }
            } else {
              fieldTemp$1 = this.field_gb + 1;
              this.field_gb = this.field_gb + 1;
              if (fieldTemp$1 != this.field_hb) {
                this.field_fb.field_D = 256 + -((this.field_gb << 766918760) / this.field_hb);
                if (var3 != 0) {
                  if (this.field_ab == u.field_d) {
                    fieldTemp$2 = this.field_gb + 1;
                    this.field_gb = this.field_gb + 1;
                    if (this.field_db == fieldTemp$2) {
                      this.field_fb.field_D = 256;
                      this.field_ab = null;
                      return super.l(65393);
                    } else {
                      this.field_fb.field_D = (this.field_gb << -754436728) / this.field_db;
                      this.field_fb.field_D = 256;
                      this.field_ab = null;
                      return super.l(65393);
                    }
                  } else {
                    return super.l(65393);
                  }
                } else {
                  return super.l(65393);
                }
              } else {
                this.field_ab = oa.field_k;
                this.a(this.field_eb, 12 + this.field_bb.field_s, 121, this.field_bb.field_x + this.field_cb + 12);
                this.field_gb = 0;
                this.field_fb.field_D = 0;
                if (var3 != 0) {
                  this.field_fb.field_D = 256 + -((this.field_gb << 766918760) / this.field_hb);
                  if (var3 != 0) {
                    if (this.field_ab == u.field_d) {
                      fieldTemp$3 = this.field_gb + 1;
                      this.field_gb = this.field_gb + 1;
                      if (this.field_db != fieldTemp$3) {
                        this.field_fb.field_D = (this.field_gb << -754436728) / this.field_db;
                        if (var3 != 0) {
                          this.field_fb.field_D = 256;
                          this.field_ab = null;
                          return super.l(65393);
                        } else {
                          return super.l(65393);
                        }
                      } else {
                        this.field_fb.field_D = 256;
                        this.field_ab = null;
                        return super.l(65393);
                      }
                    } else {
                      return super.l(65393);
                    }
                  } else {
                    return super.l(65393);
                  }
                } else {
                  return super.l(65393);
                }
              }
            }
          } else {
            return super.l(65393);
          }
        } else {
          var4 = (ag) null;
          this.b((ag) null, (byte) 96);
          if (this.field_ab != null) {
            if (bf.field_j == this.field_ab) {
              fieldTemp$4 = this.field_gb + 1;
              this.field_gb = this.field_gb + 1;
              if (fieldTemp$4 == this.field_hb) {
                this.field_ab = oa.field_k;
                this.a(this.field_eb, 12 + this.field_bb.field_s, 121, this.field_bb.field_x + this.field_cb + 12);
                this.field_gb = 0;
                this.field_fb.field_D = 0;
                if (var3 != 0) {
                  this.field_fb.field_D = 256 + -((this.field_gb << 766918760) / this.field_hb);
                  if (this.field_ab == u.field_d) {
                    fieldTemp$5 = this.field_gb + 1;
                    this.field_gb = this.field_gb + 1;
                    if (this.field_db == fieldTemp$5) {
                      this.field_fb.field_D = 256;
                      this.field_ab = null;
                      return super.l(65393);
                    } else {
                      this.field_fb.field_D = (this.field_gb << -754436728) / this.field_db;
                      this.field_fb.field_D = 256;
                      this.field_ab = null;
                      return super.l(65393);
                    }
                  } else {
                    return super.l(65393);
                  }
                } else {
                  return super.l(65393);
                }
              } else {
                L0: {
                  this.field_fb.field_D = 256 + -((this.field_gb << 766918760) / this.field_hb);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    if (this.field_ab != u.field_d) {
                      break L0;
                    } else {
                      fieldTemp$6 = this.field_gb + 1;
                      this.field_gb = this.field_gb + 1;
                      if (this.field_db == fieldTemp$6) {
                        this.field_fb.field_D = 256;
                        this.field_ab = null;
                        break L0;
                      } else {
                        this.field_fb.field_D = (this.field_gb << -754436728) / this.field_db;
                        this.field_fb.field_D = 256;
                        this.field_ab = null;
                        break L0;
                      }
                    }
                  }
                }
                return super.l(65393);
              }
            } else {
              L1: {
                if (this.field_ab != u.field_d) {
                  break L1;
                } else {
                  fieldTemp$7 = this.field_gb + 1;
                  this.field_gb = this.field_gb + 1;
                  if (this.field_db == fieldTemp$7) {
                    this.field_fb.field_D = 256;
                    this.field_ab = null;
                    break L1;
                  } else {
                    this.field_fb.field_D = (this.field_gb << -754436728) / this.field_db;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      this.field_fb.field_D = 256;
                      this.field_ab = null;
                      break L1;
                    }
                  }
                }
              }
              return super.l(65393);
            }
          } else {
            return super.l(65393);
          }
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            int var2_int = -39 / ((param1 - 44) / 60);
            param0.addKeyListener(nj.field_c);
            param0.addFocusListener(nj.field_c);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "me.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 != -15953) {
            return false;
        }
        this.m(-92);
        return super.j(-15953);
    }

    final void m(int param0) {
        if (null == this.field_ab) {
          if (param0 > 0) {
            field_ib = (bd[]) null;
            super.m(-3);
            return;
          } else {
            super.m(-3);
            return;
          }
        } else {
          if (this.field_ab == u.field_d) {
            this.field_fb.field_D = 256;
            this.field_ab = null;
            if (param0 <= 0) {
              super.m(-3);
              return;
            } else {
              field_ib = (bd[]) null;
              super.m(-3);
              return;
            }
          } else {
            this.a(this.field_bb.field_s + 12, 15767, this.field_bb.field_x + 12 + this.field_cb);
            this.a(this.field_bb, -9797);
            this.field_fb.field_D = 256;
            this.field_ab = null;
            if (param0 <= 0) {
              super.m(-3);
              return;
            } else {
              field_ib = (bd[]) null;
              super.m(-3);
              return;
            }
          }
        }
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == this.field_fb) {
                  break L1;
                } else {
                  L2: {
                    if (-99 != (param2 ^ -1)) {
                      break L2;
                    } else {
                      this.field_fb.a((byte) -109, param1);
                      break L2;
                    }
                  }
                  if (-100 == (param2 ^ -1)) {
                    this.field_fb.a((byte) -73, param1);
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("me.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final void a(ag param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -9797) {
                break L1;
              } else {
                this.j(1);
                break L1;
              }
            }
            L2: {
              if (this.field_fb != null) {
                this.field_fb.b(121);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (param0 == null) {
                  break L4;
                } else {
                  param0.a(param0.field_s, 6 + this.field_cb, 0, 6, param0.field_x);
                  this.field_fb = new jn(param0);
                  if (!HostileSpawn.field_I) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_fb = new jn();
              break L3;
            }
            this.a(51448, this.field_fb);
            this.field_bb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("me.T(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final static void b(int param0, int param1) {
        try {
            Object stackIn_6_0 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var2_int = 0;
            RuntimeException var2 = null;
            int var3 = 0;
            Object var4 = null;
            bd var5 = null;
            int[] var6 = null;
            int var7_int = 0;
            Object var7 = null;
            java.awt.Cursor var7_ref = null;
            Object var8 = null;
            IllegalAccessException var8_ref = null;
            InstantiationException var8_ref2 = null;
            java.lang.reflect.InvocationTargetException var8_ref3 = null;
            int var9 = 0;
            Object var10 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = HostileSpawn.field_I ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1 != qm.field_R) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            var2_int = 15;
                            qm.field_R = param1;
                            var3 = 15;
                            if (null == wa.field_q) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackIn_6_0 = wa.field_q;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackIn_6_0 = se.field_h;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var4 = stackIn_6_0;
                            if (0 != param1) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((java.awt.Canvas) (var4)).setCursor((java.awt.Cursor) null);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            if (!cc.a((byte) -102)) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        try {
                            if (param0 > 83) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            field_ib = (bd[]) null;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var5 = ee.field_d[-1 + param1];
                            var6 = new int[var5.field_D.length];
                            var7_int = 0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var6.length <= var7_int) {
                                statePc = 21;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (0 == var5.field_D[var7_int]) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var6[var7_int] = ll.a(var5.field_D[var7_int], -16777216);
                            if (var9 == 0) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var6[var7_int] = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var7_int++;
                            if (var9 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var7 = null;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var10 = od.field_F.newInstance(new Object[]{new Integer(var5.field_z), new Integer(var5.field_A), new Integer(le.field_eb)});
                            var8 = var10;
                            aa.field_e.invoke(var8, new Object[]{new Integer(0), new Integer(0), new Integer(var5.field_z), new Integer(var5.field_A), var6, new Integer(0), new Integer(var5.field_z)});
                            var7_ref = (java.awt.Cursor) (kh.field_eb.invoke((Object) (((java.awt.Canvas) (var4)).getToolkit()), new Object[]{var10, new java.awt.Point(var2_int, var3), "FunOrb Custom Cursor"}));
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = ((Object) stateCaught_22 instanceof IllegalAccessException ? 24 : ((Object) stateCaught_22 instanceof InstantiationException ? 25 : ((Object) stateCaught_22 instanceof java.lang.reflect.InvocationTargetException ? 26 : 29)));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var8_ref = (IllegalAccessException) ((Object) caughtException);
                            kh.field_eb = null;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var8_ref2 = (InstantiationException) ((Object) caughtException);
                            throw new RuntimeException();
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var8_ref3 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            throw new RuntimeException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((java.awt.Canvas) (var4)).setCursor(var7_ref);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        var2 = (RuntimeException) ((Object) caughtException);
                        throw wg.a((Throwable) ((Object) var2), "me.Q(" + param0 + ',' + param1 + ')');
                    }
                    case 30: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    me(gg param0, ag param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_s, param2 + 12 - -param1.field_x);
        try {
            this.field_eb = param4;
            this.field_cb = param2;
            this.field_db = param3;
            this.field_hb = param3;
            this.a(param1, -9797);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
