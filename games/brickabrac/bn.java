/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bn extends vi {
    int field_s;
    static String field_t;
    static jp field_p;
    int field_u;
    static mh field_q;
    static wq field_r;

    boolean a(no param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        L0: {
          var34 = BrickABrac.field_J ? 1 : 0;
          var3 = param0.field_u;
          var4 = var3 + param0.field_j;
          var5 = var3 + param0.field_m;
          var6 = -((bn) this).field_m + -(((bn) this).field_s >> 1712513089) + var5;
          if (-1 >= (var6 ^ -1)) {
            break L0;
          } else {
            var6 = -var6;
            break L0;
          }
        }
        if (var3 - -(((bn) this).field_s >> -2084793375) > var6) {
          L1: {
            var6 = -(((bn) this).field_u >> 4229409) - (((bn) this).field_j - var4);
            if (-1 >= (var6 ^ -1)) {
              break L1;
            } else {
              var6 = -var6;
              break L1;
            }
          }
          if (var6 >= (((bn) this).field_u >> 1822499265) + var3) {
            return false;
          } else {
            L2: {
              var7 = var4;
              var8 = var5;
              if (((bn) this).field_m <= var5) {
                if (((bn) this).field_s + ((bn) this).field_m >= var5) {
                  break L2;
                } else {
                  var8 = ((bn) this).field_m + ((bn) this).field_s;
                  break L2;
                }
              } else {
                var8 = ((bn) this).field_m;
                break L2;
              }
            }
            L3: {
              if (var4 < ((bn) this).field_j) {
                var7 = ((bn) this).field_j;
                break L3;
              } else {
                if (var4 <= ((bn) this).field_j + ((bn) this).field_u) {
                  break L3;
                } else {
                  var7 = ((bn) this).field_u + ((bn) this).field_j;
                  break L3;
                }
              }
            }
            var9 = (-var4 + var7) * (var7 + -var4) - -((var8 - var5) * (-var5 + var8));
            if (var9 <= var3 * var3) {
              L4: {
                var10 = 0;
                var11 = 0;
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = -((bn) this).field_o + param0.field_o;
                var19 = -var3 + ((bn) this).field_m - var5;
                var20 = var19 << -302670456;
                var21 = -var5 + (((bn) this).field_m - -var3) + ((bn) this).field_s;
                var22 = var21 << 1235057864;
                if (var18 == 0) {
                  break L4;
                } else {
                  var22 = var22 / var18;
                  var20 = var20 / var18;
                  break L4;
                }
              }
              L5: {
                var23 = -3 / ((param1 - -29) / 35);
                if (var20 < var22) {
                  var14 = var19;
                  var17 = 1;
                  var12 = var20;
                  break L5;
                } else {
                  var14 = var21;
                  var12 = var22;
                  var17 = 2;
                  break L5;
                }
              }
              L6: {
                var14 = var14 + var5;
                var24 = -((bn) this).field_k + param0.field_k;
                var25 = -var3 + ((bn) this).field_j - var4;
                var26 = var25 << -567660184;
                var27 = -var4 + (((bn) this).field_j + var3 - -((bn) this).field_u);
                var28 = var27 << -966662072;
                if (var24 == 0) {
                  break L6;
                } else {
                  var28 = var28 / var24;
                  var26 = var26 / var24;
                  break L6;
                }
              }
              L7: {
                if (var28 <= var26) {
                  var13 = var27;
                  var16 = 4;
                  var11 = var28;
                  break L7;
                } else {
                  var16 = 8;
                  var11 = var26;
                  var13 = var25;
                  break L7;
                }
              }
              L8: {
                L9: {
                  var13 = var13 + var4;
                  var29 = var4 + (var12 * var24 >> -1118643224);
                  var30 = (var18 * var11 >> 1248239432) + var5;
                  if (-1 == (var18 ^ -1)) {
                    break L9;
                  } else {
                    if (var29 < ((bn) this).field_j - var3) {
                      break L9;
                    } else {
                      if (var29 <= var3 + ((bn) this).field_u + ((bn) this).field_j) {
                        L10: {
                          if (var24 == 0) {
                            break L10;
                          } else {
                            if (-var3 + ((bn) this).field_m > var30) {
                              break L10;
                            } else {
                              if (var3 + ((bn) this).field_m - -((bn) this).field_s >= var30) {
                                if (var12 >= var11) {
                                  var10 = var11;
                                  var15 = var16;
                                  var14 = var5 + (var18 * var10 >> 162497096);
                                  break L8;
                                } else {
                                  var15 = var17;
                                  var10 = var12;
                                  var13 = (var24 * var10 >> -547518264) + var4;
                                  break L8;
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        var15 = var17;
                        var10 = var12;
                        var13 = var4 - -(var10 * var24 >> 2005670344);
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                var10 = var11;
                var15 = var16;
                var14 = (var10 * var18 >> -1711406104) + var5;
                break L8;
              }
              L11: {
                var31 = 0;
                var32 = 0;
                if (-9 == (var15 ^ -1)) {
                  var31 = 256;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (4 != var15) {
                  break L12;
                } else {
                  var31 = -256;
                  break L12;
                }
              }
              L13: {
                if (1 != var15) {
                  break L13;
                } else {
                  var32 = 256;
                  break L13;
                }
              }
              L14: {
                if (2 == var15) {
                  var32 = -256;
                  break L14;
                } else {
                  break L14;
                }
              }
              var33 = -(var32 * var18 + var31 * var24) >> -2057217048;
              if (-1 <= (var33 ^ -1)) {
                if (var10 > ea.field_b) {
                  return true;
                } else {
                  oh.field_f = var13 - param0.field_u;
                  ea.field_b = var10;
                  mn.field_A = var31;
                  ae.field_b = var32;
                  dj.field_c = (bn) this;
                  sh.field_a = var15;
                  mm.field_Tb = -param0.field_u + var14;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    bn(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3, param6);
        ((bn) this).field_s = param5;
        ((bn) this).field_u = param4;
    }

    final boolean a(no param0, boolean param1) {
        long var3 = 0L;
        long var5 = 0L;
        long var7 = 0L;
        long var9 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        long var15 = 0L;
        int var17 = 0;
        L0: {
          var17 = BrickABrac.field_J ? 1 : 0;
          var3 = (long)param0.field_u;
          var5 = (long)param0.field_j;
          var7 = (long)param0.field_m;
          var9 = (long)(-((bn) this).field_m - ((bn) this).field_s / 2) + var7;
          if (var9 < 0L) {
            var9 = -var9;
            break L0;
          } else {
            break L0;
          }
        }
        if (var9 < (long)(((bn) this).field_s / 2) + var3) {
          L1: {
            var9 = var5 + (long)(-((bn) this).field_j - ((bn) this).field_u / 2);
            if (-1L < (var9 ^ -1L)) {
              var9 = -var9;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!param1) {
              break L2;
            } else {
              bn.c(111);
              break L2;
            }
          }
          if (var3 + (long)(((bn) this).field_u / 2) <= var9) {
            return false;
          } else {
            L3: {
              var11 = var5;
              var13 = var7;
              if ((var5 ^ -1L) > ((long)((bn) this).field_j ^ -1L)) {
                var11 = (long)((bn) this).field_j;
                break L3;
              } else {
                if ((var5 ^ -1L) >= ((long)(((bn) this).field_j - -((bn) this).field_u) ^ -1L)) {
                  break L3;
                } else {
                  var11 = (long)(((bn) this).field_j - -((bn) this).field_u);
                  break L3;
                }
              }
            }
            L4: {
              if ((var7 ^ -1L) <= ((long)((bn) this).field_m ^ -1L)) {
                if ((var7 ^ -1L) < ((long)(((bn) this).field_s + ((bn) this).field_m) ^ -1L)) {
                  var13 = (long)(((bn) this).field_m + ((bn) this).field_s);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                var13 = (long)((bn) this).field_m;
                break L4;
              }
            }
            var15 = (var11 + -var5) * (var11 + -var5) + (-var7 + var13) * (var13 + -var7);
            if (var15 <= var3 * var3) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    void a(byte param0, j param1, no param2) {
        if (param0 != 53) {
            Object var5 = null;
            boolean discarded$0 = ((bn) this).a((no) null, (byte) 44);
        }
        param2.field_j = oh.field_f;
        param2.field_m = mm.field_Tb;
    }

    final static void c(int param0) {
        int var1 = 62 / ((25 - param0) / 57);
        if (ej.field_I != null) {
            ej.field_I.m(17);
        }
        pq.field_o = new qo();
        rj.field_c.b((byte) 110, (oc) (Object) pq.field_o);
    }

    int a(int param0, StringBuilder param1) {
        if (param0 < 79) {
            ((bn) this).field_s = 1;
        }
        return (33029 + ((bn) this).field_s * 37 << -1457884979) + (41 * ((bn) this).field_u - -29813 << -819356926) ^ super.a(80, param1);
    }

    public static void d(byte param0) {
        field_p = null;
        field_r = null;
        field_q = null;
        int var1 = 51 / ((-46 - param0) / 34);
        field_t = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Offer rematch";
    }
}
