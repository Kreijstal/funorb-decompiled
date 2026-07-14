/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_h;
    static kc[] field_a;
    private int field_f;
    private boolean field_e;
    static String field_i;
    private pe field_d;
    private Object[] field_g;
    private d field_c;
    private Object[][] field_b;

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
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        pb var26 = null;
        byte[] var27 = null;
        pb var29 = null;
        pb var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        var22 = Main.field_T;
        if (!this.b(param1, (byte) -44)) {
          return false;
        } else {
          if (null != ((qk) this).field_g[param1]) {
            L0: {
              var5 = ((qk) this).field_c.field_q[param1];
              var48 = ((qk) this).field_c.field_o[param1];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (((qk) this).field_b[param1] == null) {
                ((qk) this).field_b[param1] = new Object[((qk) this).field_c.field_f[param1]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((qk) this).field_b[param1];
            var8 = 1;
            var9_int = 0;
            L1: while (true) {
              L2: {
                if (var5 <= var9_int) {
                  break L2;
                } else {
                  L3: {
                    if (var6 != null) {
                      var10 = var48[var9_int];
                      break L3;
                    } else {
                      var10 = var9_int;
                      break L3;
                    }
                  }
                  if (var7[var10] != null) {
                    var9_int++;
                    continue L1;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
              }
              if (var8 != 0) {
                return true;
              } else {
                L4: {
                  L5: {
                    if (param2 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (param2[0] != 0) {
                          break L6;
                        } else {
                          if (0 != param2[1]) {
                            break L6;
                          } else {
                            if (0 != param2[2]) {
                              break L6;
                            } else {
                              if (param2[3] != 0) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var49 = ce.a(true, 0, ((qk) this).field_g[param1]);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new pb(var49);
                      var26.a(5, ((pb) var26).field_g.length, -115, param2);
                      break L4;
                    }
                  }
                  var9 = ce.a(false, 0, ((qk) this).field_g[param1]);
                  break L4;
                }
                L7: {
                  if (param0 >= 84) {
                    break L7;
                  } else {
                    byte[] discarded$1 = ((qk) this).a(-69, ((byte[]) (byte[]) ((Object[]) (Object[]) ((qk) this).field_g[4])[0])[1], -74);
                    break L7;
                  }
                }
                L8: {
                  var50 = ac.a(-89, var9);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (!((qk) this).field_e) {
                    break L8;
                  } else {
                    ((qk) this).field_g[param1] = null;
                    break L8;
                  }
                }
                L9: {
                  if (-2 <= (var5 ^ -1)) {
                    L10: {
                      if (var6 == null) {
                        var11 = 0;
                        break L10;
                      } else {
                        var11 = var48[0];
                        break L10;
                      }
                    }
                    if (-1 == (((qk) this).field_f ^ -1)) {
                      var7[var11] = sj.a(false, 136, var51);
                      break L9;
                    } else {
                      var7[var11] = (Object) (Object) var50;
                      break L9;
                    }
                  } else {
                    if (((qk) this).field_f != 2) {
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - 4 * var5 * var12;
                      var31 = new pb(var51);
                      var31.field_i = var11;
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var32 = var39;
                      var14 = var32;
                      var15_int = 0;
                      L11: while (true) {
                        if (var15_int >= var12) {
                          var54 = new byte[var5][];
                          var47 = var54;
                          var40 = var47;
                          var33 = var40;
                          var15 = var33;
                          var16 = 0;
                          L12: while (true) {
                            if (var16 >= var5) {
                              var31.field_i = var11;
                              var16 = 0;
                              var17 = 0;
                              L13: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L14: while (true) {
                                    if (var5 <= var17) {
                                      break L9;
                                    } else {
                                      L15: {
                                        if (var6 != null) {
                                          var18 = var48[var17];
                                          break L15;
                                        } else {
                                          var18 = var17;
                                          break L15;
                                        }
                                      }
                                      if (0 == ((qk) this).field_f) {
                                        var7[var18] = sj.a(false, 136, var54[var17]);
                                        var17++;
                                        continue L14;
                                      } else {
                                        var7[var18] = (Object) (Object) var54[var17];
                                        var17++;
                                        continue L14;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L16: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L13;
                                    } else {
                                      var18 = var18 + var31.e((byte) 126);
                                      og.a(var51, var16, var54[var19], var53[var19], var18);
                                      var16 = var16 + var18;
                                      var14[var19] = var14[var19] + var18;
                                      var19++;
                                      continue L16;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15[var16] = new byte[var53[var16]];
                              var53[var16] = 0;
                              var16++;
                              continue L12;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L17: while (true) {
                            if (var17 >= var5) {
                              var15_int++;
                              continue L11;
                            } else {
                              var16 = var16 + var31.e((byte) 124);
                              var14[var17] = var14[var17] + var16;
                              var17++;
                              continue L17;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var5 * (var12 * 4);
                      var29 = new pb(var51);
                      var14_int = 0;
                      var29.field_i = var11;
                      var15_int = 0;
                      var16 = 0;
                      L18: while (true) {
                        if (var16 >= var12) {
                          if (var14_int != 0) {
                            var52 = new byte[var14_int];
                            var29.field_i = var11;
                            var14_int = 0;
                            var17 = 0;
                            var18 = 0;
                            L19: while (true) {
                              if (var12 <= var18) {
                                var7[var15_int] = (Object) (Object) var52;
                                return true;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L20: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L19;
                                  } else {
                                    L21: {
                                      var19 = var19 + var29.e((byte) 127);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L21;
                                      } else {
                                        var21 = var48[var20];
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (var21 != param3) {
                                        break L22;
                                      } else {
                                        og.a(var51, var17, var52, var14_int, var19);
                                        var14_int = var14_int + var19;
                                        break L22;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L20;
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
                          L23: while (true) {
                            if (var18 >= var5) {
                              var16++;
                              continue L18;
                            } else {
                              L24: {
                                var17 = var17 + var29.e((byte) 125);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L24;
                                } else {
                                  var19 = var48[var18];
                                  break L24;
                                }
                              }
                              if (var19 == param3) {
                                var15_int = var19;
                                var14_int = var14_int + var17;
                                var18++;
                                continue L23;
                              } else {
                                var18++;
                                continue L23;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 != -115) {
            return (byte[]) null;
        }
        return this.a((int[]) null, param2, (byte) 125, param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((qk) this).b(4)) {
          if (param1 == 0) {
            L0: {
              if ((param0 ^ -1) > -1) {
                break L0;
              } else {
                if ((param2 ^ -1) > -1) {
                  break L0;
                } else {
                  if (((qk) this).field_c.field_f.length <= param0) {
                    break L0;
                  } else {
                    if (((qk) this).field_c.field_f[param0] > param2) {
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            if (!rh.field_j) {
              return false;
            } else {
              throw new IllegalArgumentException(param0 + " " + param2);
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean b(int param0, String param1) {
        if (!((qk) this).b(param0 + 0)) {
            return false;
        }
        if (param0 != 4) {
            boolean discarded$0 = ((qk) this).a(-13, ((int[]) (int[]) ((Object[]) (Object[]) ((qk) this).field_g[7])[0])[7]);
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) param1;
        int var3 = ((qk) this).field_c.field_h.a((byte) -100, ta.a(109, var4));
        return ((qk) this).a(var3, 105);
    }

    final synchronized int a(byte param0, int param1) {
        if (!(this.b(param1, (byte) -26))) {
            return 0;
        }
        if (param0 != 60) {
            String var4 = (String) null;
            byte[] discarded$0 = ((qk) this).a((byte) 42, (String) null, (String) null);
        }
        if (null != ((qk) this).field_g[param1]) {
            return 100;
        }
        return ((qk) this).field_d.a(param1, param0 ^ 123);
    }

    final boolean c(int param0, String param1) {
        if (!((qk) this).b(4)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) param1;
        int var3 = ((qk) this).field_c.field_h.a((byte) -100, ta.a(98, var4));
        if (param0 <= var3) {
            return true;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.b(param0, (byte) -124))) {
            return false;
        }
        if (param1 <= 17) {
            return false;
        }
        if (!(null == ((qk) this).field_g[param0])) {
            return true;
        }
        this.a(param0, (byte) -92);
        if (null != ((qk) this).field_g[param0]) {
            return true;
        }
        return false;
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        if (!((qk) this).b(4)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((qk) this).field_g.length <= var4) {
              L1: {
                if (param0 == 2) {
                  break L1;
                } else {
                  ((qk) this).field_d = (pe) ((qk) this).field_g[7];
                  break L1;
                }
              }
              if (-1 != (var2 ^ -1)) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (-1 > (((qk) this).field_c.field_q[var4] ^ -1)) {
                var3 = var3 + ((qk) this).a((byte) 60, var4);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        if (!(((qk) this).b(4))) {
            return false;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) param0;
        int var4 = ((qk) this).field_c.field_h.a((byte) -100, ta.a(param2 + -7, var6));
        if (!(this.b(var4, (byte) -112))) {
            return false;
        }
        CharSequence var7 = (CharSequence) param1;
        int var5 = ((qk) this).field_c.field_p[var4].a((byte) -100, ta.a(90, var7));
        if (param2 != -44) {
            ((qk) this).field_b = (Object[][]) (Object[][]) null;
        }
        return ((qk) this).b(27493, var4, var5);
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (param0 != 27493) {
            return ((boolean[]) (boolean[]) ((qk) this).field_g[3])[13];
        }
        if (!(this.a(param1, param0 + -27493, param2))) {
            return false;
        }
        if (((qk) this).field_b[param1] != null) {
            if (null != ((qk) this).field_b[param1][param2]) {
                return true;
            }
        }
        if (!(null == ((qk) this).field_g[param1])) {
            return true;
        }
        this.a(param1, (byte) 119);
        if (((qk) this).field_g[param1] != null) {
            return true;
        }
        return false;
    }

    final int a(int param0, String param1, byte param2) {
        if (!this.b(param0, (byte) -122)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) param1;
        int var4 = ((qk) this).field_c.field_p[param0].a((byte) -100, ta.a(param2 ^ 99, var5));
        if (!this.a(param0, 0, var4)) {
            return -1;
        }
        if (param2 != 7) {
            field_i = (String) ((qk) this).field_g[1];
        }
        return var4;
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        if (param0 != 7) {
            return (byte[]) null;
        }
        if (!((qk) this).b(4)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) param2;
        int var4 = ((qk) this).field_c.field_h.a((byte) -100, ta.a(param0 + -94, var6));
        if (!this.b(var4, (byte) -47)) {
            return null;
        }
        CharSequence var7 = (CharSequence) param1;
        int var5 = ((qk) this).field_c.field_p[var4].a((byte) -100, ta.a(57, var7));
        return ((qk) this).a(var5, (byte) -115, var4);
    }

    final synchronized boolean b(int param0) {
        if (!(null != ((qk) this).field_c)) {
            ((qk) this).field_c = ((qk) this).field_d.b((byte) -126);
            if (null == ((qk) this).field_c) {
                return false;
            }
            ((qk) this).field_b = new Object[((qk) this).field_c.field_b][];
            ((qk) this).field_g = new Object[((qk) this).field_c.field_b];
        }
        if (param0 != 4) {
            int discarded$0 = ((qk) this).a(((byte[]) (byte[]) ((Object[]) (Object[]) ((Object[]) (Object[]) ((qk) this).field_g[17])[6])[4])[1], -41);
            return true;
        }
        return true;
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (!((qk) this).b(4)) {
          return false;
        } else {
          if (param1 < -6) {
            L0: {
              if (0 > param0) {
                break L0;
              } else {
                if (((qk) this).field_c.field_f.length <= param0) {
                  break L0;
                } else {
                  if (0 != ((qk) this).field_c.field_f[param0]) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (rh.field_j) {
              throw new IllegalArgumentException(Integer.toString(param0));
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, byte param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param1, 0, param3)) {
          if (param2 > 68) {
            L0: {
              L1: {
                var5 = null;
                if (((qk) this).field_b[param1] == null) {
                  break L1;
                } else {
                  if (null != ((qk) this).field_b[param1][param3]) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (!this.a(119, param1, param0, param3)) {
                this.a(param1, (byte) -111);
                if (this.a(86, param1, param0, param3)) {
                  break L0;
                } else {
                  return null;
                }
              } else {
                break L0;
              }
            }
            if (((qk) this).field_b[param1] != null) {
              L2: {
                if (((qk) this).field_b[param1][param3] == null) {
                  break L2;
                } else {
                  var7 = ce.a(false, 0, ((qk) this).field_b[param1][param3]);
                  var5_array = var7;
                  if (var7 == null) {
                    throw new RuntimeException("");
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var5_array == null) {
                  break L3;
                } else {
                  if ((((qk) this).field_f ^ -1) == -2) {
                    ((qk) this).field_b[param1][param3] = null;
                    if ((((qk) this).field_c.field_f[param1] ^ -1) == -2) {
                      ((qk) this).field_b[param1] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    if (2 != ((qk) this).field_f) {
                      break L3;
                    } else {
                      ((qk) this).field_b[param1] = null;
                      break L3;
                    }
                  }
                }
              }
              return var5_array;
            } else {
              throw new RuntimeException("");
            }
          } else {
            return (byte[]) null;
          }
        } else {
          return null;
        }
    }

    public static void c(int param0) {
        int var1 = -123 / ((62 - param0) / 60);
        field_i = null;
        field_h = null;
        field_a = null;
    }

    final int a(String param0, int param1) {
        if (!((qk) this).b(param1 + 4)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        if (param1 != 0) {
            field_i = (String) ((qk) this).field_g[5];
        }
        CharSequence var4 = (CharSequence) param0;
        int var3 = ((qk) this).field_c.field_h.a((byte) -100, ta.a(-54, var4));
        return ((qk) this).a((byte) 60, var3);
    }

    final int a(int param0, String param1) {
        if (!(((qk) this).b(4))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) param1;
        int var3 = ((qk) this).field_c.field_h.a((byte) -100, ta.a(-62, var4));
        if (param0 != 18659) {
            boolean discarded$0 = this.b(-2, (byte) 61);
        }
        if (!this.b(var3, (byte) -126)) {
            return -1;
        }
        return var3;
    }

    private final synchronized void a(int param0, byte param1) {
        if (!((qk) this).field_e) {
            ((qk) this).field_g[param0] = sj.a(false, 136, ((qk) this).field_d.a(param0, true));
        } else {
            ((qk) this).field_g[param0] = (Object) (Object) ((qk) this).field_d.a(param0, true);
        }
        int var3 = 78 / ((72 - param1) / 41);
    }

    qk(pe param0, boolean param1, int param2) {
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
          ((qk) this).field_c = null;
          if (0 > param2) {
            break L0;
          } else {
            if (param2 <= 2) {
              L1: {
                ((qk) this).field_d = param0;
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
              ((qk) this).field_e = stackIn_6_1 != 0;
              ((qk) this).field_f = param2;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        if (!((qk) this).b(4)) {
          return false;
        } else {
          var2 = 1;
          if (param0 >= 15) {
            var3 = 0;
            L0: while (true) {
              if (((qk) this).field_c.field_d.length <= var3) {
                return var2 != 0;
              } else {
                var4 = ((qk) this).field_c.field_d[var3];
                if (null == ((qk) this).field_g[var4]) {
                  this.a(var4, (byte) -81);
                  if (((qk) this).field_g[var4] == null) {
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
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Create";
        field_i = "Unfortunately we are unable to create an account for you at this time.";
    }
}
