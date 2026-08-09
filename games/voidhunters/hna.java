/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hna extends pca implements ntb {
    int field_q;
    int field_p;
    static int field_s;
    static int field_n;
    tw field_r;
    int field_o;

    public final void b(faa param0, int param1) {
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
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
              super.b(param0, -123);
              if (param1 <= -109) {
                break L1;
              } else {
                this.field_q = 115;
                break L1;
              }
            }
            L2: {
              param0.a(-632, this.field_o, 16);
              param0.a(-632, this.field_p, 32);
              param0.a(-632, this.field_q, 32);
              stackIn_4_0 = (faa) (param0);

              stackIn_4_1 = -126;

              if (this.field_r == null) {
                stackIn_5_0 = (faa) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = 0;
                break L2;
              } else {
                stackIn_5_0 = (faa) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = 1;
                break L2;
              }
            }
            L3: {
              if (!vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 != 0)) {
                break L3;
              } else {
                this.field_r.b(param0, -115);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("hna.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        hna var3 = null;
        hna var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var4 = (hna) ((Object) param1);
              var3 = var4;
              super.b((byte) 88, param1);
              var4.field_p = this.field_p;
              if (param0 >= 54) {
                break L1;
              } else {
                field_n = 80;
                break L1;
              }
            }
            L2: {
              var4.field_o = this.field_o;
              var4.field_q = this.field_q;
              if (null != this.field_r) {
                L3: {
                  if (var3.field_r != null) {
                    break L3;
                  } else {
                    var3.field_r = new tw();
                    break L3;
                  }
                }
                this.field_r.b((byte) 127, var3.field_r);
                break L2;
              } else {
                var4.field_r = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("hna.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(pe param0, lta param1, boolean param2, byte param3) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lta var13 = null;
        Random var14 = null;
        aja var15 = null;
        lta var16 = null;
        aja var17 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = param0.g((byte) -122) >> 31512513;
            if (param3 == -59) {
              L1: {
                var5 = param0.m(1) >> -1426174623;
                if (hbb.field_z <= 0) {
                  break L1;
                } else {
                  var14 = new Random(234890L);
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= hbb.field_z) {
                      break L1;
                    } else {
                      L3: {
                        var8 = hob.a(var14, param0.g((byte) -122), 127) - var4_int;
                        var9 = -var5 + hob.a(var14, param0.m(1), param3 + 175);
                        var10 = hob.a(var14, 800, param3 + 179) - -200;
                        var11 = (int)(param1.field_a * (float)(var10 << -668128952));
                        if ((var11 ^ -1) >= -256) {
                          break L3;
                        } else {
                          var11 = 255;
                          break L3;
                        }
                      }
                      jj.a(8947865, (byte) 7, param1.b(true, var9), (float)(int)((float)var10 * param1.field_a), var11, param1.a(var8, (byte) 121));
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
              L4: {
                if (!li.field_i) {
                  break L4;
                } else {
                  if ((via.field_b ^ -1) == -2) {
                    L5: {
                      L6: {
                        var13 = new lta();
                        var16 = var13;
                        var16.field_d = param1.field_d;
                        var16.field_e = param1.field_e;
                        if (1 == tkb.field_p) {
                          break L6;
                        } else {
                          if (null != psb.field_b) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var16.field_b = param1.field_b;
                      var16.field_a = param1.field_a / 32.0f + 0.00011081559932790697f;
                      var13.field_c = param1.field_c;
                      var15 = mmb.field_d[7];
                      var8 = 4194304;
                      lo.a(0, var8, var15, var16);
                      break L5;
                    }
                    if (jnb.field_o != 1) {
                      break L4;
                    } else {
                      var16.field_c = param1.field_c;
                      var16.field_a = param1.field_a / 64.0f + 0.00005540779966395348f;
                      var13.field_b = param1.field_b;
                      var17 = mmb.field_d[6];
                      var8 = 4194304;
                      lo.a(0, var8, var17, var16);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                var6 = param1.a(-var4_int, (byte) 124) - 1;
                var7 = param1.a(var4_int, (byte) 123) + 1;
                var8 = -1 + param1.b(true, -var5);
                var9 = param1.b(true, var5) - -1;
                if (li.field_i) {
                  if (!ceb.field_p) {
                    break L7;
                  } else {
                    og.field_r.U(var6, var8, var7 + -var6, 16777215, 0);
                    og.field_r.U(var6, var9, -var6 + var7, 16777215, 0);
                    og.field_r.P(var6, var8, -var8 + var9, 16777215, 0);
                    og.field_r.P(var7, var8, -var8 + var9, 16777215, 0);
                    break L7;
                  }
                } else {
                  dma.h(var6, var8, -var6 + var7, 16777215);
                  dma.h(var6, var9, -var6 + var7, 16777215);
                  dma.d(var6, var8, var9 - var8, 16777215);
                  dma.d(var7, var8, var9 - var8, 16777215);
                  break L7;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("hna.E(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        hna var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (hna) ((Object) param1);
                var4 = -118 / ((param0 - 22) / 59);
                if (super.a((byte) 90, param1)) {
                  break L2;
                } else {
                  if (this.field_o != var3.field_o) {
                    break L2;
                  } else {
                    if (this.field_p != var3.field_p) {
                      break L2;
                    } else {
                      if (var3.field_q != this.field_q) {
                        break L2;
                      } else {
                        L3: {
                          if (var3.field_r != null) {
                            stackIn_7_0 = 0;
                            break L3;
                          } else {
                            stackIn_7_0 = 1;
                            break L3;
                          }
                        }
                        L4: {


                          if (this.field_r != null) {

                            stackIn_10_1 = 0;
                            break L4;
                          } else {

                            stackIn_10_1 = 1;
                            break L4;
                          }
                        }
                        if ((stackIn_7_0 ^ stackIn_10_1) != 0) {
                          break L2;
                        } else {
                          L5: {
                            if (this.field_r == null) {
                              break L5;
                            } else {
                              if (!this.field_r.a((byte) 94, var3.field_r)) {
                                break L5;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackIn_16_0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_16_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("hna.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              this.field_o = param0.i(0, 16);
              this.field_p = param0.i(0, 32);
              this.field_q = param0.i(0, 32);
              if (kv.a(false, param0)) {
                L2: {
                  if (this.field_r != null) {
                    break L2;
                  } else {
                    this.field_r = new tw();
                    break L2;
                  }
                }
                this.field_r.a(param0, false);
                break L1;
              } else {
                this.field_r = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("hna.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_r = new tw();
        if (param2 != -30790) {
            this.field_r = (tw) null;
        }
        this.field_r.field_c = new dv(param1, param0);
    }

    public final void a(tv param0, int param1) {
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        hna var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -94);
              var5 = (hna) ((Object) param0);
              if (null == this.field_r) {
                break L1;
              } else {
                if (null == var5.field_r) {
                  break L1;
                } else {
                  this.field_r.a(var5.field_r, -51);
                  break L1;
                }
              }
            }
            L2: {
              var4 = 0;
              if (this.field_o == var5.field_o) {
                break L2;
              } else {
                System.out.println("int triggers has changed. before=" + var5.field_o + ", now=" + this.field_o);
                var4 = 1;
                break L2;
              }
            }
            L3: {
              if (var5.field_p == this.field_p) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int mousex has changed. before=" + var5.field_p + ", now=" + this.field_p);
                break L3;
              }
            }
            if (param1 <= -19) {
              L4: {
                if (this.field_q != var5.field_q) {
                  System.out.println("int mousey has changed. before=" + var5.field_q + ", now=" + this.field_q);
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (this.field_r != null) {
                  stackIn_15_0 = 0;
                  break L5;
                } else {
                  stackIn_15_0 = 1;
                  break L5;
                }
              }
              L6: {


                if (null != var5.field_r) {

                  stackIn_18_1 = 0;
                  break L6;
                } else {

                  stackIn_18_1 = 1;
                  break L6;
                }
              }
              L7: {
                L8: {
                  if ((stackIn_15_0 ^ stackIn_18_1) != 0) {
                    break L8;
                  } else {
                    if (null == this.field_r) {
                      break L7;
                    } else {
                      if (this.field_r.a((byte) 84, var5.field_r)) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                System.out.println("SpecialOrderSubmessage special_order_submessage has changed. before=" + var5.field_r + ", now=" + this.field_r);
                var4 = 1;
                break L7;
              }
              L9: {
                if (var4 == 0) {
                  break L9;
                } else {
                  System.out.println("This instance of PlayerAction has changed");
                  break L9;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("hna.F(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(mfa param0, int param1, tja param2) {
        tfa stackIn_26_0 = null;
        tfa stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var4 = null;
        tfa var5 = null;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        rsb var9 = null;
        sg var10 = null;
        sg var11 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (!this.c(-12)) {
              if (param1 == 0) {
                L1: {
                  L2: {
                    var9 = (rsb) ((Object) param2);
                    if (null == this.field_r) {
                      break L2;
                    } else {
                      if (null == this.field_r.field_d) {
                        break L2;
                      } else {
                        var9.field_f.a(param1 ^ 42, this.field_r.field_d);
                        break L1;
                      }
                    }
                  }
                  L3: {
                    var5 = var9.a(this.field_k, (byte) 59);
                    if (this.field_r == null) {
                      break L3;
                    } else {
                      if (this.field_r.field_e == null) {
                        break L3;
                      } else {
                        if (var5.field_m == this.field_r.field_e.field_a) {
                          var9.field_g.g(-1, this.field_k);
                          break L1;
                        } else {
                          var5.field_m = this.field_r.field_e.field_a;
                          break L1;
                        }
                      }
                    }
                  }
                  L4: {
                    if (this.field_r == null) {
                      break L4;
                    } else {
                      if (this.field_r.field_c == null) {
                        break L4;
                      } else {
                        if (this.field_r.field_c.field_a) {
                          var5.a(this.field_r.field_c.field_e, (byte) -66);
                          break L1;
                        } else {
                          var6 = var9.field_e.e(8);
                          if (var6 != 1) {
                            if (2 != var6) {
                              break L1;
                            } else {
                              var5.a(30, this.field_r.field_c.field_e, 30024, 14, ena.field_q);
                              break L1;
                            }
                          } else {
                            var5.a(13, this.field_r.field_c.field_e, 30024, 0, sl.field_a);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if (this.field_r == null) {
                      break L5;
                    } else {
                      if (this.field_r.field_a != null) {
                        var11 = var9.field_g.d(this.field_k, 80);
                        if (var11 != null) {
                          var11.a((byte) 34, this.field_r.field_a);
                          break L1;
                        } else {
                          if (cg.a((byte) -128, var9.field_g.d(false))) {
                            var10 = new sg();
                            try {
                              L6: {
                                var10.field_k = qia.a(param1 + 1, this.field_r.field_a.field_c);
                                var10.e((byte) 119);
                                var10.field_k.a((byte) 0, (anb) (var10));
                                var5.field_g = var10;
                                var9.field_g.g(param1 + -1, this.field_k);
                                break L6;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L7: {
                                var7 = (Exception) (Object) decompiledCaughtException;
                                hh.a((Throwable) ((Object) var7), true, "Invalid blueprint action from player " + this.field_k + " AKA " + param0.a(1, this.field_k));
                                break L7;
                              }
                            }
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    stackIn_26_0 = (tfa) (var5);

                    if (this.field_r == null) {
                      stackIn_27_0 = (tfa) ((Object) stackIn_26_0);
                      stackIn_27_1 = -1;
                      break L8;
                    } else {
                      stackIn_27_0 = (tfa) ((Object) stackIn_26_0);
                      stackIn_27_1 = this.field_r.field_b;
                      break L8;
                    }
                  }
                  L9: {
                    stackIn_27_0.field_b = stackIn_27_1;
                    var5.field_f = this.field_o;
                    if (fra.field_a == 0) {
                      break L9;
                    } else {
                      if (1 != (this.field_p ^ -1)) {
                        break L9;
                      } else {
                        if (1 != (this.field_q ^ -1)) {
                          break L9;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  var5.field_e = this.field_q;
                  var5.field_d = this.field_p;
                  break L1;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("hna.A(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_46_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L11;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_44_0), stackIn_47_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final String toString() {
        return "Tick=" + this.field_e + ", system=" + this.field_d + ", playerid=" + this.field_k + ",triggers=" + this.field_o + ", mousex=" + this.field_p + ", mousey=" + this.field_q + " specialorder=" + this.field_r;
    }

    public hna() {
    }

    static {
        field_s = 1;
        field_n = 88;
        qb discarded$0 = new qb();
    }
}
