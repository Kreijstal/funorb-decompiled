/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_i;
    private Object[][] field_e;
    static tf field_a;
    private bm field_c;
    private boolean field_h;
    private Object[] field_f;
    static tf field_d;
    private nh field_g;
    private int field_b;
    static String field_j;

    final int a(boolean param0) {
        if (!((rh) this).a(0)) {
            return -1;
        }
        if (param0) {
            return 84;
        }
        return ((rh) this).field_c.field_k.length;
    }

    final static void a(byte param0) {
        float var1 = 0.0f;
        ja var2 = null;
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          if (param0 > 93) {
            break L0;
          } else {
            rh.a((byte) 28);
            break L0;
          }
        }
        var1 = 0.0f;
        var2 = (ja) (Object) a.field_d.g(0);
        L1: while (true) {
          if (var2 == null) {
            L2: {
              wc.a(var1, (byte) 14);
              if (10000.0f > var1) {
                jc.a(0, false);
                break L2;
              } else {
                if (25600.0f <= var1) {
                  jc.a(2, false);
                  break L2;
                } else {
                  jc.a(1, false);
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: {
              var2.field_E = var2.field_E - 1;
              if (-1 != (var2.field_E ^ -1)) {
                break L3;
              } else {
                ab.field_f = true;
                break L3;
              }
            }
            if (null == var2.field_K) {
              L4: {
                var2.b(true);
                if (3 != var2.field_z) {
                  break L4;
                } else {
                  if (!var2.field_t) {
                    break L4;
                  } else {
                    if (0 < var2.field_E) {
                      break L4;
                    } else {
                      w.field_f = true;
                      break L4;
                    }
                  }
                }
              }
              L5: {
                if (var1 < (var2.field_o - 320.0f) * (-320.0f + var2.field_o) + (var2.field_v - 240.0f) * (var2.field_v - 240.0f)) {
                  var1 = (-240.0f + var2.field_v) * (-240.0f + var2.field_v) + (-320.0f + var2.field_o) * (-320.0f + var2.field_o);
                  break L5;
                } else {
                  break L5;
                }
              }
              var2 = (ja) (Object) a.field_d.d(1);
              continue L1;
            } else {
              var2 = (ja) (Object) a.field_d.d(1);
              continue L1;
            }
          }
        }
    }

    final int c(int param0, int param1) {
        if (!(this.b(param1, 3))) {
            return 0;
        }
        if (param0 != -9467) {
            rh.b(91);
        }
        return ((rh) this).field_c.field_k[param1];
    }

    private final synchronized void a(int param0, int param1) {
        if (!((rh) this).field_h) {
            ((rh) this).field_f[param0] = hf.a(-105, ((rh) this).field_g.b(4, param0), false);
        } else {
            ((rh) this).field_f[param0] = (Object) (Object) ((rh) this).field_g.b(4, param0);
        }
        if (param1 >= -103) {
            boolean discarded$0 = this.b(((int[]) ((rh) this).field_f[5])[9], 37);
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -28153) {
            boolean discarded$0 = ((rh) this).a((byte) -106, (String) null, (String) ((rh) this).field_f[14]);
        }
        return this.a(param0, true, (int[]) null, param2);
    }

    final boolean b(byte param0, String param1) {
        if (param0 >= -87) {
            return true;
        }
        if (!((rh) this).a(0)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((rh) this).field_c.field_n.a(true, ab.a(94, var4));
        if ((var3 ^ -1) <= -1) {
            return true;
        }
        return false;
    }

    final synchronized boolean b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.field_C;
        if (((rh) this).a(0)) {
          var2 = param0 ? 1 : 0;
          var3 = 0;
          L0: while (true) {
            if (((rh) this).field_c.field_i.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((rh) this).field_c.field_i[var3];
              if (((rh) this).field_f[var4] == null) {
                this.a(var4, -119);
                if (null == ((rh) this).field_f[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (param1 == -1) {
          if (!((rh) this).a(0)) {
            return false;
          } else {
            L0: {
              if (0 > param2) {
                break L0;
              } else {
                if ((param0 ^ -1) > -1) {
                  break L0;
                } else {
                  if (((rh) this).field_c.field_k.length <= param2) {
                    break L0;
                  } else {
                    if (((rh) this).field_c.field_k[param2] > param0) {
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            if (vf.field_K) {
              throw new IllegalArgumentException(param2 + " " + param0);
            } else {
              return false;
            }
          }
        } else {
          return ((boolean[]) ((rh) this).field_f[3])[0];
        }
    }

    final int a(String param0, int param1, int param2) {
        if (!(this.b(param2, 3))) {
            return -1;
        }
        if (param1 > -55) {
            field_d = null;
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((rh) this).field_c.field_f[param2].a(true, ab.a(99, var5));
        if (!this.b(var4, -1, param2)) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((rh) this).c(70, -80);
        }
        if (((rh) this).field_c != null) {
            return true;
        }
        ((rh) this).field_c = ((rh) this).field_g.a((byte) 113);
        if (((rh) this).field_c == null) {
            return false;
        }
        ((rh) this).field_f = new Object[((rh) this).field_c.field_b];
        ((rh) this).field_e = new Object[((rh) this).field_c.field_b][];
        return true;
    }

    final int a(int param0, String param1) {
        if (!((rh) this).a(param0)) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((rh) this).field_c.field_n.a(true, ab.a(84, var4));
        return ((rh) this).b((byte) 85, var3);
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!((rh) this).a(0)) {
            return false;
        }
        if (param1 != 3) {
            field_j = null;
        }
        if ((param0 ^ -1) <= -1) {
            if (param0 < ((rh) this).field_c.field_k.length) {
                if (((rh) this).field_c.field_k[param0] != 0) {
                    return true;
                }
            }
        }
        if (vf.field_K) {
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_j = null;
        if (param0 != 30261) {
            field_a = null;
        }
        field_i = null;
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!((rh) this).a(0)) {
            return null;
        }
        if (!(-2 != (((rh) this).field_c.field_k.length ^ -1))) {
            return ((rh) this).a(0, param0 + -56472, param1);
        }
        if (param0 != 28319) {
            return null;
        }
        if (!this.b(param1, 3)) {
            return null;
        }
        if (!(((rh) this).field_c.field_k[param1] != 1)) {
            return ((rh) this).a(param1, param0 ^ -872, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(byte param0, int param1) {
        if (!(this.b(param1, 3))) {
            return false;
        }
        if (!(((rh) this).field_f[param1] == null)) {
            return true;
        }
        if (param0 != 102) {
            int discarded$0 = ((rh) this).b((byte) -65, 111);
        }
        this.a(param1, -108);
        if (((rh) this).field_f[param1] == null) {
            return false;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        qc var25 = null;
        byte[] var26 = null;
        qc var28 = null;
        int[] var29 = null;
        byte[][] var30 = null;
        qc var31 = null;
        int[] var33 = null;
        byte[] var34 = null;
        byte[] var35 = null;
        int[] var37 = null;
        byte[][] var38 = null;
        int[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        int[] var44 = null;
        byte[][] var45 = null;
        int[] var47 = null;
        byte[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        int[] var51 = null;
        byte[][] var52 = null;
        byte[] var53 = null;
        if (!this.b(param3, 3)) {
          return false;
        } else {
          if (((rh) this).field_f[param3] == null) {
            return false;
          } else {
            L0: {
              var5 = ((rh) this).field_c.field_a[param3];
              var47 = ((rh) this).field_c.field_o[param3];
              var40 = var47;
              var33 = var40;
              var23 = var33;
              var6 = var23;
              if (null == ((rh) this).field_e[param3]) {
                ((rh) this).field_e[param3] = new Object[((rh) this).field_c.field_k[param3]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((rh) this).field_e[param3];
            var8 = 1;
            var9_int = 0;
            L1: while (true) {
              L2: {
                if (var9_int >= var5) {
                  break L2;
                } else {
                  L3: {
                    if (var6 == null) {
                      var10 = var9_int;
                      break L3;
                    } else {
                      var10 = var47[var9_int];
                      break L3;
                    }
                  }
                  if (null == var7[var10]) {
                    var8 = 0;
                    break L2;
                  } else {
                    var9_int++;
                    continue L1;
                  }
                }
              }
              if (var8 == 0) {
                L4: {
                  L5: {
                    if (param2 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (-1 != param2[0]) {
                          break L6;
                        } else {
                          if (-1 != param2[1]) {
                            break L6;
                          } else {
                            if (param2[2] != 0) {
                              break L6;
                            } else {
                              if (0 != param2[3]) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var48 = uk.a(true, param1 ^ -114, ((rh) this).field_f[param3]);
                      var41 = var48;
                      var34 = var41;
                      var24 = var34;
                      var9 = var24;
                      var25 = new qc(var48);
                      var25.a((byte) -125, param2, 5, var25.field_j.length);
                      break L4;
                    }
                  }
                  var9 = uk.a(false, param1 + -90, ((rh) this).field_f[param3]);
                  break L4;
                }
                if (param1 == 4) {
                  L7: {
                    var49 = v.a(var9, -1);
                    var42 = var49;
                    var35 = var42;
                    var26 = var35;
                    var22 = var26;
                    var50 = var22;
                    if (!((rh) this).field_h) {
                      break L7;
                    } else {
                      ((rh) this).field_f[param3] = null;
                      break L7;
                    }
                  }
                  L8: {
                    if (-2 <= var5) {
                      L9: {
                        if (var6 != null) {
                          var11 = var47[0];
                          break L9;
                        } else {
                          var11 = 0;
                          break L9;
                        }
                      }
                      if (-1 != (((rh) this).field_b ^ -1)) {
                        var7[var11] = (Object) (Object) var49;
                        break L8;
                      } else {
                        var7[var11] = hf.a(-113, var49, false);
                        break L8;
                      }
                    } else {
                      if (-3 == ((rh) this).field_b) {
                        var11 = var49.length;
                        var11--;
                        var12 = 255 & var22[var11];
                        var11 = var11 - var5 * (var12 * 4);
                        var31 = new qc(var50);
                        var14 = 0;
                        var15 = 0;
                        var31.field_f = var11;
                        var16 = 0;
                        L10: while (true) {
                          if (var16 >= var12) {
                            if (var14 != 0) {
                              var53 = new byte[var14];
                              var31.field_f = var11;
                              var14 = 0;
                              var17 = 0;
                              var18 = 0;
                              L11: while (true) {
                                if (var18 >= var12) {
                                  var7[var15] = (Object) (Object) var53;
                                  return true;
                                } else {
                                  var19 = 0;
                                  var20 = 0;
                                  L12: while (true) {
                                    if (var20 >= var5) {
                                      var18++;
                                      continue L11;
                                    } else {
                                      L13: {
                                        var19 = var19 + var31.a((byte) -82);
                                        if (var6 == null) {
                                          var21 = var20;
                                          break L13;
                                        } else {
                                          var21 = var47[var20];
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (var21 != param0) {
                                          break L14;
                                        } else {
                                          sf.a(var50, var17, var53, var14, var19);
                                          var14 = var14 + var19;
                                          break L14;
                                        }
                                      }
                                      var17 = var17 + var19;
                                      var20++;
                                      continue L12;
                                    }
                                  }
                                }
                              }
                            } else {
                              return true;
                            }
                          } else {
                            var17 = 0;
                            var18 = 0;
                            L15: while (true) {
                              if (var18 >= var5) {
                                var16++;
                                continue L10;
                              } else {
                                L16: {
                                  var17 = var17 + var31.a((byte) -126);
                                  if (var6 == null) {
                                    var19 = var18;
                                    break L16;
                                  } else {
                                    var19 = var47[var18];
                                    break L16;
                                  }
                                }
                                if (param0 == var19) {
                                  var14 = var14 + var17;
                                  var15 = var19;
                                  var18++;
                                  continue L15;
                                } else {
                                  var18++;
                                  continue L15;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var11 = var49.length;
                        var11--;
                        var12 = 255 & var22[var11];
                        var11 = var11 - 4 * var12 * var5;
                        var28 = new qc(var50);
                        var51 = new int[var5];
                        var44 = var51;
                        var37 = var44;
                        var29 = var37;
                        var14_ref_int__ = var29;
                        var28.field_f = var11;
                        var15 = 0;
                        L17: while (true) {
                          if (var15 >= var12) {
                            var52 = new byte[var5][];
                            var45 = var52;
                            var38 = var45;
                            var30 = var38;
                            var15_ref_byte____ = var30;
                            var16 = 0;
                            L18: while (true) {
                              if (var5 <= var16) {
                                var28.field_f = var11;
                                var16 = 0;
                                var17 = 0;
                                L19: while (true) {
                                  if (var12 <= var17) {
                                    var17 = 0;
                                    L20: while (true) {
                                      if (var5 <= var17) {
                                        break L8;
                                      } else {
                                        L21: {
                                          if (var6 == null) {
                                            var18 = var17;
                                            break L21;
                                          } else {
                                            var18 = var47[var17];
                                            break L21;
                                          }
                                        }
                                        if (((rh) this).field_b != 0) {
                                          var7[var18] = (Object) (Object) var52[var17];
                                          var17++;
                                          continue L20;
                                        } else {
                                          var7[var18] = hf.a(param1 + -126, var52[var17], false);
                                          var17++;
                                          continue L20;
                                        }
                                      }
                                    }
                                  } else {
                                    var18 = 0;
                                    var19 = 0;
                                    L22: while (true) {
                                      if (var5 <= var19) {
                                        var17++;
                                        continue L19;
                                      } else {
                                        var18 = var18 + var28.a((byte) -106);
                                        sf.a(var49, var16, var52[var19], var51[var19], var18);
                                        var16 = var16 + var18;
                                        var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                        var19++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var15_ref_byte____[var16] = new byte[var51[var16]];
                                var51[var16] = 0;
                                var16++;
                                continue L18;
                              }
                            }
                          } else {
                            var16 = 0;
                            var17 = 0;
                            L23: while (true) {
                              if (var17 >= var5) {
                                var15++;
                                continue L17;
                              } else {
                                var16 = var16 + var28.a((byte) -27);
                                var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                var17++;
                                continue L23;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!(this.b(param2, -1, param1))) {
            return false;
        }
        if (param0 != 37) {
            return true;
        }
        if (null != ((rh) this).field_e[param1]) {
            if (!(((rh) this).field_e[param1][param2] == null)) {
                return true;
            }
        }
        if (((rh) this).field_f[param1] != null) {
            return true;
        }
        this.a(param1, -118);
        if (((rh) this).field_f[param1] != null) {
            return true;
        }
        return false;
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        L0: {
          if (param1) {
            break L0;
          } else {
            field_i = (String) ((rh) this).field_f[0];
            break L0;
          }
        }
        if (this.b(param3, -1, param0)) {
          L1: {
            L2: {
              var5 = null;
              if (((rh) this).field_e[param0] == null) {
                break L2;
              } else {
                if (null != ((rh) this).field_e[param0][param3]) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!this.a(param3, 4, param2, param0)) {
              this.a(param0, -118);
              if (this.a(param3, 4, param2, param0)) {
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (((rh) this).field_e[param0] != null) {
            L3: {
              if (null != ((rh) this).field_e[param0][param3]) {
                var7 = uk.a(false, -116, ((rh) this).field_e[param0][param3]);
                var5_array = var7;
                if (var7 != null) {
                  break L3;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (var5_array == null) {
                break L4;
              } else {
                if (-2 == ((rh) this).field_b) {
                  ((rh) this).field_e[param0][param3] = null;
                  if (-2 != (((rh) this).field_c.field_k[param0] ^ -1)) {
                    break L4;
                  } else {
                    ((rh) this).field_e[param0] = null;
                    break L4;
                  }
                } else {
                  if (-3 != ((rh) this).field_b) {
                    break L4;
                  } else {
                    ((rh) this).field_e[param0] = null;
                    break L4;
                  }
                }
              }
            }
            return var5_array;
          } else {
            throw new RuntimeException("");
          }
        } else {
          return null;
        }
    }

    final int a(byte param0, String param1) {
        if (!(((rh) this).a(0))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((rh) this).field_c.field_n.a(true, ab.a(124, var4));
        if (!(this.b(var3, 3))) {
            return -1;
        }
        if (param0 <= 125) {
            ((rh) this).field_h = false;
        }
        return var3;
    }

    final boolean a(String param0, byte param1) {
        if (!((rh) this).a(0)) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param1 > -123) {
            field_j = null;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((rh) this).field_c.field_n.a(true, ab.a(69, var4));
        return ((rh) this).a((byte) 102, var3);
    }

    final synchronized int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.field_C;
        if (!((rh) this).a(0)) {
          return 0;
        } else {
          if (param0 >= 99) {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              if (((rh) this).field_f.length <= var4) {
                if (var2 != 0) {
                  var4 = var3 * 100 / var2;
                  return var4;
                } else {
                  return 100;
                }
              } else {
                if (-1 > (((rh) this).field_c.field_a[var4] ^ -1)) {
                  var3 = var3 + ((rh) this).b((byte) 59, var4);
                  var2 += 100;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          } else {
            return 9;
          }
        }
    }

    final boolean a(byte param0, String param1, String param2) {
        if (!(((rh) this).a(0))) {
            return false;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((rh) this).field_c.field_n.a(true, ab.a(80, var6));
        if (!(this.b(var4, 3))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((rh) this).field_c.field_f[var4].a(true, ab.a(93, var7));
        if (param0 != 113) {
            return ((boolean[]) ((Object[]) ((rh) this).field_f[8])[2])[9];
        }
        return ((rh) this).a((byte) 37, var4, var5);
    }

    rh(nh param0, boolean param1, int param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((rh) this).field_c = null;
          if (0 > param2) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                ((rh) this).field_b = param2;
                ((rh) this).field_g = param0;
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((rh) this).field_h = stackIn_6_1 != 0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        if (!((rh) this).a(param0)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((rh) this).field_c.field_n.a(true, ab.a(54, var6));
        if (!this.b(var4, 3)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((rh) this).field_c.field_f[var4].a(true, ab.a(43, var7));
        return ((rh) this).a(var4, -28153, var5);
    }

    final synchronized int b(byte param0, int param1) {
        if (!(this.b(param1, 3))) {
            return 0;
        }
        if (null != ((rh) this).field_f[param1]) {
            return 100;
        }
        if (param0 <= 31) {
            boolean discarded$0 = this.b(-88, ((int[]) ((Object[]) ((rh) this).field_f[0])[2])[7]);
        }
        return ((rh) this).field_g.a(126, param1);
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Geoblox.field_C;
          var2 = 0L;
          if (param1 == -48) {
            break L0;
          } else {
            var8 = null;
            break L0;
          }
        }
        var4 = param0.length();
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 >= var4) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(-65 + (1 + var6));
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (var6 > 122) {
                      break L5;
                    } else {
                      var2 = var2 + (long)(-96 - -var6);
                      break L3;
                    }
                  }
                }
                if (48 > var6) {
                  break L3;
                } else {
                  if (57 < var6) {
                    break L3;
                  } else {
                    var2 = var2 + (long)(-48 + var6 + 27);
                    break L3;
                  }
                }
              }
              if (177917621779460413L > var2) {
                var5++;
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L6: while (true) {
            L7: {
              if ((var2 % 37L ^ -1L) != -1L) {
                break L7;
              } else {
                if (-1L == (var2 ^ -1L)) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new tf();
        field_d = new tf();
        field_j = "That name is not available";
    }
}
