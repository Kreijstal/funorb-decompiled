/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lga extends rj {
    private vna field_D;
    static int[][] field_z;
    static cn field_B;
    private bm field_A;
    private String[] field_C;

    private final bm a(int param0, int param1, byte param2) {
        bm var4 = null;
        bm var4_ref = null;
        bm var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var4 = (bm) (Object) ((lga) this).field_D.f(param2 ^ 92);
        if (param2 == -20) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4_ref = (bm) (Object) ((lga) this).field_D.e(122);
                  continue L0;
                } else {
                  L2: {
                    if (param1 < var5.field_g) {
                      break L2;
                    } else {
                      if (var5.field_l > param0) {
                        break L2;
                      } else {
                        if (var5.field_j + var5.field_g <= param1) {
                          break L2;
                        } else {
                          if (var5.field_l - -var5.field_i >= param0) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_k;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    String d(byte param0) {
        int var2 = 0;
        if (null != ((lga) this).field_A) {
          if (((lga) this).field_C != null) {
            if (((lga) this).field_C.length <= ((lga) this).field_A.field_h) {
              return null;
            } else {
              var2 = 16 % ((-58 - param0) / 60);
              return ((lga) this).field_C[((lga) this).field_A.field_h];
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    lga(String param0, isa param1) {
        super(param0, (qc) null);
        ((lga) this).field_A = null;
        ((lga) this).field_r = param1;
    }

    final void a(String param0, int param1, int param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (null == ((lga) this).field_C) {
          var7 = new String[param1 - -1];
          var9 = var7;
          if (((lga) this).field_C == null) {
            ((lga) this).field_C = var9;
            ((lga) this).field_C[param1] = param0;
            if (param2 == 0) {
              return;
            } else {
              ((lga) this).a((byte) -100, 15, 61, -76, -74);
              return;
            }
          } else {
            var5 = 0;
            L0: while (true) {
              if (((lga) this).field_C.length <= var5) {
                ((lga) this).field_C = var9;
                ((lga) this).field_C[param1] = param0;
                if (param2 == 0) {
                  return;
                } else {
                  ((lga) this).a((byte) -100, 15, 61, -76, -74);
                  return;
                }
              } else {
                var7[var5] = ((lga) this).field_C[var5];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          if (param1 < ((lga) this).field_C.length) {
            ((lga) this).field_C[param1] = param0;
            if (param2 == 0) {
              return;
            } else {
              ((lga) this).a((byte) -100, 15, 61, -76, -74);
              return;
            }
          } else {
            var7 = new String[param1 - -1];
            var8 = var7;
            var4 = var7;
            if (((lga) this).field_C == null) {
              ((lga) this).field_C = var8;
              ((lga) this).field_C[param1] = param0;
              if (param2 == 0) {
                return;
              } else {
                ((lga) this).a((byte) -100, 15, 61, -76, -74);
                return;
              }
            } else {
              var5 = 0;
              L1: while (true) {
                if (((lga) this).field_C.length <= var5) {
                  ((lga) this).field_C = var8;
                  ((lga) this).field_C[param1] = param0;
                  if (param2 == 0) {
                    return;
                  } else {
                    ((lga) this).a((byte) -100, 15, 61, -76, -74);
                    return;
                  }
                } else {
                  var7[var5] = ((lga) this).field_C[var5];
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          super.a(param0, param1 + 0, param2, param3);
          ((lga) this).field_A = null;
          if (((lga) this).field_f) {
            var5 = -param0 + (jba.field_j + -((lga) this).field_i);
            var6 = sta.field_B + -param3 - ((lga) this).field_n;
            ((lga) this).field_A = this.a(var6, var5, (byte) -20);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 2097152) {
          return;
        } else {
          field_z = null;
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        oaa var3 = null;
        bja var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        bm var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        Object var17 = null;
        oaa var17_ref = null;
        String var21 = null;
        bja var22 = null;
        kha var23 = null;
        bm var24 = null;
        Object var25 = null;
        String var26 = null;
        bja var27 = null;
        kha var28 = null;
        bm var29 = null;
        oaa var30 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var17 = null;
        var25 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        if (param0 == 18758) {
          ((lga) this).field_D = new vna();
          var2 = 0;
          var30 = (oaa) (Object) ((lga) this).field_r;
          var27 = var30.a((ae) this, 14157);
          L0: while (true) {
            var5 = ((lga) this).field_o.indexOf("<hotspot=", var2);
            if (-1 != var5) {
              var7 = ((lga) this).field_o.indexOf(">", var5);
              var26 = ((lga) this).field_o.substring(9 + var5, var7);
              var7 = Integer.parseInt(var26);
              var2 = ((lga) this).field_o.indexOf("</hotspot>", var5);
              var8 = var27.a(var5, 0);
              var9 = var27.a(var2, 0);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var28 = var27.field_c[var11];
                    if (var8 != var11) {
                      stackOut_26_0 = var28.field_c[0];
                      stackIn_27_0 = stackOut_26_0;
                      break L2;
                    } else {
                      stackOut_25_0 = var27.a((byte) -59, var5);
                      stackIn_27_0 = stackOut_25_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_27_0;
                    if (var11 != var9) {
                      if (var28 == null) {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        break L3;
                      } else {
                        stackOut_30_0 = var28.field_c[-1 + var28.field_c.length];
                        stackIn_32_0 = stackOut_30_0;
                        break L3;
                      }
                    } else {
                      stackOut_28_0 = var27.a((byte) -59, var2);
                      stackIn_32_0 = stackOut_28_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_32_0;
                    var29 = new bm(var7, var13, var28.field_d, var14 - var13, Math.max(var30.a((byte) -90), var28.field_b - var28.field_d));
                    if (var10 != null) {
                      var10.field_k = var29;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((lga) this).field_D.b((byte) -46, (vg) (Object) var29);
                  var10 = var29;
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          ((lga) this).a((byte) -56, -23, 29, 43, 2);
          ((lga) this).field_D = new vna();
          var2 = 0;
          var17_ref = (oaa) (Object) ((lga) this).field_r;
          var3 = var17_ref;
          var22 = var17_ref.a((ae) this, 14157);
          var4 = var22;
          L5: while (true) {
            var5 = ((lga) this).field_o.indexOf("<hotspot=", var2);
            if (-1 != var5) {
              var7 = ((lga) this).field_o.indexOf(">", var5);
              var21 = ((lga) this).field_o.substring(9 + var5, var7);
              var7 = Integer.parseInt(var21);
              var2 = ((lga) this).field_o.indexOf("</hotspot>", var5);
              var8 = var22.a(var5, 0);
              var9 = var22.a(var2, 0);
              var10 = null;
              var11 = var8;
              L6: while (true) {
                if (var9 < var11) {
                  continue L5;
                } else {
                  L7: {
                    var23 = var22.field_c[var11];
                    if (var8 != var11) {
                      stackOut_9_0 = var23.field_c[0];
                      stackIn_10_0 = stackOut_9_0;
                      break L7;
                    } else {
                      stackOut_8_0 = var22.a((byte) -59, var5);
                      stackIn_10_0 = stackOut_8_0;
                      break L7;
                    }
                  }
                  L8: {
                    var13 = stackIn_10_0;
                    if (var11 != var9) {
                      if (var23 == null) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L8;
                      } else {
                        stackOut_13_0 = var23.field_c[-1 + var23.field_c.length];
                        stackIn_15_0 = stackOut_13_0;
                        break L8;
                      }
                    } else {
                      stackOut_11_0 = var22.a((byte) -59, var2);
                      stackIn_15_0 = stackOut_11_0;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = stackIn_15_0;
                    var24 = new bm(var7, var13, var23.field_d, var14 - var13, Math.max(var17_ref.a((byte) -90), var23.field_b - var23.field_d));
                    if (var10 != null) {
                      var10.field_k = var24;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((lga) this).field_D.b((byte) -46, (vg) (Object) var24);
                  var10 = var24;
                  var11++;
                  continue L6;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        bm var7 = null;
        Object var8 = null;
        super.b(param0, param1, param2, -118);
        var5 = param2 - ((lga) this).field_i;
        var6 = -((lga) this).field_n + param0;
        if (param3 <= -40) {
          var7 = this.a(var6, var5, (byte) -20);
          if (var7 != null) {
            if (((lga) this).field_h != null) {
              ((tma) (Object) ((lga) this).field_h).a((lga) this, var7.field_h, 30846, param1);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var8 = null;
          boolean discarded$2 = ((lga) this).a((ae) null, false);
          var7 = this.a(var6, var5, (byte) -20);
          if (var7 != null) {
            if (((lga) this).field_h == null) {
              return;
            } else {
              ((tma) (Object) ((lga) this).field_h).a((lga) this, var7.field_h, 30846, param1);
              return;
            }
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        oaa var5 = null;
        bm var6 = null;
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = (oaa) (Object) ((lga) this).field_r;
          var6 = ((lga) this).field_A;
          if (var6 == null) {
            return;
          } else {
            var7 = var5.a((ae) this, param0, (byte) 119);
            var8 = var5.a(param1, (ae) this, (byte) -49);
            L0: while (true) {
              nn.a(-2 + (var7 + var6.field_g), -2 + (var8 + var6.field_l), var6.field_i - -2, 2 + var6.field_j, false);
              var6 = var6.field_k;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    final static nma a(uia param0, byte param1) {
        if (param1 > -86) {
          return null;
        } else {
          return new nma(param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.a(-32768), param0.h(255));
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((lga) this).b(18758);
    }

    final static oc a(cn param0, String param1, String param2, boolean param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        if (param3) {
          var5 = param0.a(param2, (byte) 115, param1);
          var4 = var5;
          if (var5 == null) {
            return null;
          } else {
            return new oc(var5);
          }
        } else {
          return null;
        }
    }

    boolean a(ae param0, boolean param1) {
        if (param1) {
            return false;
        }
        return false;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ((lga) this).a((byte) -31, param2, ((oaa) (Object) ((lga) this).field_r).b((byte) 105, (ae) this), param3, param0);
        if (param1 == -120) {
          return;
        } else {
          field_B = null;
          return;
        }
    }

    public static void a(byte param0) {
        field_z = null;
        if (param0 != -123) {
            return;
        }
        field_B = null;
    }

    final static boolean b(boolean param0) {
        int[] var1 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int[] var21 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (null == rla.field_D) {
            rla.field_D = cna.a(4, 128);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          if (rla.field_D.field_g) {
            var27 = rb.field_o;
            var19 = var27;
            var13 = var19;
            var11 = var13;
            var6 = var11;
            var1 = var6;
            var28 = rla.field_D.field_f;
            var3 = 0;
            L1: while (true) {
              if (-9 >= (var3 ^ -1)) {
                var29 = pq.field_e;
                var21 = var29;
                var14 = var21;
                var12 = var14;
                var8 = var12;
                var1 = var8;
                var30 = rla.field_D.field_f;
                var10 = 0;
                var3 = var10;
                L2: while (true) {
                  if (8 <= var10) {
                    rla.field_D = null;
                    return true;
                  } else {
                    var8[var10] = sea.c(var29[var10], var30[var10] ^ -1);
                    var10++;
                    continue L2;
                  }
                }
              } else {
                var6[var3] = fh.a(var27[var3], var28[var3]);
                var3++;
                continue L1;
              }
            }
          } else {
            return false;
          }
        } else {
          var5 = null;
          nma discarded$1 = lga.a((uia) null, (byte) 82);
          if (!rla.field_D.field_g) {
            return false;
          } else {
            var23 = rb.field_o;
            var15 = var23;
            var13 = var15;
            var11 = var13;
            var6 = var11;
            var1 = var6;
            var24 = rla.field_D.field_f;
            var3 = 0;
            L3: while (true) {
              if (-9 >= (var3 ^ -1)) {
                var25 = pq.field_e;
                var17 = var25;
                var14 = var17;
                var12 = var14;
                var8 = var12;
                var1 = var8;
                var26 = rla.field_D.field_f;
                var10 = 0;
                var3 = var10;
                L4: while (true) {
                  if (8 <= var10) {
                    rla.field_D = null;
                    return true;
                  } else {
                    var8[var10] = sea.c(var25[var10], var26[var10] ^ -1);
                    var10++;
                    continue L4;
                  }
                }
              } else {
                var6[var3] = fh.a(var23[var3], var24[var3]);
                var3++;
                continue L3;
              }
            }
          }
        }
    }

    static {
    }
}
