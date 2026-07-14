/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq extends sp implements oe, ai {
    private qq field_B;
    private wp field_A;
    pe field_E;
    static String field_D;
    private wp field_C;

    private final boolean e(byte param0) {
        if (param0 != 91) {
            return false;
        }
        if (this.a((op) (Object) ((vq) this).field_B, (byte) -116)) {
            return true;
        }
        return false;
    }

    private final boolean a(op param0, byte param1) {
        v var3 = param0.a(-120);
        if (!(var3 != null)) {
            return true;
        }
        int var5 = 12 / ((-67 - param1) / 45);
        gf var4 = var3.c(35);
        return qe.field_a == var4 ? true : false;
    }

    private final void e(boolean param0) {
        if (!this.e((byte) 91)) {
            return;
        }
        if (!param0) {
            return;
        }
        ld.a(((vq) this).field_B.field_m, (byte) -47);
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_7_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_87_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var23 = Sumoblitz.field_L ? 1 : 0;
        if (param3 <= 0) {
          if ((param5 ^ -1) < -1) {
            if (rm.a(param5, param1 + -23259)) {
              L0: {
                var7 = pc.a(param6, (byte) -83);
                var8 = 0;
                if (param3 >= param5) {
                  stackOut_86_0 = param5;
                  stackIn_87_0 = stackOut_86_0;
                  break L0;
                } else {
                  stackOut_85_0 = param3;
                  stackIn_87_0 = stackOut_85_0;
                  break L0;
                }
              }
              var9 = stackIn_87_0;
              if (param1 != 23143) {
                field_D = null;
                var10 = param3 >> 1147943617;
                var11 = param5 >> -690780479;
                var12 = param2;
                var13 = new byte[var7 * (var11 * var10)];
                L1: while (true) {
                  jaggl.OpenGL.glTexImage2Dub(param0, var8, param4, param3, param5, 0, param6, 5121, var12, 0);
                  if (var9 > 1) {
                    var16 = param3 * var7;
                    var17 = 0;
                    L2: while (true) {
                      if (var7 <= var17) {
                        var14 = var13;
                        var13 = var12;
                        param3 = var10;
                        var12 = var14;
                        param5 = var11;
                        var8++;
                        var10 = var10 >> 1;
                        var11 = var11 >> 1;
                        var9 = var9 >> 1;
                        continue L1;
                      } else {
                        var18 = var17;
                        var19 = var17;
                        var20 = var19 - -var16;
                        var21 = 0;
                        L3: while (true) {
                          if (var11 <= var21) {
                            var17++;
                            continue L2;
                          } else {
                            var22 = 0;
                            L4: while (true) {
                              if (var10 <= var22) {
                                var19 = var19 + var16;
                                var20 = var20 + var16;
                                var21++;
                                continue L3;
                              } else {
                                var15 = param2[var19];
                                var19 = var19 + var7;
                                var15 = var15 + param2[var19];
                                var19 = var19 + var7;
                                var15 = var15 + param2[var20];
                                var20 = var20 + var7;
                                var15 = var15 + param2[var20];
                                var13[var18] = (byte)(var15 >> 1620415074);
                                var20 = var20 + var7;
                                var18 = var18 + var7;
                                var22++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var10 = param3 >> 1147943617;
                var11 = param5 >> -690780479;
                var12 = param2;
                var13 = new byte[var7 * (var11 * var10)];
                L5: while (true) {
                  jaggl.OpenGL.glTexImage2Dub(param0, var8, param4, param3, param5, 0, param6, 5121, var12, 0);
                  if (var9 > 1) {
                    var16 = param3 * var7;
                    var17 = 0;
                    L6: while (true) {
                      if (var7 <= var17) {
                        var14 = var13;
                        var13 = var12;
                        param3 = var10;
                        var12 = var14;
                        param5 = var11;
                        var8++;
                        var10 = var10 >> 1;
                        var11 = var11 >> 1;
                        var9 = var9 >> 1;
                        continue L5;
                      } else {
                        var18 = var17;
                        var19 = var17;
                        var20 = var19 - -var16;
                        var21 = 0;
                        L7: while (true) {
                          if (var11 <= var21) {
                            var17++;
                            continue L6;
                          } else {
                            var22 = 0;
                            L8: while (true) {
                              if (var10 <= var22) {
                                var19 = var19 + var16;
                                var20 = var20 + var16;
                                var21++;
                                continue L7;
                              } else {
                                var15 = param2[var19];
                                var19 = var19 + var7;
                                var15 = var15 + param2[var19];
                                var19 = var19 + var7;
                                var15 = var15 + param2[var20];
                                var20 = var20 + var7;
                                var15 = var15 + param2[var20];
                                var13[var18] = (byte)(var15 >> 1620415074);
                                var20 = var20 + var7;
                                var18 = var18 + var7;
                                var22++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException("");
            }
          } else {
            L9: {
              var7 = pc.a(param6, (byte) -83);
              var8 = 0;
              if (param3 >= param5) {
                stackOut_51_0 = param5;
                stackIn_52_0 = stackOut_51_0;
                break L9;
              } else {
                stackOut_50_0 = param3;
                stackIn_52_0 = stackOut_50_0;
                break L9;
              }
            }
            var9 = stackIn_52_0;
            if (param1 != 23143) {
              field_D = null;
              var10 = param3 >> 1147943617;
              var11 = param5 >> -690780479;
              var12 = param2;
              var13 = new byte[var7 * (var11 * var10)];
              L10: while (true) {
                jaggl.OpenGL.glTexImage2Dub(param0, var8, param4, param3, param5, 0, param6, 5121, var12, 0);
                if (var9 > 1) {
                  var16 = param3 * var7;
                  var17 = 0;
                  L11: while (true) {
                    if (var7 <= var17) {
                      var14 = var13;
                      var13 = var12;
                      param3 = var10;
                      var12 = var14;
                      param5 = var11;
                      var8++;
                      var10 = var10 >> 1;
                      var11 = var11 >> 1;
                      var9 = var9 >> 1;
                      continue L10;
                    } else {
                      var18 = var17;
                      var19 = var17;
                      var20 = var19 - -var16;
                      var21 = 0;
                      L12: while (true) {
                        if (var11 <= var21) {
                          var17++;
                          continue L11;
                        } else {
                          var22 = 0;
                          L13: while (true) {
                            if (var10 <= var22) {
                              var19 = var19 + var16;
                              var20 = var20 + var16;
                              var21++;
                              continue L12;
                            } else {
                              var15 = param2[var19];
                              var19 = var19 + var7;
                              var15 = var15 + param2[var19];
                              var19 = var19 + var7;
                              var15 = var15 + param2[var20];
                              var20 = var20 + var7;
                              var15 = var15 + param2[var20];
                              var13[var18] = (byte)(var15 >> 1620415074);
                              var20 = var20 + var7;
                              var18 = var18 + var7;
                              var22++;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              var10 = param3 >> 1147943617;
              var11 = param5 >> -690780479;
              var12 = param2;
              var13 = new byte[var7 * (var11 * var10)];
              L14: while (true) {
                jaggl.OpenGL.glTexImage2Dub(param0, var8, param4, param3, param5, 0, param6, 5121, var12, 0);
                if (var9 > 1) {
                  var16 = param3 * var7;
                  var17 = 0;
                  L15: while (true) {
                    if (var7 <= var17) {
                      var14 = var13;
                      var13 = var12;
                      param3 = var10;
                      var12 = var14;
                      param5 = var11;
                      var8++;
                      var10 = var10 >> 1;
                      var11 = var11 >> 1;
                      var9 = var9 >> 1;
                      continue L14;
                    } else {
                      var18 = var17;
                      var19 = var17;
                      var20 = var19 - -var16;
                      var21 = 0;
                      L16: while (true) {
                        if (var11 <= var21) {
                          var17++;
                          continue L15;
                        } else {
                          var22 = 0;
                          L17: while (true) {
                            if (var10 <= var22) {
                              var19 = var19 + var16;
                              var20 = var20 + var16;
                              var21++;
                              continue L16;
                            } else {
                              var15 = param2[var19];
                              var19 = var19 + var7;
                              var15 = var15 + param2[var19];
                              var19 = var19 + var7;
                              var15 = var15 + param2[var20];
                              var20 = var20 + var7;
                              var15 = var15 + param2[var20];
                              var13[var18] = (byte)(var15 >> 1620415074);
                              var20 = var20 + var7;
                              var18 = var18 + var7;
                              var22++;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (rm.a(param3, -111)) {
            if ((param5 ^ -1) < -1) {
              if (rm.a(param5, param1 + -23259)) {
                L18: {
                  var7 = pc.a(param6, (byte) -83);
                  var8 = 0;
                  if (param3 >= param5) {
                    stackOut_29_0 = param5;
                    stackIn_30_0 = stackOut_29_0;
                    break L18;
                  } else {
                    stackOut_28_0 = param3;
                    stackIn_30_0 = stackOut_28_0;
                    break L18;
                  }
                }
                L19: {
                  var9 = stackIn_30_0;
                  if (param1 == 23143) {
                    var10 = param3 >> 1147943617;
                    var11 = param5 >> -690780479;
                    var12 = param2;
                    var13 = new byte[var7 * (var11 * var10)];
                    break L19;
                  } else {
                    field_D = null;
                    var10 = param3 >> 1147943617;
                    var11 = param5 >> -690780479;
                    var12 = param2;
                    var13 = new byte[var7 * (var11 * var10)];
                    break L19;
                  }
                }
                L20: while (true) {
                  jaggl.OpenGL.glTexImage2Dub(param0, var8, param4, param3, param5, 0, param6, 5121, var12, 0);
                  if (var9 > 1) {
                    var16 = param3 * var7;
                    var17 = 0;
                    L21: while (true) {
                      if (var7 <= var17) {
                        var14 = var13;
                        var13 = var12;
                        param3 = var10;
                        var12 = var14;
                        param5 = var11;
                        var8++;
                        var10 = var10 >> 1;
                        var11 = var11 >> 1;
                        var9 = var9 >> 1;
                        continue L20;
                      } else {
                        var18 = var17;
                        var19 = var17;
                        var20 = var19 - -var16;
                        var21 = 0;
                        L22: while (true) {
                          if (var11 <= var21) {
                            var17++;
                            continue L21;
                          } else {
                            var22 = 0;
                            L23: while (true) {
                              if (var10 <= var22) {
                                var19 = var19 + var16;
                                var20 = var20 + var16;
                                var21++;
                                continue L22;
                              } else {
                                var15 = param2[var19];
                                var19 = var19 + var7;
                                var15 = var15 + param2[var19];
                                var19 = var19 + var7;
                                var15 = var15 + param2[var20];
                                var20 = var20 + var7;
                                var15 = var15 + param2[var20];
                                var13[var18] = (byte)(var15 >> 1620415074);
                                var20 = var20 + var7;
                                var18 = var18 + var7;
                                var22++;
                                continue L23;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                throw new IllegalArgumentException("");
              }
            } else {
              L24: {
                var7 = pc.a(param6, (byte) -83);
                var8 = 0;
                if (param3 >= param5) {
                  stackOut_6_0 = param5;
                  stackIn_7_0 = stackOut_6_0;
                  break L24;
                } else {
                  stackOut_5_0 = param3;
                  stackIn_7_0 = stackOut_5_0;
                  break L24;
                }
              }
              L25: {
                var9 = stackIn_7_0;
                if (param1 == 23143) {
                  var10 = param3 >> 1147943617;
                  var11 = param5 >> -690780479;
                  var12 = param2;
                  var13 = new byte[var7 * (var11 * var10)];
                  break L25;
                } else {
                  field_D = null;
                  var10 = param3 >> 1147943617;
                  var11 = param5 >> -690780479;
                  var12 = param2;
                  var13 = new byte[var7 * (var11 * var10)];
                  break L25;
                }
              }
              L26: while (true) {
                jaggl.OpenGL.glTexImage2Dub(param0, var8, param4, param3, param5, 0, param6, 5121, var12, 0);
                if (var9 > 1) {
                  var16 = param3 * var7;
                  var17 = 0;
                  L27: while (true) {
                    if (var7 <= var17) {
                      var14 = var13;
                      var13 = var12;
                      param3 = var10;
                      var12 = var14;
                      param5 = var11;
                      var8++;
                      var10 = var10 >> 1;
                      var11 = var11 >> 1;
                      var9 = var9 >> 1;
                      continue L26;
                    } else {
                      var18 = var17;
                      var19 = var17;
                      var20 = var19 - -var16;
                      var21 = 0;
                      L28: while (true) {
                        if (var11 <= var21) {
                          var17++;
                          continue L27;
                        } else {
                          var22 = 0;
                          L29: while (true) {
                            if (var10 <= var22) {
                              var19 = var19 + var16;
                              var20 = var20 + var16;
                              var21++;
                              continue L28;
                            } else {
                              var15 = param2[var19];
                              var19 = var19 + var7;
                              var15 = var15 + param2[var19];
                              var19 = var19 + var7;
                              var15 = var15 + param2[var20];
                              var20 = var20 + var7;
                              var15 = var15 + param2[var20];
                              var13[var18] = (byte)(var15 >> 1620415074);
                              var20 = var20 + var7;
                              var18 = var18 + var7;
                              var22++;
                              continue L29;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            throw new IllegalArgumentException("");
          }
        }
    }

    public vq() {
        super(0, 0, 496, 0, (mh) null);
        ((vq) this).field_B = new qq("", (qm) null, 12);
        gm var1 = new gm(jm.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, kw.field_b.field_s, -1, 2147483647, true);
        pk var2 = new pk(gs.field_c, (mh) (Object) var1, (qm) null);
        ((vq) this).field_C = new wp(tf.field_a, (qm) null);
        ((vq) this).field_A = new wp(te.field_h, (qm) null);
        ((vq) this).field_B.field_t = rq.field_a;
        ((vq) this).field_B.a((byte) 127, (v) (Object) new ou((dh) (Object) ((vq) this).field_B));
        ((vq) this).field_C.field_x = false;
        ((vq) this).field_C.field_w = (mh) (Object) new ue();
        ((vq) this).field_A.field_w = (mh) (Object) new bv();
        ((vq) this).field_B.field_w = (mh) (Object) new nl(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.a(92, 20, var3, 50, 270);
        int var5 = 200;
        ((vq) this).a(var2, 81);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, 7541, 170, (pk) (Object) ((vq) this).field_B, oq.field_r, un.field_c));
        ((vq) this).field_C.a(126, 496 + -var5 >> 37360673, var3, 40, var5);
        ((vq) this).field_A.a(-57, 3 + var4, var3 + 15, 40, 60);
        ((vq) this).field_A.field_o = (qm) this;
        ((vq) this).field_C.field_o = (qm) this;
        ((vq) this).a((pk) (Object) ((vq) this).field_C, 123);
        ((vq) this).a((pk) (Object) ((vq) this).field_A, 103);
        ((vq) this).field_E = new pe((oe) this);
        ((vq) this).field_E.a(-64, 60 + ((vq) this).field_B.field_r - -((vq) this).field_B.field_q, 20, 150, -((vq) this).field_B.field_q + (-((vq) this).field_B.field_r + ((vq) this).field_q - 60));
        ((vq) this).a((pk) (Object) ((vq) this).field_E, 65);
        ((vq) this).a(116, 0, 0, 55 + (var3 - -var4), 496);
    }

    private final int a(byte param0, pk param1, int param2, int param3, String param4, String param5, int param6) {
        rt var11 = new rt(20, param2, 120 - -param3, 25, param1, false, 120, 3, kw.field_b, 16777215, param4);
        ((vq) this).a((pk) (Object) var11, 66);
        bn var9 = new bn(((op) (Object) param1).a(85), param5, 126, var11.field_p + param2, param3 - -25, param6);
        int var10 = -54 % ((-13 - param0) / 61);
        var9.field_o = (qm) this;
        ((vq) this).a((pk) (Object) var9, 92);
        return var9.field_p + var11.field_p;
    }

    public final void a(byte param0) {
        int var2 = -18 / ((param0 - 55) / 40);
        ((ou) (Object) ((vq) this).field_B.a(24)).e(-1);
    }

    public final void a(String param0, int param1) {
        qq var3 = ((vq) this).field_B;
        String var4 = param0;
        ((dh) (Object) var3).a(false, var4, (byte) 13);
        if (param1 != 0) {
            ((vq) this).field_A = null;
            return;
        }
    }

    public static void g(int param0) {
        Object var2 = null;
        if (param0 < 105) {
          var2 = null;
          vq.a(71, -40, (byte[]) null, -64, 111, 108, -111);
          field_D = null;
          return;
        } else {
          field_D = null;
          return;
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        if (super.a(param0, param1, (byte) 98, param3)) {
          return true;
        } else {
          if (param2 > 9) {
            if (param3 == 98) {
              return ((vq) this).a((byte) 121, param0);
            } else {
              if (99 == param3) {
                return ((vq) this).a(param0, false);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    private final int a(int param0, int param1, int param2, pk param3, String param4, String param5) {
        if (param1 != 7541) {
            field_D = null;
        }
        return this.a((byte) 107, param3, param0, param2, param5, param4, 35);
    }

    final void a(int param0, int param1, pk param2, int param3) {
        int var5 = -111 / ((-25 - param1) / 45);
        super.a(param0, -86, param2, param3);
        ((vq) this).field_C.field_x = this.e((byte) 91);
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        if (param2 == ((vq) this).field_A) {
          mu.e(0);
          if (param1 == 710) {
            return;
          } else {
            ((vq) this).field_C = null;
            return;
          }
        } else {
          if (((vq) this).field_C != param2) {
            if (param1 != 710) {
              ((vq) this).field_C = null;
              return;
            } else {
              return;
            }
          } else {
            this.e(true);
            if (param1 == 710) {
              return;
            } else {
              ((vq) this).field_C = null;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Are you sure you want to reset your stats?";
    }
}
