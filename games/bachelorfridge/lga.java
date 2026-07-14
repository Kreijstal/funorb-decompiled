/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lga {
    private boolean[][] field_p;
    private int field_h;
    private int field_j;
    private jfa field_o;
    private wda[][] field_f;
    private int field_c;
    static String[] field_n;
    private mka[][] field_m;
    private int field_q;
    private int field_b;
    static int field_r;
    static kv field_k;
    static String field_i;
    eaa field_e;
    private int field_a;
    private int[][] field_d;
    private int field_l;
    private int field_g;

    final static String a(boolean param0, String[] param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = BachelorFridge.field_y;
        var3 = param2.length();
        if (!param0) {
          field_n = null;
          var4 = var3;
          var5 = 0;
          L0: while (true) {
            var6 = param2.indexOf("<%", var5);
            if (0 <= var6) {
              var5 = 2 + var6;
              L1: while (true) {
                L2: {
                  if (var3 <= var5) {
                    break L2;
                  } else {
                    if (!ula.a(param2.charAt(var5), 48)) {
                      break L2;
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
                var7_ref = param2.substring(2 + var6, var5);
                if (!vn.a((byte) 107, (CharSequence) (Object) var7_ref)) {
                  continue L0;
                } else {
                  if (var3 <= var5) {
                    continue L0;
                  } else {
                    if (62 != param2.charAt(var5)) {
                      continue L0;
                    } else {
                      var5++;
                      var8 = pd.a((byte) 47, (CharSequence) (Object) var7_ref);
                      var4 = var4 + (param1[var8].length() + var6 + -var5);
                      continue L0;
                    }
                  }
                }
              }
            } else {
              var12 = new StringBuilder(var4);
              var7 = 0;
              var5 = 0;
              L3: while (true) {
                var8 = param2.indexOf("<%", var5);
                if ((var8 ^ -1) > -1) {
                  StringBuilder discarded$6 = var12.append(param2.substring(var7));
                  return var12.toString();
                } else {
                  var5 = var8 - -2;
                  L4: while (true) {
                    L5: {
                      if (var3 <= var5) {
                        break L5;
                      } else {
                        if (!ula.a(param2.charAt(var5), 48)) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    var9 = param2.substring(2 + var8, var5);
                    if (vn.a((byte) 113, (CharSequence) (Object) var9)) {
                      if (var3 <= var5) {
                        continue L3;
                      } else {
                        if (param2.charAt(var5) != 62) {
                          continue L3;
                        } else {
                          var5++;
                          var10 = pd.a((byte) 47, (CharSequence) (Object) var9);
                          StringBuilder discarded$7 = var12.append(param2.substring(var7, var8));
                          StringBuilder discarded$8 = var12.append(param1[var10]);
                          var7 = var5;
                          continue L3;
                        }
                      }
                    } else {
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } else {
          var4 = var3;
          var5 = 0;
          L6: while (true) {
            var6 = param2.indexOf("<%", var5);
            if (0 <= var6) {
              var5 = 2 + var6;
              L7: while (true) {
                L8: {
                  if (var3 <= var5) {
                    break L8;
                  } else {
                    if (!ula.a(param2.charAt(var5), 48)) {
                      break L8;
                    } else {
                      var5++;
                      continue L7;
                    }
                  }
                }
                var7_ref = param2.substring(2 + var6, var5);
                if (!vn.a((byte) 107, (CharSequence) (Object) var7_ref)) {
                  continue L6;
                } else {
                  if (var3 <= var5) {
                    continue L6;
                  } else {
                    if (62 != param2.charAt(var5)) {
                      continue L6;
                    } else {
                      var5++;
                      var8 = pd.a((byte) 47, (CharSequence) (Object) var7_ref);
                      var4 = var4 + (param1[var8].length() + var6 + -var5);
                      continue L6;
                    }
                  }
                }
              }
            } else {
              var13 = new StringBuilder(var4);
              var7 = 0;
              var5 = 0;
              L9: while (true) {
                var8 = param2.indexOf("<%", var5);
                if ((var8 ^ -1) > -1) {
                  StringBuilder discarded$9 = var13.append(param2.substring(var7));
                  return var13.toString();
                } else {
                  var5 = var8 - -2;
                  L10: while (true) {
                    L11: {
                      if (var3 <= var5) {
                        break L11;
                      } else {
                        if (!ula.a(param2.charAt(var5), 48)) {
                          break L11;
                        } else {
                          var5++;
                          continue L10;
                        }
                      }
                    }
                    var9 = param2.substring(2 + var8, var5);
                    if (vn.a((byte) 113, (CharSequence) (Object) var9)) {
                      if (var3 <= var5) {
                        continue L9;
                      } else {
                        if (param2.charAt(var5) != 62) {
                          continue L9;
                        } else {
                          var5++;
                          var10 = pd.a((byte) 47, (CharSequence) (Object) var9);
                          StringBuilder discarded$10 = var13.append(param2.substring(var7, var8));
                          StringBuilder discarded$11 = var13.append(param1[var10]);
                          var7 = var5;
                          continue L9;
                        }
                      }
                    } else {
                      continue L9;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        if (param0 != -4) {
          var2 = null;
          String discarded$2 = lga.a(true, (String[]) null, (String) null);
          field_i = null;
          field_n = null;
          field_k = null;
          return;
        } else {
          field_i = null;
          field_n = null;
          field_k = null;
          return;
        }
    }

    final static void a(nv param0, boolean param1) {
        if (!(param0 != null)) {
            return;
        }
        da.field_d = param0;
        fo.field_a.field_z.d(82);
        fo.field_a.a(-1, (sna) (Object) da.field_d);
        gm.field_k = param1 ? true : false;
    }

    private final void a(mka param0, int param1, int param2, int param3) {
        mka var5 = null;
        mka var15 = null;
        if (param3 >= param1) {
          if (-1 <= param2) {
            if (param1 <= ((lga) this).field_l - 1) {
              if (param2 > -1 + ((lga) this).field_b) {
                return;
              } else {
                if (!((lga) this).field_p[param1][param2]) {
                  L0: {
                    if (0 != ((lga) this).field_f[param1][param2].field_e) {
                      break L0;
                    } else {
                      if (-1 + ((lga) this).field_b <= param2) {
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                  L1: {
                    if (-4 != ((lga) this).field_f[param0.field_k][param0.field_g].field_e) {
                      break L1;
                    } else {
                      if (-1 != ((lga) this).field_f[param1][param2].field_e) {
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                  if (param0.field_g == param2) {
                    if (0 == ((lga) this).field_f[param1][param2].field_e) {
                      return;
                    } else {
                      ((lga) this).field_p[param1][param2] = true;
                      ((lga) this).field_d[param1][param2] = param0.field_l - -1;
                      var15 = new mka(param0, param1, param2, ((lga) this).field_d[param1][param2]);
                      var5 = var15;
                      ((lga) this).field_m[param1][param2] = var15;
                      ((lga) this).field_e.a(-16, (bw) (Object) var5);
                      return;
                    }
                  } else {
                    ((lga) this).field_p[param1][param2] = true;
                    ((lga) this).field_d[param1][param2] = param0.field_l - -1;
                    var15 = new mka(param0, param1, param2, ((lga) this).field_d[param1][param2]);
                    var5 = var15;
                    ((lga) this).field_m[param1][param2] = var15;
                    ((lga) this).field_e.a(-16, (bw) (Object) var5);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int var3 = 0;
        mc var4 = null;
        var3 = BachelorFridge.field_y;
        var4 = (mc) (Object) ((lga) this).field_e.b((byte) 90);
        var4.a(false);
        if (var4.field_f != 8) {
          if (1 == var4.field_f) {
            ((lga) this).field_o.field_i.a((bw) (Object) new qd(((lga) this).field_o, -39 * var4.field_j), true);
            if (param0 == 82) {
              return;
            } else {
              field_k = null;
              return;
            }
          } else {
            if (var4.field_f == 4) {
              if (-4 != (((lga) this).field_o.field_m[((lga) this).field_o.field_u][((lga) this).field_o.field_l].field_e ^ -1)) {
                ((lga) this).field_o.field_i.a((bw) (Object) new qd(((lga) this).field_o, var4.field_j * 39), true);
                if (param0 == 82) {
                  return;
                } else {
                  field_k = null;
                  return;
                }
              } else {
                ((lga) this).field_o.field_i.a((bw) (Object) new qd(((lga) this).field_o, var4.field_j * 39), true);
                if (param0 == 82) {
                  return;
                } else {
                  field_k = null;
                  return;
                }
              }
            } else {
              if ((var4.field_f ^ -1) != -3) {
                if (param0 == 82) {
                  return;
                } else {
                  field_k = null;
                  return;
                }
              } else {
                ((lga) this).field_o.field_i.a((bw) (Object) new ug(((lga) this).field_o, var4.field_j * 56), true);
                if (param0 == 82) {
                  return;
                } else {
                  field_k = null;
                  return;
                }
              }
            }
          }
        } else {
          ((lga) this).field_o.field_i.a((bw) (Object) new ug(((lga) this).field_o, var4.field_j * -56), true);
          if (param0 == 82) {
            return;
          } else {
            field_k = null;
            return;
          }
        }
    }

    final void a(int param0) {
        mka var2 = null;
        int var3 = 0;
        int var4 = 0;
        mc var5 = null;
        int var6 = 0;
        mka var8 = null;
        mka var9 = null;
        mka var10 = null;
        mka var13 = null;
        mka var14 = null;
        var6 = BachelorFridge.field_y;
        if (param0 == 8) {
          var9 = ((lga) this).field_m[((lga) this).field_h][((lga) this).field_c];
          var8 = var9;
          var2 = var8;
          ((lga) this).field_e = new eaa();
          var3 = ((lga) this).field_h;
          var4 = ((lga) this).field_c;
          var5 = new mc(-1, 0);
          L0: while (true) {
            if (var2 == null) {
              if (var5 == null) {
                return;
              } else {
                ((lga) this).field_e.a(-57, (bw) (Object) var5);
                return;
              }
            } else {
              var4 = var9.field_g;
              var3 = var9.field_k;
              var10 = var9.field_h;
              if (var10 != null) {
                L1: {
                  if (var10.field_k <= var3) {
                    break L1;
                  } else {
                    if (var5.field_f == 8) {
                      break L1;
                    } else {
                      ((lga) this).field_e.a(-21, (bw) (Object) var5);
                      var5 = new mc(8, 1);
                      continue L0;
                    }
                  }
                }
                L2: {
                  if (var10.field_k >= var3) {
                    break L2;
                  } else {
                    if (2 == var5.field_f) {
                      break L2;
                    } else {
                      ((lga) this).field_e.a(-116, (bw) (Object) var5);
                      var5 = new mc(2, 1);
                      continue L0;
                    }
                  }
                }
                if (var10.field_g > var4) {
                  ((lga) this).field_e.a(-57, (bw) (Object) var5);
                  var5 = new mc(1, 2);
                  continue L0;
                } else {
                  if (var10.field_g >= var4) {
                    L3: {
                      var5.field_j = var5.field_j + 1;
                      if ((var5.field_f ^ -1) == -2) {
                        break L3;
                      } else {
                        if (var5.field_f != 4) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5.field_j = var5.field_j + 1;
                    continue L0;
                  } else {
                    ((lga) this).field_e.a(param0 + -41, (bw) (Object) var5);
                    var5 = new mc(4, 2);
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        } else {
          ((lga) this).a(-28);
          var13 = ((lga) this).field_m[((lga) this).field_h][((lga) this).field_c];
          var8 = var13;
          var2 = var8;
          ((lga) this).field_e = new eaa();
          var3 = ((lga) this).field_h;
          var4 = ((lga) this).field_c;
          var5 = new mc(-1, 0);
          L4: while (true) {
            if (var2 == null) {
              if (var5 == null) {
                return;
              } else {
                ((lga) this).field_e.a(-57, (bw) (Object) var5);
                return;
              }
            } else {
              var4 = var13.field_g;
              var3 = var13.field_k;
              var14 = var13.field_h;
              if (var14 != null) {
                L5: {
                  if (var14.field_k <= var3) {
                    break L5;
                  } else {
                    if (var5.field_f == 8) {
                      break L5;
                    } else {
                      ((lga) this).field_e.a(-21, (bw) (Object) var5);
                      var5 = new mc(8, 1);
                      continue L4;
                    }
                  }
                }
                L6: {
                  if (var14.field_k >= var3) {
                    break L6;
                  } else {
                    if (2 == var5.field_f) {
                      break L6;
                    } else {
                      ((lga) this).field_e.a(-116, (bw) (Object) var5);
                      var5 = new mc(2, 1);
                      continue L4;
                    }
                  }
                }
                if (var14.field_g > var4) {
                  ((lga) this).field_e.a(-57, (bw) (Object) var5);
                  var5 = new mc(1, 2);
                  continue L4;
                } else {
                  if (var14.field_g >= var4) {
                    L7: {
                      var5.field_j = var5.field_j + 1;
                      if ((var5.field_f ^ -1) == -2) {
                        break L7;
                      } else {
                        if (var5.field_f != 4) {
                          continue L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var5.field_j = var5.field_j + 1;
                    continue L4;
                  } else {
                    ((lga) this).field_e.a(param0 + -41, (bw) (Object) var5);
                    var5 = new mc(4, 2);
                    continue L4;
                  }
                }
              } else {
                continue L4;
              }
            }
          }
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        mka var4 = null;
        mka var5 = null;
        var3 = BachelorFridge.field_y;
        ((lga) this).field_q = ((lga) this).field_g;
        ((lga) this).field_a = ((lga) this).field_j;
        if (param0 > 48) {
          ((lga) this).field_e.a(-79, (bw) (Object) new mka((mka) null, ((lga) this).field_a, ((lga) this).field_q, 0));
          L0: while (true) {
            if (!((lga) this).field_e.e(12917)) {
              L1: {
                var4 = (mka) (Object) ((lga) this).field_e.a(false);
                var5 = var4;
                if ((((lga) this).field_f[var4.field_k][var4.field_g].field_d & 2 ^ -1) != -3) {
                  break L1;
                } else {
                  this.a(var5, 1 + var5.field_k, var5.field_g, -1);
                  break L1;
                }
              }
              L2: {
                if ((((lga) this).field_f[var4.field_k][var4.field_g].field_d & 8 ^ -1) != -9) {
                  break L2;
                } else {
                  this.a(var5, var5.field_k - 1, var5.field_g, -1);
                  break L2;
                }
              }
              L3: {
                if (-5 != (4 & ((lga) this).field_f[var4.field_k][var4.field_g].field_d ^ -1)) {
                  break L3;
                } else {
                  this.a(var5, var5.field_k, 2 + var5.field_g, -1);
                  break L3;
                }
              }
              if ((((lga) this).field_f[var4.field_k][var4.field_g].field_d & 1) == 1) {
                this.a(var5, var5.field_k, -2 + var5.field_g, -1);
                continue L0;
              } else {
                continue L0;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void c(byte param0) {
        if (null != kga.field_c) {
          L0: {
            wd.a((byte) 70, (java.awt.Canvas) (Object) kga.field_c);
            kga.field_c.a(-6, ju.field_r);
            kga.field_c = null;
            if (null != qt.field_l) {
              qt.field_l.a(true);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 <= 107) {
            field_i = null;
            dca.field_y.requestFocus();
            return;
          } else {
            dca.field_y.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    lga(jfa param0) {
        ((lga) this).field_o = param0;
        ((lga) this).field_f = ((lga) this).field_o.field_m;
        ((lga) this).field_l = ((lga) this).field_f.length;
        ((lga) this).field_b = ((lga) this).field_f[0].length;
        ((lga) this).field_h = ((lga) this).field_o.field_x;
        ((lga) this).field_d = new int[((lga) this).field_l][((lga) this).field_b];
        ((lga) this).field_j = ((lga) this).field_o.field_u;
        ((lga) this).field_c = ((lga) this).field_o.field_z;
        ((lga) this).field_p = new boolean[((lga) this).field_l][((lga) this).field_b];
        ((lga) this).field_m = new mka[((lga) this).field_l][((lga) this).field_b];
        ((lga) this).field_g = ((lga) this).field_o.field_l;
        ((lga) this).field_e = new eaa();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"Grosser, with more added slime...", "... more creatures to choose from ...", "... more vomit, more poo and more mayhem!"};
        field_i = "Send private Quick Chat to <%0>";
        field_r = 3;
    }
}
