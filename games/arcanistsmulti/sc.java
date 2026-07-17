/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends ej {
    private qb field_Y;
    static String field_S;
    static aj field_W;
    private int field_X;
    private pd field_J;
    private String field_ab;
    static String field_Z;
    static int[] field_U;
    static boolean field_V;
    static String field_T;
    static String field_bb;

    final void a(byte param0, int param1, int param2, int param3) {
        String var5 = null;
        eh var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qb var16 = null;
        String var17 = null;
        Object var18 = null;
        qb var19 = null;
        qb var20 = null;
        qb var21 = null;
        Object var22 = null;
        qb var23 = null;
        qb var24 = null;
        qb var29 = null;
        qb var30 = null;
        Object var31 = null;
        qb var32 = null;
        qb var33 = null;
        qb var34 = null;
        ac var35 = null;
        ac var36 = null;
        ac var37 = null;
        var18 = null;
        var22 = null;
        var31 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        var6 = ((sc) this).field_J.a(-92);
        if (da.field_f != var6) {
          L0: {
            if (ug.field_c != var6) {
              var5 = ((sc) this).field_J.c(26146);
              if (var5 == null) {
                var5 = ((sc) this).field_ab;
                break L0;
              } else {
                break L0;
              }
            } else {
              var5 = ea.field_D;
              break L0;
            }
          }
          L1: {
            if (!var5.equals((Object) (Object) ((sc) this).field_g)) {
              ((sc) this).field_g = var5;
              ((sc) this).g((byte) 63);
              break L1;
            } else {
              break L1;
            }
          }
          super.a((byte) -58, param1, param2, param3);
          if (param0 > -52) {
            L2: {
              ((sc) this).field_Y = null;
              var6 = ((sc) this).field_J.a(-103);
              var37 = (ac) (Object) ((sc) this).field_r;
              var9 = ((sc) this).field_n + param1;
              var10 = var37.a(param3, -13372, (qm) this) - -(var37.a((qm) this, -126).a((byte) -58) >> 1);
              if (da.field_f == var6) {
                break L2;
              } else {
                if (ug.field_c == var6) {
                  break L2;
                } else {
                  if (var6 != ra.field_k) {
                    if (nn.field_s == var6) {
                      var33 = qk.field_lb[1];
                      var33.b(var9, var10 + -(var33.field_y >> 1), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var32 = qk.field_lb[2];
                    var32.b(var9, var10 + -(var32.field_y >> 1), 256);
                    return;
                  }
                }
              }
            }
            var34 = qk.field_lb[0];
            var11 = var34.field_n << 1;
            var12 = var34.field_w << 1;
            if (null != ((sc) this).field_Y) {
              if (var11 <= ((sc) this).field_Y.field_q) {
                if (((sc) this).field_Y.field_y < var12) {
                  ((sc) this).field_Y = new qb(var11, var12);
                  fk.a(((sc) this).field_Y, -23095);
                  var34.b(112, 144, var34.field_n << 4, var34.field_w << 4, -((sc) this).field_X << 10, 4096);
                  oo.c(-15405);
                  ((sc) this).field_Y.b(-(var34.field_n >> 1) + var9, var10 + -var34.field_w, 256);
                  return;
                } else {
                  fk.a(((sc) this).field_Y, -23095);
                  de.b();
                  var34.b(112, 144, var34.field_n << 4, var34.field_w << 4, -((sc) this).field_X << 10, 4096);
                  oo.c(-15405);
                  ((sc) this).field_Y.b(-(var34.field_n >> 1) + var9, var10 + -var34.field_w, 256);
                  return;
                }
              } else {
                ((sc) this).field_Y = new qb(var11, var12);
                fk.a(((sc) this).field_Y, -23095);
                var34.b(112, 144, var34.field_n << 4, var34.field_w << 4, -((sc) this).field_X << 10, 4096);
                oo.c(-15405);
                ((sc) this).field_Y.b(-(var34.field_n >> 1) + var9, var10 + -var34.field_w, 256);
                return;
              }
            } else {
              ((sc) this).field_Y = new qb(var11, var12);
              fk.a(((sc) this).field_Y, -23095);
              var34.b(112, 144, var34.field_n << 4, var34.field_w << 4, -((sc) this).field_X << 10, 4096);
              oo.c(-15405);
              ((sc) this).field_Y.b(-(var34.field_n >> 1) + var9, var10 + -var34.field_w, 256);
              return;
            }
          } else {
            var6 = ((sc) this).field_J.a(-103);
            var36 = (ac) (Object) ((sc) this).field_r;
            var9 = ((sc) this).field_n + param1;
            var10 = var36.a(param3, -13372, (qm) this) - -(var36.a((qm) this, -126).a((byte) -58) >> 1);
            if (da.field_f != var6) {
              if (ug.field_c != var6) {
                if (var6 != ra.field_k) {
                  if (nn.field_s == var6) {
                    var30 = qk.field_lb[1];
                    var30.b(var9, var10 + -(var30.field_y >> 1), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var29 = qk.field_lb[2];
                  var29.b(var9, var10 + -(var29.field_y >> 1), 256);
                  return;
                }
              } else {
                var24 = qk.field_lb[0];
                var16 = var24;
                var11 = var24.field_n << 1;
                var12 = var24.field_w << 1;
                if (null != ((sc) this).field_Y) {
                  if (var11 <= ((sc) this).field_Y.field_q) {
                    if (((sc) this).field_Y.field_y >= var12) {
                      fk.a(((sc) this).field_Y, -23095);
                      de.b();
                      var24.b(112, 144, var24.field_n << 4, var24.field_w << 4, -((sc) this).field_X << 10, 4096);
                      oo.c(-15405);
                      ((sc) this).field_Y.b(-(var24.field_n >> 1) + var9, var10 + -var24.field_w, 256);
                      return;
                    } else {
                      ((sc) this).field_Y = new qb(var11, var12);
                      fk.a(((sc) this).field_Y, -23095);
                      var24.b(112, 144, var24.field_n << 4, var24.field_w << 4, -((sc) this).field_X << 10, 4096);
                      oo.c(-15405);
                      ((sc) this).field_Y.b(-(var24.field_n >> 1) + var9, var10 + -var24.field_w, 256);
                      return;
                    }
                  } else {
                    ((sc) this).field_Y = new qb(var11, var12);
                    fk.a(((sc) this).field_Y, -23095);
                    var24.b(112, 144, var24.field_n << 4, var24.field_w << 4, -((sc) this).field_X << 10, 4096);
                    oo.c(-15405);
                    ((sc) this).field_Y.b(-(var24.field_n >> 1) + var9, var10 + -var24.field_w, 256);
                    return;
                  }
                } else {
                  ((sc) this).field_Y = new qb(var11, var12);
                  fk.a(((sc) this).field_Y, -23095);
                  var24.b(112, 144, var24.field_n << 4, var24.field_w << 4, -((sc) this).field_X << 10, 4096);
                  oo.c(-15405);
                  ((sc) this).field_Y.b(-(var24.field_n >> 1) + var9, var10 + -var24.field_w, 256);
                  return;
                }
              }
            } else {
              var23 = qk.field_lb[0];
              var11 = var23.field_n << 1;
              var12 = var23.field_w << 1;
              if (null != ((sc) this).field_Y) {
                if (var11 <= ((sc) this).field_Y.field_q) {
                  if (((sc) this).field_Y.field_y < var12) {
                    ((sc) this).field_Y = new qb(var11, var12);
                    fk.a(((sc) this).field_Y, -23095);
                    var23.b(112, 144, var23.field_n << 4, var23.field_w << 4, -((sc) this).field_X << 10, 4096);
                    oo.c(-15405);
                    ((sc) this).field_Y.b(-(var23.field_n >> 1) + var9, var10 + -var23.field_w, 256);
                    return;
                  } else {
                    fk.a(((sc) this).field_Y, -23095);
                    de.b();
                    var23.b(112, 144, var23.field_n << 4, var23.field_w << 4, -((sc) this).field_X << 10, 4096);
                    oo.c(-15405);
                    ((sc) this).field_Y.b(-(var23.field_n >> 1) + var9, var10 + -var23.field_w, 256);
                    return;
                  }
                } else {
                  ((sc) this).field_Y = new qb(var11, var12);
                  fk.a(((sc) this).field_Y, -23095);
                  var23.b(112, 144, var23.field_n << 4, var23.field_w << 4, -((sc) this).field_X << 10, 4096);
                  oo.c(-15405);
                  ((sc) this).field_Y.b(-(var23.field_n >> 1) + var9, var10 + -var23.field_w, 256);
                  return;
                }
              } else {
                ((sc) this).field_Y = new qb(var11, var12);
                fk.a(((sc) this).field_Y, -23095);
                var23.b(112, 144, var23.field_n << 4, var23.field_w << 4, -((sc) this).field_X << 10, 4096);
                oo.c(-15405);
                ((sc) this).field_Y.b(-(var23.field_n >> 1) + var9, var10 + -var23.field_w, 256);
                return;
              }
            }
          }
        } else {
          L3: {
            var17 = ea.field_D;
            if (!var17.equals((Object) (Object) ((sc) this).field_g)) {
              ((sc) this).field_g = var17;
              ((sc) this).g((byte) 63);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            super.a((byte) -58, param1, param2, param3);
            if (param0 <= -52) {
              break L4;
            } else {
              ((sc) this).field_Y = null;
              break L4;
            }
          }
          L5: {
            var6 = ((sc) this).field_J.a(-103);
            var35 = (ac) (Object) ((sc) this).field_r;
            var9 = ((sc) this).field_n + param1;
            var10 = var35.a(param3, -13372, (qm) this) - -(var35.a((qm) this, -126).a((byte) -58) >> 1);
            if (da.field_f == var6) {
              break L5;
            } else {
              if (ug.field_c == var6) {
                break L5;
              } else {
                if (var6 != ra.field_k) {
                  if (nn.field_s != var6) {
                    return;
                  } else {
                    var20 = qk.field_lb[1];
                    var20.b(var9, var10 + -(var20.field_y >> 1), 256);
                    return;
                  }
                } else {
                  var19 = qk.field_lb[2];
                  var19.b(var9, var10 + -(var19.field_y >> 1), 256);
                  return;
                }
              }
            }
          }
          var21 = qk.field_lb[0];
          var11 = var21.field_n << 1;
          var12 = var21.field_w << 1;
          if (null != ((sc) this).field_Y) {
            if (var11 <= ((sc) this).field_Y.field_q) {
              if (((sc) this).field_Y.field_y < var12) {
                ((sc) this).field_Y = new qb(var11, var12);
                fk.a(((sc) this).field_Y, -23095);
                var21.b(112, 144, var21.field_n << 4, var21.field_w << 4, -((sc) this).field_X << 10, 4096);
                oo.c(-15405);
                ((sc) this).field_Y.b(-(var21.field_n >> 1) + var9, var10 + -var21.field_w, 256);
                return;
              } else {
                fk.a(((sc) this).field_Y, -23095);
                de.b();
                var21.b(112, 144, var21.field_n << 4, var21.field_w << 4, -((sc) this).field_X << 10, 4096);
                oo.c(-15405);
                ((sc) this).field_Y.b(-(var21.field_n >> 1) + var9, var10 + -var21.field_w, 256);
                return;
              }
            } else {
              ((sc) this).field_Y = new qb(var11, var12);
              fk.a(((sc) this).field_Y, -23095);
              var21.b(112, 144, var21.field_n << 4, var21.field_w << 4, -((sc) this).field_X << 10, 4096);
              oo.c(-15405);
              ((sc) this).field_Y.b(-(var21.field_n >> 1) + var9, var10 + -var21.field_w, 256);
              return;
            }
          } else {
            ((sc) this).field_Y = new qb(var11, var12);
            fk.a(((sc) this).field_Y, -23095);
            var21.b(112, 144, var21.field_n << 4, var21.field_w << 4, -((sc) this).field_X << 10, 4096);
            oo.c(-15405);
            ((sc) this).field_Y.b(-(var21.field_n >> 1) + var9, var10 + -var21.field_w, 256);
            return;
          }
        }
    }

    private final static void c() {
        q.a(pg.field_c, false, be.field_l, mf.field_d, am.field_c);
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        int discarded$0 = 0;
        j.a(param2, (String) null, param0);
    }

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 >= 85) {
              stackOut_3_0 = ba.a(0, param1.length, (byte) -127, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("sc.H(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 0;
        var3 = gi.field_a;
        if (var3 >= 5) {
          if (var3 >= 105) {
            if (120 > var3) {
              L0: {
                var3 = -var3 + 120;
                var2 = -(8192 * var3 * var3 / 3300) + 8192;
                var4 = 1;
                var5 = 0;
                if (3 != param0) {
                  break L0;
                } else {
                  var4 = -1;
                  break L0;
                }
              }
              L1: {
                if (param0 == 1) {
                  var5 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (4 != param0) {
                  break L2;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L2;
                }
              }
              L3: {
                if (param0 != 5) {
                  break L3;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L3;
                }
              }
              L4: {
                if (param0 != 6) {
                  break L4;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L4;
                }
              }
              L5: {
                if (7 == param0) {
                  var4 = -1;
                  var5 = -1;
                  break L5;
                } else {
                  if (8 != param0) {
                    break L5;
                  } else {
                    L6: {
                      var4 = -1;
                      var5 = -1;
                      if (param0 == 11) {
                        var4 = -1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (param0 == 12) {
                        var4 = -1;
                        var5 = -1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (param0 != 13) {
                        break L8;
                      } else {
                        var5 = -1;
                        var4 = 1;
                        break L8;
                      }
                    }
                    L9: {
                      if (param0 != 14) {
                        break L9;
                      } else {
                        var4 = -1;
                        var5 = 1;
                        break L9;
                      }
                    }
                    L10: {
                      if (param0 != 15) {
                        break L10;
                      } else {
                        var5 = 1;
                        var4 = 1;
                        break L10;
                      }
                    }
                    tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                    return;
                  }
                }
              }
              L11: {
                if (param0 == 11) {
                  var4 = -1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (param0 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (param0 != 13) {
                  break L13;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L13;
                }
              }
              L14: {
                if (param0 != 14) {
                  break L14;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L14;
                }
              }
              L15: {
                if (param0 != 15) {
                  break L15;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L15;
                }
              }
              tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
              return;
            } else {
              L16: {
                var4 = 1;
                var5 = 0;
                if (3 != param0) {
                  break L16;
                } else {
                  var4 = -1;
                  break L16;
                }
              }
              L17: {
                if (param0 == 1) {
                  var5 = 1;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (4 != param0) {
                  break L18;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L18;
                }
              }
              L19: {
                if (param0 != 5) {
                  break L19;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L19;
                }
              }
              L20: {
                if (param0 != 6) {
                  break L20;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L20;
                }
              }
              L21: {
                if (7 == param0) {
                  var4 = -1;
                  var5 = -1;
                  break L21;
                } else {
                  if (8 != param0) {
                    break L21;
                  } else {
                    L22: {
                      var4 = -1;
                      var5 = -1;
                      if (param0 == 11) {
                        var4 = -1;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (param0 == 12) {
                        var4 = -1;
                        var5 = -1;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (param0 != 13) {
                        break L24;
                      } else {
                        var5 = -1;
                        var4 = 1;
                        break L24;
                      }
                    }
                    L25: {
                      if (param0 != 14) {
                        break L25;
                      } else {
                        var4 = -1;
                        var5 = 1;
                        break L25;
                      }
                    }
                    L26: {
                      if (param0 != 15) {
                        break L26;
                      } else {
                        var5 = 1;
                        var4 = 1;
                        break L26;
                      }
                    }
                    tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                    return;
                  }
                }
              }
              L27: {
                if (param0 == 11) {
                  var4 = -1;
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                if (param0 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L28;
                } else {
                  break L28;
                }
              }
              L29: {
                if (param0 != 13) {
                  break L29;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L29;
                }
              }
              L30: {
                if (param0 != 14) {
                  break L30;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L30;
                }
              }
              L31: {
                if (param0 != 15) {
                  break L31;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L31;
                }
              }
              tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
              return;
            }
          } else {
            L32: {
              var2 = (-40960 + 16384 * var3) / 220;
              var4 = 1;
              var5 = 0;
              if (3 != param0) {
                break L32;
              } else {
                var4 = -1;
                break L32;
              }
            }
            L33: {
              if (param0 == 1) {
                var5 = 1;
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              if (4 != param0) {
                break L34;
              } else {
                var5 = 1;
                var4 = 1;
                break L34;
              }
            }
            L35: {
              if (param0 != 5) {
                break L35;
              } else {
                var4 = -1;
                var5 = 1;
                break L35;
              }
            }
            L36: {
              if (param0 != 6) {
                break L36;
              } else {
                var4 = 1;
                var5 = -1;
                break L36;
              }
            }
            if (7 != param0) {
              L37: {
                if (8 != param0) {
                  break L37;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L37;
                }
              }
              L38: {
                if (param0 == 11) {
                  var4 = -1;
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                if (param0 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (param0 != 13) {
                  break L40;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L40;
                }
              }
              L41: {
                if (param0 != 14) {
                  break L41;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L41;
                }
              }
              L42: {
                if (param0 != 15) {
                  break L42;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L42;
                }
              }
              tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
              return;
            } else {
              L43: {
                var4 = -1;
                var5 = -1;
                if (param0 == 11) {
                  var4 = -1;
                  break L43;
                } else {
                  break L43;
                }
              }
              L44: {
                if (param0 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L44;
                } else {
                  break L44;
                }
              }
              L45: {
                if (param0 != 13) {
                  break L45;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L45;
                }
              }
              L46: {
                if (param0 != 14) {
                  break L46;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L46;
                }
              }
              L47: {
                if (param0 != 15) {
                  break L47;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L47;
                }
              }
              tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
              return;
            }
          }
        } else {
          L48: {
            var2 = 8192 * (var3 * var3) / 1100;
            var4 = 1;
            var5 = 0;
            if (3 != param0) {
              break L48;
            } else {
              var4 = -1;
              break L48;
            }
          }
          L49: {
            if (param0 == 1) {
              var5 = 1;
              break L49;
            } else {
              break L49;
            }
          }
          L50: {
            if (4 != param0) {
              break L50;
            } else {
              var5 = 1;
              var4 = 1;
              break L50;
            }
          }
          L51: {
            if (param0 != 5) {
              break L51;
            } else {
              var4 = -1;
              var5 = 1;
              break L51;
            }
          }
          L52: {
            if (param0 != 6) {
              break L52;
            } else {
              var4 = 1;
              var5 = -1;
              break L52;
            }
          }
          if (7 != param0) {
            L53: {
              if (8 != param0) {
                break L53;
              } else {
                var4 = -1;
                var5 = -1;
                break L53;
              }
            }
            L54: {
              if (param0 == 11) {
                var4 = -1;
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              if (param0 == 12) {
                var4 = -1;
                var5 = -1;
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              if (param0 != 13) {
                break L56;
              } else {
                var5 = -1;
                var4 = 1;
                break L56;
              }
            }
            L57: {
              if (param0 != 14) {
                break L57;
              } else {
                var4 = -1;
                var5 = 1;
                break L57;
              }
            }
            L58: {
              if (param0 != 15) {
                break L58;
              } else {
                var5 = 1;
                var4 = 1;
                break L58;
              }
            }
            tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
            return;
          } else {
            L59: {
              var4 = -1;
              var5 = -1;
              if (param0 == 11) {
                var4 = -1;
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              if (param0 == 12) {
                var4 = -1;
                var5 = -1;
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              if (param0 != 13) {
                break L61;
              } else {
                var5 = -1;
                var4 = 1;
                break L61;
              }
            }
            L62: {
              if (param0 != 14) {
                break L62;
              } else {
                var4 = -1;
                var5 = 1;
                break L62;
              }
            }
            L63: {
              if (param0 != 15) {
                break L63;
              } else {
                var5 = 1;
                var4 = 1;
                break L63;
              }
            }
            tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
            return;
          }
        }
    }

    public static void g(int param0) {
        Object var2 = null;
        field_Z = null;
        field_U = null;
        field_S = null;
        field_T = null;
        if (param0 != 15428) {
          var2 = null;
          String discarded$2 = sc.a((byte) -71, (byte[]) null);
          field_W = null;
          field_bb = null;
          return;
        } else {
          field_W = null;
          field_bb = null;
          return;
        }
    }

    final String b(boolean param0) {
        if (!param0) {
            return null;
        }
        field_Z = null;
        return null;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((sc) this).field_X = ((sc) this).field_X + 1;
              super.a(param0, param1, param2, param3);
              if (param2 == 170) {
                break L1;
              } else {
                sc.g(-45);
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
            stackOut_3_1 = new StringBuilder().append("sc.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 == 2) {
          if (null != pn.field_c) {
            if (pn.field_c.field_n != param2 / 2) {
              if (mn.field_r == si.field_g) {
                pn.field_c = null;
                System.gc();
                if (null != pn.field_c) {
                  uh.a(pn.field_c, param0);
                  return;
                } else {
                  pn.field_c = new qb(param2 / 2, param1 / 2);
                  pn.field_c.a();
                  int discarded$5 = 0;
                  ql.a(param2, param1);
                  ce.field_m.a(true);
                  uh.a(pn.field_c, param0);
                  return;
                }
              } else {
                if (null != pn.field_c) {
                  uh.a(pn.field_c, param0);
                  return;
                } else {
                  pn.field_c = new qb(param2 / 2, param1 / 2);
                  pn.field_c.a();
                  int discarded$6 = 0;
                  ql.a(param2, param1);
                  ce.field_m.a(true);
                  uh.a(pn.field_c, param0);
                  return;
                }
              }
            } else {
              if (param1 / 2 != pn.field_c.field_w) {
                L0: {
                  if (mn.field_r == si.field_g) {
                    pn.field_c = null;
                    System.gc();
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (null != pn.field_c) {
                  uh.a(pn.field_c, param0);
                  return;
                } else {
                  pn.field_c = new qb(param2 / 2, param1 / 2);
                  pn.field_c.a();
                  int discarded$7 = 0;
                  ql.a(param2, param1);
                  ce.field_m.a(true);
                  uh.a(pn.field_c, param0);
                  return;
                }
              } else {
                if (null != pn.field_c) {
                  uh.a(pn.field_c, param0);
                  return;
                } else {
                  pn.field_c = new qb(param2 / 2, param1 / 2);
                  pn.field_c.a();
                  int discarded$8 = 0;
                  ql.a(param2, param1);
                  ce.field_m.a(true);
                  uh.a(pn.field_c, param0);
                  return;
                }
              }
            }
          } else {
            if (null != pn.field_c) {
              uh.a(pn.field_c, param0);
              return;
            } else {
              pn.field_c = new qb(param2 / 2, param1 / 2);
              pn.field_c.a();
              int discarded$9 = 0;
              ql.a(param2, param1);
              ce.field_m.a(true);
              uh.a(pn.field_c, param0);
              return;
            }
          }
        } else {
          return;
        }
    }

    sc(pd param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (pf) (Object) cc.b());
        int discarded$0 = -65;
        try {
            ((sc) this).field_J = param0;
            ((sc) this).field_ab = param1;
            ((sc) this).a(param5, param3, param4, param2, -83);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static fk a(kd param0) {
        fk var2 = null;
        RuntimeException var2_ref = null;
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
          var2 = new fk(param0, (pg) (Object) param0);
          qn.field_mb.b((pg) (Object) var2, -1);
          pc.field_e.b((sg) (Object) param0);
          return var2;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("sc.W(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 68 + 41);
        }
    }

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("sc.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static void i() {
        int discarded$0 = 1;
        sc.c();
    }

    final static int h() {
        return qc.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "Amid the witches' huts and rotten trees, Arcanists battle to control the arcane sources of magic within the swamp. Keep hidden, as the high concentration of power draws storms in from afar.";
        field_W = new aj(0, 2, 2, 1);
        field_U = new int[17];
        field_Z = "Waiting for graphics";
        field_T = "You cannot cast tower spells while flying";
        field_bb = "<%0> is already on your ignore list.";
    }
}
