/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends vg {
    vna field_i;
    static String field_n;
    static int[] field_l;
    static int field_k;
    String field_m;
    static int field_g;
    int field_h;
    static boolean field_o;
    int field_p;
    static String field_j;
    static int field_f;

    final static void a(int param0) {
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        apa stackIn_17_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        apa var9 = null;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = aqa.field_d + -wt.field_a;
            wt.field_a = -(var1_int >> -2125569119) + gda.field_a;
            aqa.field_d = wt.field_a - -var1_int;
            wp.field_b = -(aa.field_c >> -1502177279) + qi.field_N;
            var2 = wp.field_b;
            if (param0 > 79) {
              var3 = 0;
              L1: while (true) {
                if (cna.field_b.length <= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var4 = f.field_c[var3];
                    if ((var4 ^ -1) > -1) {
                      var5 = cka.field_H;
                      break L2;
                    } else {
                      if (lp.field_h.field_h == var4) {
                        var5 = fv.field_a;
                        break L2;
                      } else {
                        var5 = sua.field_I;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var6 = cna.field_b[var3];
                    stackIn_12_0 = -50;

                    if (var4 < 0) {
                      stackIn_13_0 = stackIn_12_0;
                      stackIn_13_1 = 0;
                      break L3;
                    } else {
                      stackIn_13_0 = stackIn_12_0;
                      stackIn_13_1 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var7 = apa.a((byte) stackIn_13_0, stackIn_13_1 != 0, var6);
                    var8 = -(var7 >> 1547607329) + gda.field_a;
                    if ((var4 ^ -1) > -1) {
                      break L4;
                    } else {
                      L5: {
                        if (lp.field_h.field_h == var4) {
                          stackIn_17_0 = pua.field_c;
                          break L5;
                        } else {
                          stackIn_17_0 = wua.field_o;
                          break L5;
                        }
                      }
                      L6: {
                        var9 = stackIn_17_0;
                        var2 = var2 + aqa.field_a;
                        if (var9 != null) {
                          var9.a((byte) 57, (vra.field_a << 555621633) + var7, var2, var8 + -vra.field_a, am.field_n + (vf.field_d << -466273471));
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var2 = var2 + vf.field_d;
                      break L4;
                    }
                  }
                  L7: {
                    if (0 > var4) {
                      kl.field_b.c(var6, var8, sb.field_d + var2, var5, -1);
                      var2 = var2 + uda.field_x;
                      break L7;
                    } else {
                      bta.field_d.c(var6, var8, var2 + vo.field_f, var5, -1);
                      var2 = var2 + (aqa.field_a + vf.field_d - -am.field_n);
                      break L7;
                    }
                  }
                  var3++;
                  continue L1;
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
          throw tba.a((Throwable) ((Object) var1), "mi.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final String toString() {
        if (!(tr.field_f != this.field_p)) {
            return "Method{" + this.field_m + "}";
        }
        if (!(this.field_p != dc.field_o)) {
            return "Number{" + this.field_m + "}";
        }
        if (!(dja.field_r != this.field_p)) {
            return "Boolean{" + this.field_m + "}";
        }
        if (!(nl.field_d != this.field_p)) {
            return "Char{" + this.field_m + "}";
        }
        if (ma.field_e == this.field_p) {
            return "String{" + this.field_m + "}";
        }
        if (lna.field_a == this.field_p) {
            return "ArgStart";
        }
        if (!(rs.field_a != this.field_p)) {
            return "ArgEnd";
        }
        if (!(this.field_p != qba.field_c)) {
            return "ArgComma";
        }
        return "Unknown";
    }

    mi(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    public static void a(byte param0) {
        if (param0 != 101) {
          mi.a((byte) -114);
          field_l = null;
          field_n = null;
          field_j = null;
          return;
        } else {
          field_l = null;
          field_n = null;
          field_j = null;
          return;
        }
    }

    mi(int param0, int param1, String param2) {
        try {
            this.field_p = param0;
            this.field_m = param2;
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mi.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final bfa a(int param0, ela[] param1) throws rv, jj {
        int incrementValue$0 = 0;
        bfa stackIn_9_0 = null;
        bfa stackIn_13_0 = null;
        bfa stackIn_17_0 = null;
        bfa stackIn_20_0 = null;
        bfa stackIn_22_0 = null;
        bfa stackIn_26_0 = null;
        bfa stackIn_33_0 = null;
        bfa stackIn_37_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        mi var5 = null;
        int var6 = 0;
        bfa[] var7 = null;
        bfa[] var8 = null;
        String var9 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.field_m = (String) null;
                break L1;
              }
            }
            try {
              L2: {
                if (tr.field_f == this.field_p) {
                  var7 = new bfa[this.field_i.a((byte) -16)];
                  var8 = var7;
                  var4 = 0;
                  var5 = (mi) ((Object) this.field_i.f(-80));
                  L3: while (true) {
                    if (var5 == null) {
                      stackIn_9_0 = pc.a(param1, 19, this.field_m, var8);
                      decompiledRegionSelector0 = 0;
                      break L2;
                    } else {
                      incrementValue$0 = var4;
                      var4++;
                      var7[incrementValue$0] = var5.a(-1, param1);
                      var5 = (mi) ((Object) this.field_i.e(114));
                      continue L3;
                    }
                  }
                } else {
                  if (dc.field_o != this.field_p) {
                    if (dja.field_r == this.field_p) {
                      stackIn_26_0 = new bfa(this.field_m.equals("true"));
                      decompiledRegionSelector0 = 5;
                      break L2;
                    } else {
                      if (this.field_p == nl.field_d) {
                        var9 = this.field_m.substring(1, this.field_m.length() + -1);
                        if (-2 != (var9.length() ^ -1)) {
                          throw new rv("Invalid char value: " + var9);
                        } else {
                          stackIn_33_0 = new bfa(var9.charAt(0));
                          decompiledRegionSelector0 = 6;
                          break L2;
                        }
                      } else {
                        if (ma.field_e == this.field_p) {
                          stackIn_37_0 = new bfa(this.field_m.substring(1, -1 + this.field_m.length()));
                          decompiledRegionSelector0 = 8;
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 7;
                          break L2;
                        }
                      }
                    }
                  } else {
                    var3_int = Character.toLowerCase(this.field_m.charAt(this.field_m.length() - 1));
                    if (var3_int != 102) {
                      if (var3_int == 108) {
                        stackIn_17_0 = new bfa(Long.parseLong(this.field_m.substring(0, this.field_m.length() + -1)));
                        decompiledRegionSelector0 = 2;
                        break L2;
                      } else {
                        if ((this.field_m.indexOf('.') ^ -1) == 0) {
                          stackIn_22_0 = new bfa(Integer.parseInt(this.field_m));
                          decompiledRegionSelector0 = 4;
                          break L2;
                        } else {
                          stackIn_20_0 = new bfa(Double.valueOf(this.field_m).doubleValue());
                          decompiledRegionSelector0 = 3;
                          break L2;
                        }
                      }
                    } else {
                      stackIn_13_0 = new bfa(Float.valueOf(this.field_m).floatValue());
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                }
              }
            } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (NumberFormatException) (Object) decompiledCaughtException;
              throw new rv("NumberFormatException on: " + this.field_m);
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      decompiledRegionSelector1 = 4;
                      break L0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        decompiledRegionSelector1 = 5;
                        break L0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          decompiledRegionSelector1 = 6;
                          break L0;
                        } else {
                          if (decompiledRegionSelector0 == 7) {
                            throw new IllegalArgumentException();
                          } else {
                            decompiledRegionSelector1 = 7;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var3_ref);

            stackIn_43_1 = new StringBuilder().append("mi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L4;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_13_0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector1 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector1 == 5) {
                    return stackIn_26_0;
                  } else {
                    if (decompiledRegionSelector1 == 6) {
                      return stackIn_33_0;
                    } else {
                      return stackIn_37_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_l = new int[]{15, 35, 12, 7, 18, 33};
        field_n = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_k = 33;
        field_j = "Players";
        field_o = false;
        field_f = -1;
    }
}
