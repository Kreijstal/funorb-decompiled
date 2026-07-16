/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    private Object[][] field_c;
    private Object[] field_b;
    private boolean field_a;
    static String field_e;
    private hl field_g;
    private int field_f;
    private pc field_d;

    final boolean a(byte param0, String param1) {
        if (!(((kl) this).b(17820))) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param0 != 29) {
            ((long[]) ((kl) this).field_b[0])[20] = -49L;
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((kl) this).field_d.field_h.b((byte) 60, wj.a(var4, 2148));
        return ((kl) this).a(false, var3);
    }

    final int b(int param0, String param1) {
        if (!((kl) this).b(param0 + 17821)) {
            return -1;
        }
        if (param0 != -1) {
            Object var4 = null;
            boolean discarded$0 = ((kl) this).a(((byte[]) ((kl) this).field_b[0])[10], (String) null);
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((kl) this).field_d.field_h.b((byte) 98, wj.a(var5, 2148));
        if (!(this.a(var3, 6447))) {
            return -1;
        }
        return var3;
    }

    final int a(int param0, String param1, int param2) {
        if (param2 != -11986) {
            ((kl) this).field_b = null;
        }
        if (!this.a(param0, 6447)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((kl) this).field_d.field_x[param0].b((byte) 80, wj.a(var5, 2148));
        if (!this.a(var4, param0, true)) {
            return -1;
        }
        return var4;
    }

    private final synchronized boolean a(boolean param0, int[] param1, int param2, int param3) {
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
        va var26 = null;
        byte[] var27 = null;
        va var29 = null;
        va var31 = null;
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
        L0: {
          var22 = wizardrun.field_H;
          if (!param0) {
            break L0;
          } else {
            ((long[]) ((kl) this).field_b[0])[29] = 95L;
            break L0;
          }
        }
        if (!this.a(param2, 6447)) {
          return false;
        } else {
          if (null == ((kl) this).field_b[param2]) {
            return false;
          } else {
            L1: {
              var5 = ((kl) this).field_d.field_p[param2];
              var48 = ((kl) this).field_d.field_w[param2];
              var41 = var48;
              var34 = var41;
              var24 = var34;
              var6 = var24;
              if (((kl) this).field_c[param2] == null) {
                ((kl) this).field_c[param2] = new Object[((kl) this).field_d.field_t[param2]];
                break L1;
              } else {
                break L1;
              }
            }
            var7 = ((kl) this).field_c[param2];
            var8 = 1;
            var9_int = 0;
            L2: while (true) {
              L3: {
                if (var9_int >= var5) {
                  break L3;
                } else {
                  L4: {
                    if (var6 == null) {
                      var10 = var9_int;
                      break L4;
                    } else {
                      var10 = var48[var9_int];
                      break L4;
                    }
                  }
                  if (null != var7[var10]) {
                    var9_int++;
                    continue L2;
                  } else {
                    var8 = 0;
                    break L3;
                  }
                }
              }
              if (var8 != 0) {
                return true;
              } else {
                L5: {
                  L6: {
                    if (param1 == null) {
                      break L6;
                    } else {
                      L7: {
                        if (param1[0] != 0) {
                          break L7;
                        } else {
                          if (param1[1] != 0) {
                            break L7;
                          } else {
                            if (0 != param1[2]) {
                              break L7;
                            } else {
                              if (0 != param1[3]) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var49 = bh.a((byte) 104, ((kl) this).field_b[param2], true);
                      var42 = var49;
                      var35 = var42;
                      var25 = var35;
                      var9 = var25;
                      var26 = new va(var49);
                      var26.a(param0, param1, 5, var26.field_k.length);
                      break L5;
                    }
                  }
                  var9 = bh.a((byte) 115, ((kl) this).field_b[param2], false);
                  break L5;
                }
                L8: {
                  var50 = dg.a(var9, 31027);
                  var43 = var50;
                  var36 = var43;
                  var27 = var36;
                  var23 = var27;
                  var51 = var23;
                  if (((kl) this).field_a) {
                    var50 = var43;
                    ((kl) this).field_b[param2] = null;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var50 = var43;
                  if (1 >= var5) {
                    L10: {
                      if (var6 != null) {
                        var11 = var48[0];
                        break L10;
                      } else {
                        var11 = 0;
                        break L10;
                      }
                    }
                    if (((kl) this).field_f != 0) {
                      var7[var11] = (Object) (Object) var51;
                      break L9;
                    } else {
                      var7[var11] = pi.a(var50, 0, false);
                      break L9;
                    }
                  } else {
                    if ((((kl) this).field_f ^ -1) != -3) {
                      var50 = var43;
                      var11 = var50.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var5 * var12 * 4;
                      var31 = new va(var51);
                      var53 = new int[var5];
                      var46 = var53;
                      var39 = var46;
                      var32 = var39;
                      var14 = var32;
                      var31.field_m = var11;
                      var15_int = 0;
                      L11: while (true) {
                        if (var12 <= var15_int) {
                          var54 = new byte[var5][];
                          var47 = var54;
                          var40 = var47;
                          var33 = var40;
                          var15 = var33;
                          var16 = 0;
                          L12: while (true) {
                            if (var16 >= var5) {
                              var31.field_m = var11;
                              var16 = 0;
                              var17 = 0;
                              L13: while (true) {
                                if (var17 >= var12) {
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
                                      if (0 == ((kl) this).field_f) {
                                        var7[var18] = pi.a(var54[var17], 0, false);
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
                                      var18 = var18 + var31.i(255);
                                      g.a(var51, var16, var54[var19], var53[var19], var18);
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
                              var16 = var16 + var31.i(255);
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
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * var12 * var5;
                      var29 = new va(var51);
                      var14_int = 0;
                      var15_int = 0;
                      var29.field_m = var11;
                      var16 = 0;
                      L18: while (true) {
                        if (var16 >= var12) {
                          if (-1 != (var14_int ^ -1)) {
                            var52 = new byte[var14_int];
                            var29.field_m = var11;
                            var14_int = 0;
                            var17 = 0;
                            var18 = 0;
                            L19: while (true) {
                              if (var18 >= var12) {
                                var7[var15_int] = (Object) (Object) var52;
                                return true;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L20: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L19;
                                  } else {
                                    L21: {
                                      var19 = var19 + var29.i(255);
                                      if (var6 != null) {
                                        var21 = var48[var20];
                                        break L21;
                                      } else {
                                        var21 = var20;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (param3 != var21) {
                                        break L22;
                                      } else {
                                        g.a(var51, var17, var52, var14_int, var19);
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
                            if (var5 <= var18) {
                              var16++;
                              continue L18;
                            } else {
                              L24: {
                                var17 = var17 + var29.i(255);
                                if (var6 == null) {
                                  var19 = var18;
                                  break L24;
                                } else {
                                  var19 = var48[var18];
                                  break L24;
                                }
                              }
                              if (param3 == var19) {
                                var14_int = var14_int + var17;
                                var15_int = var19;
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
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) ff.field_H);
        if (param0 != 0) {
            return;
        }
        param1.addFocusListener((java.awt.event.FocusListener) (Object) ff.field_H);
    }

    final synchronized boolean d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        if (!((kl) this).b(17820)) {
          return false;
        } else {
          var2 = -35 / ((param0 - 0) / 45);
          var3 = 1;
          var4 = 0;
          L0: while (true) {
            if (((kl) this).field_d.field_c.length <= var4) {
              return var3 != 0;
            } else {
              var5 = ((kl) this).field_d.field_c[var4];
              if (((kl) this).field_b[var5] == null) {
                this.c(var5, -15053);
                if (((kl) this).field_b[var5] == null) {
                  var3 = 0;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, boolean param2) {
        L0: {
          if (param2) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        if (((kl) this).b(17820)) {
          L1: {
            if ((param1 ^ -1) > -1) {
              break L1;
            } else {
              if (0 > param0) {
                break L1;
              } else {
                if (param1 >= ((kl) this).field_d.field_t.length) {
                  break L1;
                } else {
                  if (((kl) this).field_d.field_t[param1] > param0) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (!v.field_a) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param0);
          }
        } else {
          return false;
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            ((kl) this).field_g = null;
            break L0;
          }
        }
        if (this.a(param1, param3, true)) {
          L1: {
            L2: {
              var5 = null;
              if (((kl) this).field_c[param3] == null) {
                break L2;
              } else {
                if (((kl) this).field_c[param3][param1] != null) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!this.a(false, param2, param3, param1)) {
              this.c(param3, -15053);
              if (this.a(false, param2, param3, param1)) {
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (null != ((kl) this).field_c[param3]) {
            L3: {
              if (((kl) this).field_c[param3][param1] == null) {
                break L3;
              } else {
                var7 = bh.a((byte) 115, ((kl) this).field_c[param3][param1], false);
                var5 = (Object) (Object) var7;
                if (var7 != null) {
                  break L3;
                } else {
                  throw new RuntimeException("");
                }
              }
            }
            L4: {
              if (var5 != null) {
                if (1 == ((kl) this).field_f) {
                  ((kl) this).field_c[param3][param1] = null;
                  if ((((kl) this).field_d.field_t[param3] ^ -1) == -2) {
                    ((kl) this).field_c[param3] = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  if (-3 != (((kl) this).field_f ^ -1)) {
                    break L4;
                  } else {
                    ((kl) this).field_c[param3] = null;
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            return (byte[]) var5;
          } else {
            throw new RuntimeException("");
          }
        } else {
          return null;
        }
    }

    final synchronized boolean b(int param0) {
        if (param0 != 17820) {
            return true;
        }
        if (((kl) this).field_d != null) {
            return true;
        }
        ((kl) this).field_d = ((kl) this).field_g.b(false);
        if (null == ((kl) this).field_d) {
            return false;
        }
        ((kl) this).field_b = new Object[((kl) this).field_d.field_s];
        ((kl) this).field_c = new Object[((kl) this).field_d.field_s][];
        return true;
    }

    final boolean c(int param0, String param1) {
        if (!((kl) this).b(17820)) {
            return false;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((kl) this).field_d.field_h.b((byte) 117, wj.a(var4, param0 ^ -2149));
        if (param0 >= (var3 ^ -1)) {
            return true;
        }
        return false;
    }

    final int d(int param0, int param1) {
        if (!(this.a(param1, 6447))) {
            return 0;
        }
        if (param0 > -81) {
            ((kl) this).field_f = ((int[]) ((kl) this).field_b[1])[2];
        }
        return ((kl) this).field_d.field_t[param1];
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4 = -66 / ((param0 - -18) / 54);
        if (!((kl) this).b(17820)) {
            return null;
        }
        param2 = param2.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((kl) this).field_d.field_h.b((byte) 104, wj.a(var7, 2148));
        if (!this.a(var5, 6447)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param1;
        int var6 = ((kl) this).field_d.field_x[var5].b((byte) 99, wj.a(var8, 2148));
        return ((kl) this).a(var6, var5, 1);
    }

    private final synchronized boolean a(int param0, int param1) {
        if (((kl) this).b(17820)) {
          L0: {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (param0 >= ((kl) this).field_d.field_t.length) {
                break L0;
              } else {
                if (((kl) this).field_d.field_t[param0] == 0) {
                  break L0;
                } else {
                  if (param1 == 6447) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          if (v.field_a) {
            throw new IllegalArgumentException(Integer.toString(param0));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(int param0, String param1) {
        if (param0 != 0) {
            ((kl) this).field_c = null;
        }
        if (!((kl) this).b(17820)) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((kl) this).field_d.field_h.b((byte) 102, wj.a(var4, 2148));
        return ((kl) this).b((byte) -72, var3);
    }

    final int c(int param0) {
        if (param0 != 0) {
            byte[] discarded$0 = ((kl) this).a(51, (String) null, (String) ((Object[]) ((kl) this).field_b[10])[2]);
        }
        if (!(((kl) this).b(17820))) {
            return -1;
        }
        return ((kl) this).field_d.field_t.length;
    }

    final synchronized int b(byte param0, int param1) {
        if (!(this.a(param1, 6447))) {
            return 0;
        }
        if (param0 >= -33) {
            return 44;
        }
        if (!(((kl) this).field_b[param1] == null)) {
            return 100;
        }
        return ((kl) this).field_g.a(false, param1);
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = wizardrun.field_H;
        if (!((kl) this).b(17820)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((kl) this).field_b.length) {
              L1: {
                if (param0 == 75) {
                  break L1;
                } else {
                  var6 = null;
                  kl.a(-90, (java.awt.Component) null);
                  break L1;
                }
              }
              if (var2 == 0) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (0 < ((kl) this).field_d.field_p[var4]) {
                var2 += 100;
                var3 = var3 + ((kl) this).b((byte) -95, var4);
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

    final synchronized byte[] a(byte param0, int param1) {
        if (!((kl) this).b(17820)) {
            return null;
        }
        if (!(((kl) this).field_d.field_t.length != 1)) {
            return ((kl) this).a(param1, 0, 1);
        }
        if (!this.a(param1, 6447)) {
            return null;
        }
        if (param0 >= -126) {
            return null;
        }
        if ((((kl) this).field_d.field_t[param1] ^ -1) == -2) {
            return ((kl) this).a(0, param1, 1);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 != -15053) {
            return;
        }
        if (!((kl) this).field_a) {
            ((kl) this).field_b[param0] = pi.a(((kl) this).field_g.a((byte) -23, param0), 0, false);
        } else {
            ((kl) this).field_b[param0] = (Object) (Object) ((kl) this).field_g.a((byte) -22, param0);
        }
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param1) {
            break L0;
          } else {
            kl.a(18);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 < 48) {
                break L3;
              } else {
                if (param0 <= 57) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 65) {
                break L4;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param0 < 97) {
                break L5;
              } else {
                if (param0 > 122) {
                  break L5;
                } else {
                  break L2;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L1;
          }
          stackOut_11_0 = 1;
          stackIn_13_0 = stackOut_11_0;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(param1, param0, true)) {
            return false;
        }
        if (((kl) this).field_c[param0] != null) {
            if (null != ((kl) this).field_c[param0][param1]) {
                return true;
            }
        }
        if (!(null == ((kl) this).field_b[param0])) {
            return true;
        }
        this.c(param0, param2 + -14987);
        if (((kl) this).field_b[param0] != null) {
            return true;
        }
        if (param2 != -66) {
            ((kl) this).field_f = -125;
            return false;
        }
        return false;
    }

    final boolean a(String param0, String param1, int param2) {
        if (!(((kl) this).b(17820))) {
            return false;
        }
        if (param2 >= -125) {
            boolean discarded$0 = ((kl) this).d(-13);
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((kl) this).field_d.field_h.b((byte) 63, wj.a(var6, 2148));
        if (!(this.a(var4, 6447))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((kl) this).field_d.field_x[var4].b((byte) 89, wj.a(var7, 2148));
        return ((kl) this).a(var4, var5, (byte) -66);
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (param0) {
            ((byte[]) ((kl) this).field_b[7])[1] = (byte) -124;
        }
        if (!(this.a(param1, 6447))) {
            return false;
        }
        if (null != ((kl) this).field_b[param1]) {
            return true;
        }
        this.c(param1, -15053);
        if (((kl) this).field_b[param1] != null) {
            return true;
        }
        return false;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 1) {
            boolean discarded$0 = kl.a('', true);
        }
        return this.a(1, param0, (int[]) null, param1);
    }

    public static void a(int param0) {
        if (param0 != 22775) {
            field_e = null;
        }
        field_e = null;
    }

    kl(hl param0, boolean param1, int param2) {
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
          ((kl) this).field_d = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                ((kl) this).field_g = param0;
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
              ((kl) this).field_a = stackIn_6_1 != 0;
              ((kl) this).field_f = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Orb points: <%0>";
    }
}
