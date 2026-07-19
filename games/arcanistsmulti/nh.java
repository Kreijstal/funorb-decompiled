/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends nn {
    static String field_x;
    static kc field_z;
    static String field_B;
    static String field_y;
    private Object field_A;
    static String field_u;
    static hh field_w;
    static String field_v;

    nh(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            this.field_A = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("nh.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        bb.field_e = fd.field_g[param1];
        if (param0) {
            return;
        }
        try {
            vn.field_f = k.field_k[param1];
            ld.field_o = fn.field_c[param1];
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nh.J(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 96) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "nh.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void a(byte param0, int param1, int param2, boolean param3) {
        if (param0 != -66) {
            return;
        }
        try {
            vd.a(param1, 121, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nh.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final Object e(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 > 12) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            stackOut_3_0 = this.field_A;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "nh.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void h(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_v = null;
              field_u = null;
              field_y = null;
              field_w = null;
              field_z = null;
              if (param0 <= -97) {
                break L1;
              } else {
                nh.i((byte) 63);
                break L1;
              }
            }
            field_x = null;
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "nh.H(" + param0 + ')');
        }
    }

    final static void i(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var1 = null;
        ab var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        wa var6 = null;
        String var7 = null;
        wa var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var1_ref = df.field_z;
            var2 = var1_ref.e((byte) -107);
            if (0 != var2) {
              if (1 != var2) {
                if (2 == var2) {
                  L1: {
                    if ((jb.field_t ^ -1) == -2) {
                      jb.field_t = 2;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 == var2) {
                    L2: {
                      if (-3 == (jb.field_t ^ -1)) {
                        jb.field_t = 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((var2 ^ -1) != -5) {
                      L3: {
                        if (param0 >= 20) {
                          break L3;
                        } else {
                          field_u = (String) null;
                          break L3;
                        }
                      }
                      jh.a((Throwable) null, "F1: " + nn.g((byte) -25), (byte) 20);
                      ka.b(false);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      jb.field_t = 1;
                      var3 = var1_ref.l(-1);
                      ie.field_Nb = var3.intern();
                      var4 = var1_ref.e((byte) 110);
                      qo.a(2, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } else {
                L4: {
                  if (null != ie.field_Qb) {
                    break L4;
                  } else {
                    ie.field_Qb = new mo(128);
                    rc.field_m = 0;
                    break L4;
                  }
                }
                L5: {
                  var3 = var1_ref.l(-1);
                  if (!var3.equals("")) {
                    break L5;
                  } else {
                    var3 = null;
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1_ref.l(-1);
                  var5 = var1_ref.l(-1);
                  var6 = im.a(0, var4_ref_String);
                  if (var6 == null) {
                    var6 = im.a(0, var5);
                    if (var6 == null) {
                      break L6;
                    } else {
                      ie.field_Qb.a(var6, (long)gk.a((CharSequence) ((Object) var4_ref_String), -13).hashCode(), (byte) 119);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (null == var6) {
                    var6 = new wa();
                    ie.field_Qb.a(var6, (long)gk.a((CharSequence) ((Object) var4_ref_String), -13).hashCode(), (byte) 110);
                    fieldTemp$2 = rc.field_m;
                    rc.field_m = rc.field_m + 1;
                    var6.field_Bb = fieldTemp$2;
                    vd.field_d.b(var6, -1);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var6.field_Gb = var5;
                var6.field_Cb = var4_ref_String;
                var6.field_Lb = var3;
                var6.a(true);
                var7_ref = (wa) ((Object) vd.field_d.b(12623));
                L9: while (true) {
                  L10: {
                    if (null == var7_ref) {
                      break L10;
                    } else {
                      if (!qa.a(false, var6, var7_ref)) {
                        break L10;
                      } else {
                        var7_ref = (wa) ((Object) vd.field_d.a(0));
                        if (var9 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (var7_ref == null) {
                        break L12;
                      } else {
                        da.a(var7_ref, 20, var6);
                        if (var9 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    vd.field_d.b(var6, -1);
                    break L11;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              L13: {
                if (uc.field_c == null) {
                  uc.field_c = new mo(128);
                  pc.field_b = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if ((var1_ref.e((byte) -125) ^ -1) != -2) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L14;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L14;
                }
              }
              L15: {
                L16: {
                  var3_int = stackIn_12_0;
                  var4_ref_String = var1_ref.l(-1);
                  if (var3_int != 0) {
                    break L16;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                var5 = var1_ref.l(-1);
                break L15;
              }
              L17: {
                var6 = mf.a(-1, var4_ref_String);
                var7 = var1_ref.l(-1);
                var8 = gk.a((CharSequence) ((Object) var4_ref_String), -13);
                if (null != var8) {
                  break L17;
                } else {
                  var8 = var4_ref_String;
                  break L17;
                }
              }
              L18: {
                if (var6 != null) {
                  break L18;
                } else {
                  var6 = mf.a(-1, var7);
                  if (var6 == null) {
                    break L18;
                  } else {
                    uc.field_c.a(var6, (long)var8.hashCode(), (byte) 118);
                    break L18;
                  }
                }
              }
              L19: {
                if (null != var6) {
                  break L19;
                } else {
                  var6 = new wa();
                  uc.field_c.a(var6, (long)var8.hashCode(), (byte) 126);
                  fieldTemp$3 = pc.field_b;
                  pc.field_b = pc.field_b + 1;
                  var6.field_Bb = fieldTemp$3;
                  oo.field_B.b(var6, -1);
                  break L19;
                }
              }
              var6.field_Cb = var4_ref_String;
              var6.field_Gb = var7;
              var6.field_Ib = var5;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "nh.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    static {
        field_x = "Invite <%0> to this game";
        field_y = "Concluded";
        field_u = "Your ignore list is full. Max of 100 hit.";
        field_v = "Email is valid";
        field_B = "No";
    }
}
