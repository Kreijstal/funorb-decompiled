/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    int field_e;
    static int field_b;
    boolean field_g;
    private rf field_f;
    private tja field_a;
    private Object[][] field_d;
    private Object[] field_c;
    static String field_h;

    final int a(String param0, boolean param1) {
        if (!(((vr) this).a(0))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((vr) this).field_f.field_m.a((byte) -79, efa.a(var4, true));
        if (param1) {
            byte[] discarded$0 = ((vr) this).b(87, 101);
        }
        if (!this.a(var3, (byte) 70)) {
            return -1;
        }
        return var3;
    }

    final boolean a(String param0, int param1) {
        if (param1 != 20637) {
            boolean discarded$0 = ((vr) this).a(15);
        }
        if (!(((vr) this).a(param1 + -20637))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((vr) this).field_f.field_m.a((byte) -75, efa.a(var4, true));
        return ((vr) this).c(var3, -734);
    }

    final synchronized boolean a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((vr) this).a((byte) -17);
        }
        if (((vr) this).field_f == null) {
            ((vr) this).field_f = ((vr) this).field_a.b(-16);
            if (!(((vr) this).field_f != null)) {
                return false;
            }
            ((vr) this).field_c = new Object[((vr) this).field_f.field_f];
            ((vr) this).field_d = new Object[((vr) this).field_f.field_f][];
        }
        return true;
    }

    private final synchronized boolean a(int[] param0, byte param1, int param2, int param3) {
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
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        lu var26 = null;
        byte[] var27 = null;
        lu var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        lu var32 = null;
        int[] var34 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var42 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        int[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        int[] var55 = null;
        byte[][] var56 = null;
        byte[] var57 = null;
        var22 = BachelorFridge.field_y;
        if (this.a(param3, (byte) 70)) {
          if (((vr) this).field_c[param3] == null) {
            return false;
          } else {
            L0: {
              var5 = ((vr) this).field_f.field_e[param3];
              var50 = ((vr) this).field_f.field_c[param3];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (((vr) this).field_d[param3] == null) {
                ((vr) this).field_d[param3] = new Object[((vr) this).field_f.field_j[param3]];
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              var7 = ((vr) this).field_d[param3];
              var8 = 1;
              if (param1 <= -83) {
                break L1;
              } else {
                ((vr) this).field_c = null;
                break L1;
              }
            }
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
                      var10 = var50[var9_int];
                      break L4;
                    }
                  }
                  if (var7[var10] == null) {
                    var8 = 0;
                    break L3;
                  } else {
                    var9_int++;
                    continue L2;
                  }
                }
              }
              if (var8 != 0) {
                return true;
              } else {
                L5: {
                  L6: {
                    if (param0 == null) {
                      break L6;
                    } else {
                      L7: {
                        if (-1 != (param0[0] ^ -1)) {
                          break L7;
                        } else {
                          if (param0[1] != 0) {
                            break L7;
                          } else {
                            if (0 != param0[2]) {
                              break L7;
                            } else {
                              if (param0[3] == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      var51 = tb.a(true, (byte) 105, ((vr) this).field_c[param3]);
                      var26 = new lu(var51);
                      var26.a(17654, 5, param0, var26.field_h.length);
                      var52 = var51;
                      break L5;
                    }
                  }
                  var52 = tb.a(false, (byte) 81, ((vr) this).field_c[param3]);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L5;
                }
                L8: {
                  var53 = td.a(-124, var52);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (!((vr) this).field_g) {
                    break L8;
                  } else {
                    ((vr) this).field_c[param3] = null;
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) < -2) {
                    var53 = var45;
                    if (((vr) this).field_e == 2) {
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var12 * (var5 * 4);
                      var32 = new lu(var54);
                      var14 = 0;
                      var15 = 0;
                      var32.field_g = var11;
                      var16 = 0;
                      L10: while (true) {
                        if (var12 <= var16) {
                          if (var14 != 0) {
                            var57 = new byte[var14];
                            var32.field_g = var11;
                            var14 = 0;
                            var17 = 0;
                            var18 = 0;
                            L11: while (true) {
                              if (var18 >= var12) {
                                var7[var15] = (Object) (Object) var57;
                                break L9;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L12: while (true) {
                                  if (var20 >= var5) {
                                    var18++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      var19 = var19 + var32.f(124);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L13;
                                      } else {
                                        var21 = var50[var20];
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (var21 == param2) {
                                        bl.a(var54, var17, var57, var14, var19);
                                        var14 = var14 + var19;
                                        break L14;
                                      } else {
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
                            if (var5 <= var18) {
                              var16++;
                              continue L10;
                            } else {
                              L16: {
                                var17 = var17 + var32.f(-68);
                                if (var6 != null) {
                                  var19 = var50[var18];
                                  break L16;
                                } else {
                                  var19 = var18;
                                  break L16;
                                }
                              }
                              if (param2 == var19) {
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
                      var11 = var53.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * (var5 * var12);
                      var29 = new lu(var54);
                      var29.field_g = var11;
                      var55 = new int[var5];
                      var47 = var55;
                      var39 = var47;
                      var30 = var39;
                      var14_ref_int__ = var30;
                      var15 = 0;
                      L17: while (true) {
                        if (var15 >= var12) {
                          var56 = new byte[var5][];
                          var48 = var56;
                          var40 = var48;
                          var31 = var40;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L18: while (true) {
                            if (var5 <= var16) {
                              var29.field_g = var11;
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var17 >= var12) {
                                  var17 = 0;
                                  L20: while (true) {
                                    if (var17 >= var5) {
                                      break L9;
                                    } else {
                                      L21: {
                                        if (var6 == null) {
                                          var18 = var17;
                                          break L21;
                                        } else {
                                          var18 = var50[var17];
                                          break L21;
                                        }
                                      }
                                      if (-1 == (((vr) this).field_e ^ -1)) {
                                        var7[var18] = ug.a(false, var56[var17], -19524);
                                        var17++;
                                        continue L20;
                                      } else {
                                        var7[var18] = (Object) (Object) var56[var17];
                                        var17++;
                                        continue L20;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L22: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L19;
                                    } else {
                                      var18 = var18 + var29.f(72);
                                      bl.a(var54, var16, var56[var19], var55[var19], var18);
                                      var16 = var16 + var18;
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var19++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var55[var16]];
                              var55[var16] = 0;
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
                              var16 = var16 + var29.f(-128);
                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                              var17++;
                              continue L23;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L24: {
                      if (var6 != null) {
                        var53 = var45;
                        var11 = var50[0];
                        break L24;
                      } else {
                        var11 = 0;
                        break L24;
                      }
                    }
                    var53 = var45;
                    if (((vr) this).field_e == 0) {
                      var7[var11] = ug.a(false, var54, -19524);
                      break L9;
                    } else {
                      var7[var11] = (Object) (Object) var53;
                      return true;
                    }
                  }
                }
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        if (!((vr) this).a(0)) {
            return null;
        }
        param2 = param2.toLowerCase();
        if (param0 != 123) {
            return null;
        }
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param2;
        int var4 = ((vr) this).field_f.field_m.a((byte) -87, efa.a(var6, true));
        if (!this.a(var4, (byte) 70)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((vr) this).field_f.field_l[var4].a((byte) -81, efa.a(var7, true));
        return ((vr) this).b(-71, var4, var5);
    }

    public static void b(int param0) {
        if (param0 != -19779) {
            return;
        }
        field_h = null;
    }

    final int a(byte param0) {
        if (param0 != 20) {
            return -79;
        }
        if (!(((vr) this).a(0))) {
            return -1;
        }
        return ((vr) this).field_f.field_j.length;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!((vr) this).a(0)) {
            return false;
        }
        if (param1 >= 0) {
            // if_icmplt L49
            // if_icmple L49
            // if_icmpge L49
        } else {
            if (cia.field_j) {
                throw new IllegalArgumentException(param1 + " " + param2);
            }
            return false;
        }
        if (param0) {
            Object var5 = null;
            int discarded$0 = ((vr) this).a((String) null, false);
            return true;
        }
        return true;
    }

    final boolean a(String param0, boolean param1, String param2) {
        if (!((vr) this).a(0)) {
            return false;
        }
        if (param1) {
            return ((boolean[]) ((vr) this).field_c[5])[9];
        }
        param2 = param2.toLowerCase();
        param0 = param0.toLowerCase();
        int var4 = ((vr) this).field_f.field_m.a((byte) -92, efa.a((CharSequence) (Object) param2, !param1 ? true : false));
        if (!this.a(var4, (byte) 70)) {
            return false;
        }
        CharSequence var6 = (CharSequence) (Object) param0;
        int var5 = ((vr) this).field_f.field_l[var4].a((byte) -104, efa.a(var6, true));
        return ((vr) this).a(-121, var5, var4);
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (!((vr) this).a(0)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          if (param0) {
            var4 = 0;
            L0: while (true) {
              if (var4 >= ((vr) this).field_c.length) {
                if (var2 == 0) {
                  return 100;
                } else {
                  var4 = var3 * 100 / var2;
                  return var4;
                }
              } else {
                if ((((vr) this).field_f.field_e[var4] ^ -1) < -1) {
                  var3 = var3 + ((vr) this).b(var4, (byte) -87);
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
            return 1;
          }
        }
    }

    final boolean b(String param0, boolean param1) {
        if (!(((vr) this).a(0))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((vr) this).field_f.field_m.a((byte) -115, efa.a(var4, true));
        if (!(var3 >= 0)) {
            return false;
        }
        if (param1) {
            int discarded$0 = ((vr) this).a(((byte[]) ((vr) this).field_c[0])[9], -128, (String) ((vr) this).field_c[0]);
            return true;
        }
        return true;
    }

    final synchronized int b(int param0, byte param1) {
        if (param1 != -87) {
            boolean discarded$0 = ((vr) this).a(((int[]) ((vr) this).field_c[13])[1]);
        }
        if (!(this.a(param0, (byte) 70))) {
            return 0;
        }
        if (!(((vr) this).field_c[param0] == null)) {
            return 100;
        }
        return ((vr) this).field_a.a(8192, param0);
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(false, param0, param3)) {
          if (param2 == -3) {
            L0: {
              L1: {
                var5 = null;
                if (null == ((vr) this).field_d[param0]) {
                  break L1;
                } else {
                  if (((vr) this).field_d[param0][param3] == null) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              if (this.a(param1, (byte) -116, param3, param0)) {
                break L0;
              } else {
                this.e(param0, param2 + 3);
                if (this.a(param1, (byte) -101, param3, param0)) {
                  break L0;
                } else {
                  return null;
                }
              }
            }
            if (((vr) this).field_d[param0] != null) {
              L2: {
                if (null != ((vr) this).field_d[param0][param3]) {
                  var7 = tb.a(false, (byte) 96, ((vr) this).field_d[param0][param3]);
                  var5_array = var7;
                  if (var7 != null) {
                    break L2;
                  } else {
                    throw new RuntimeException("");
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5_array == null) {
                  break L3;
                } else {
                  if (-2 != (((vr) this).field_e ^ -1)) {
                    if (-3 != (((vr) this).field_e ^ -1)) {
                      break L3;
                    } else {
                      ((vr) this).field_d[param0] = null;
                      break L3;
                    }
                  } else {
                    ((vr) this).field_d[param0][param3] = null;
                    if (((vr) this).field_f.field_j[param0] != 1) {
                      break L3;
                    } else {
                      ((vr) this).field_d[param0] = null;
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
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = BachelorFridge.field_y;
        if (param0 != 75) {
            field_b = 75;
        }
        ne var4 = (ne) (Object) rg.field_f.b((byte) 90);
        while (var4 != null) {
            kja.a(param1, (byte) 58, var4);
            var4 = (ne) (Object) rg.field_f.c(0);
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!(this.a(param0, (byte) 70))) {
            return false;
        }
        if (param1 != -734) {
            ((vr) this).field_a = null;
        }
        if (!(((vr) this).field_c[param0] == null)) {
            return true;
        }
        this.e(param0, 0);
        if (((vr) this).field_c[param0] == null) {
            return false;
        }
        return true;
    }

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (!((vr) this).a(0)) {
          return false;
        } else {
          L0: {
            var2 = 1;
            if (param0 >= 87) {
              break L0;
            } else {
              vr.a((byte) -107, ((int[]) ((vr) this).field_c[5])[10]);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((vr) this).field_f.field_o.length) {
              return var2 != 0;
            } else {
              var4 = ((vr) this).field_f.field_o[var3];
              if (null == ((vr) this).field_c[var4]) {
                this.e(var4, 0);
                if (null == ((vr) this).field_c[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4 = -67 % ((param0 - 20) / 34);
        return this.a(param1, (int[]) null, -3, param2);
    }

    private final synchronized void e(int param0, int param1) {
        if (param1 != 0) {
            boolean discarded$0 = ((vr) this).b((byte) 86);
        }
        if (((vr) this).field_g) {
            ((vr) this).field_c[param0] = (Object) (Object) ((vr) this).field_a.a((byte) 112, param0);
        } else {
            ((vr) this).field_c[param0] = ug.a(false, ((vr) this).field_a.a((byte) 101, param0), -19524);
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        if (!((vr) this).a(0)) {
          return false;
        } else {
          L0: {
            if (param0 > -1) {
              break L0;
            } else {
              if (param0 >= ((vr) this).field_f.field_j.length) {
                break L0;
              } else {
                if (-1 != ((vr) this).field_f.field_j[param0]) {
                  if (param1 == 70) {
                    return true;
                  } else {
                    boolean discarded$2 = this.a((int[]) ((vr) this).field_c[7], ((byte[]) ((vr) this).field_c[23])[2], ((int[]) ((vr) this).field_c[11])[1], 106);
                    return true;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          if (!cia.field_j) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!((vr) this).a(param0 + param0)) {
            return false;
        }
        if (!((((vr) this).field_f.field_j.length ^ -1) != -2)) {
            return ((vr) this).a(-126, param1, 0);
        }
        if (!this.a(param1, (byte) 70)) {
            return false;
        }
        if (!((((vr) this).field_f.field_j[param1] ^ -1) != -2)) {
            return ((vr) this).a(param0 + -102, 0, param1);
        }
        throw new RuntimeException();
    }

    final int a(byte param0, int param1, String param2) {
        if (!(this.a(param1, (byte) 70))) {
            return -1;
        }
        param2 = param2.toLowerCase();
        if (param0 != 6) {
            ((vr) this).field_f = null;
        }
        CharSequence var5 = (CharSequence) (Object) param2;
        int var4 = ((vr) this).field_f.field_l[param1].a((byte) -128, efa.a(var5, true));
        if (!this.a(false, param1, var4)) {
            return -1;
        }
        return var4;
    }

    final int d(int param0, int param1) {
        if (param1 != 0) {
            vr.a(-90, (po) ((Object[]) ((Object[]) ((vr) this).field_c[6])[0])[9], 120, ((int[]) ((vr) this).field_c[35])[29], 19, (kv[]) null, -99, (po) null, -110, ((int[]) ((vr) this).field_c[0])[6], ((boolean[]) ((vr) this).field_c[35])[11], (kv[]) null, 84, ((int[]) ((vr) this).field_c[0])[0], 54);
        }
        if (!this.a(param0, (byte) 70)) {
            return 0;
        }
        return ((vr) this).field_f.field_j[param0];
    }

    final static void a(int param0, po param1, int param2, int param3, int param4, kv[] param5, int param6, po param7, int param8, int param9, boolean param10, kv[] param11, int param12, int param13, int param14) {
        Object var16 = null;
        ll.a(jc.field_t, param13, param3, param2, param8, param5, 0, param6, param1, param9, param4, (kv[]) null, nja.field_a, param11, param7, param0, 0, 256, param12, param14, fa.field_f);
        la.a(param10, 2);
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((vr) this).a(param1)) {
            return null;
        }
        if (((vr) this).field_f.field_j.length == 1) {
            return ((vr) this).b(param1 ^ -56, 0, param0);
        }
        if (!this.a(param0, (byte) 70)) {
            return null;
        }
        if (!(-2 != (((vr) this).field_f.field_j[param0] ^ -1))) {
            return ((vr) this).b(param1 + -45, param0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (param0 >= -101) {
            return ((boolean[]) ((vr) this).field_c[3])[6];
        }
        if (!(this.a(false, param2, param1))) {
            return false;
        }
        if (null != ((vr) this).field_d[param2]) {
            if (!(((vr) this).field_d[param2][param1] == null)) {
                return true;
            }
        }
        if (!(null == ((vr) this).field_c[param2])) {
            return true;
        }
        this.e(param2, 0);
        if (null != ((vr) this).field_c[param2]) {
            return true;
        }
        return false;
    }

    vr(tja param0, boolean param1, int param2) {
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
          ((vr) this).field_f = null;
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                ((vr) this).field_a = param0;
                ((vr) this).field_e = param2;
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
              ((vr) this).field_g = stackIn_6_1 != 0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final int a(int param0, String param1) {
        if (!(((vr) this).a(param0))) {
            return 0;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((vr) this).field_f.field_m.a((byte) -95, efa.a(var4, true));
        return ((vr) this).b(var3, (byte) -87);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Age:";
    }
}
