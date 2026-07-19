/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends cj {
    cj field_Hb;
    static String field_Kb;
    tq field_Jb;
    cj field_Gb;
    static String field_Lb;
    static String field_Fb;
    static String field_Mb;
    cj field_Ib;

    cd(long param0, cd param1, String param2, String param3) {
        this(param0, param1, param1.field_Jb.field_Jb, param1.field_Jb.field_Ib, param1.field_Gb, param2, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_z = param2;
        if (param0 != 0) {
          field_Mb = (String) null;
          this.field_x = param5;
          this.field_Q = param6;
          this.field_zb = param3;
          this.a(param4, (byte) -67, param1, param7);
          return;
        } else {
          this.field_x = param5;
          this.field_Q = param6;
          this.field_zb = param3;
          this.a(param4, (byte) -67, param1, param7);
          return;
        }
    }

    cd(long param0, cj param1, cj param2, hi param3, cj param4, String param5, String param6) {
        super(param0, param1);
        try {
            this.field_Ib = new cj(0L, (cj) null);
            this.field_Jb = new tq(0L, this.field_Ib, param2, param3);
            this.field_Gb = new cj(0L, param4);
            this.field_Hb = new cj(0L, param4);
            this.field_Gb.field_wb = param5;
            this.field_Hb.field_wb = param6;
            this.a((byte) 50, this.field_Jb);
            this.a((byte) 50, this.field_Gb);
            this.a((byte) 50, this.field_Hb);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "cd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = (this.field_zb + param0) / 2;
        int var6 = -param3 + this.field_z;
        this.field_Jb.a(param2, param0, this.field_zb, 0, -param0 + var6, -31465, 0);
        this.field_Gb.field_z = param3;
        int var7 = 42 % ((param1 - -27) / 39);
        this.field_Gb.field_zb = -param0 + var5;
        this.field_Gb.field_Q = var6;
        this.field_Gb.field_x = 0;
        this.field_Hb.field_Q = var6;
        this.field_Hb.field_x = var5;
        this.field_Hb.field_zb = -var5 + this.field_zb;
        this.field_Hb.field_z = param3;
    }

    final static void c(byte param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        ja var6 = null;
        ja var7 = null;
        Object stackIn_25_0 = null;
        Object stackIn_34_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_24_0 = null;
        Object stackOut_33_0 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            oo.a(243, 197, 369, 143, 16777215);
            oo.e(244, 198, 367, 141, 0);
            if (param0 <= -20) {
              if (ld.field_Ub == null) {
                L1: {
                  if (null != gf.field_e) {
                    discarded$3 = gf.field_e.a(hj.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  L3: {
                    var5 = ld.field_Ub[gf.field_g];
                    if (var5 == null) {
                      break L3;
                    } else {
                      var5.g(245, 199);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (null == gf.field_e) {
                    break L2;
                  } else {
                    discarded$4 = gf.field_e.a(hj.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L2;
                  }
                }
                L4: {
                  if (nf.field_a <= lb.field_a) {
                    break L4;
                  } else {
                    var6 = ld.field_Ub[gf.field_j];
                    if (var6 == null) {
                      break L4;
                    } else {
                      L5: {
                        var2_int = lb.field_a * (var6.field_z + 60) / nf.field_a;
                        var3 = var2_int + -30;
                        if (qh.field_a) {
                          break L5;
                        } else {
                          cb.a(199, false, 256 * (var6.field_z + -var3) / 30, 245, var6, -256 * var3 / 30);
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      cb.a(199, false, var3 * -256 / 30, 245, var6, 256 * (-var3 + var6.field_z) / 30);
                      break L4;
                    }
                  }
                }
                if (gf.field_e != null) {
                  var2 = null;
                  var3 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var3 >= ld.field_Ub.length) {
                          break L8;
                        } else {
                          var7 = ld.field_Ub[var3];
                          stackOut_24_0 = null;
                          stackIn_34_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (var4 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_25_0 == var7) {
                                break L9;
                              } else {
                                L10: {
                                  if (var7.field_z != 365) {
                                    break L10;
                                  } else {
                                    if (139 != var7.field_u) {
                                      break L10;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L11: {
                                  if (var2 != null) {
                                    break L11;
                                  } else {
                                    var2 = Integer.toString(var3);
                                    if (var4 == 0) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var2 = (String) (var2) + ", " + var3;
                                break L9;
                              }
                            }
                            var3++;
                            if (var4 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackOut_33_0 = null;
                      stackIn_34_0 = stackOut_33_0;
                      break L7;
                    }
                    if (stackIn_34_0 != var2) {
                      discarded$5 = gf.field_e.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "cd.AA(" + param0 + ')');
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

    public static void d(boolean param0) {
        field_Mb = null;
        field_Fb = null;
        field_Lb = null;
        field_Kb = null;
        if (param0) {
            field_Lb = (String) null;
        }
    }

    static {
        field_Kb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_Lb = "Fullscreen";
        field_Fb = "Sound: ";
        field_Mb = "Curse";
    }
}
