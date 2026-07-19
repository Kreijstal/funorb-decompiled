/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tsa extends ksa {
    String field_d;
    int field_e;
    static int field_h;
    int field_g;
    ij field_f;

    public final String toString() {
        if (this.field_e != hpa.field_p) {
          if (fwa.field_h == this.field_e) {
            return "Number{" + this.field_d + "}";
          } else {
            if (io.field_p == this.field_e) {
              return "Boolean{" + this.field_d + "}";
            } else {
              if (this.field_e == ek.field_o) {
                return "Char{" + this.field_d + "}";
              } else {
                if (dla.field_d != this.field_e) {
                  if (this.field_e != wdb.field_vb) {
                    if (ua.field_o == this.field_e) {
                      return "ArgEnd";
                    } else {
                      if (jwa.field_l == this.field_e) {
                        return "ArgComma";
                      } else {
                        return "Unknown";
                      }
                    }
                  } else {
                    return "ArgStart";
                  }
                } else {
                  return "String{" + this.field_d + "}";
                }
              }
            }
          }
        } else {
          return "Method{" + this.field_d + "}";
        }
    }

    final nc a(byte param0, rqa[] param1) throws gva, ojb {
        int incrementValue$1 = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        tsa var5 = null;
        int var6 = 0;
        nc[] var7 = null;
        nc[] var8 = null;
        String var9 = null;
        nc stackIn_3_0 = null;
        nc stackIn_10_0 = null;
        nc stackIn_16_0 = null;
        nc stackIn_19_0 = null;
        nc stackIn_23_0 = null;
        nc stackIn_25_0 = null;
        nc stackIn_29_0 = null;
        nc stackIn_35_0 = null;
        nc stackIn_39_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        nc stackOut_9_0 = null;
        nc stackOut_15_0 = null;
        nc stackOut_22_0 = null;
        nc stackOut_24_0 = null;
        nc stackOut_18_0 = null;
        nc stackOut_28_0 = null;
        nc stackOut_38_0 = null;
        nc stackOut_34_0 = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 > 60) {
              try {
                L1: {
                  if (this.field_e == hpa.field_p) {
                    var7 = new nc[this.field_f.c(3)];
                    var8 = var7;
                    var4 = 0;
                    var5 = (tsa) ((Object) this.field_f.d(0));
                    L2: while (true) {
                      if (var5 == null) {
                        stackOut_9_0 = fjb.a(this.field_d, var8, param1, (byte) -124);
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        incrementValue$1 = var4;
                        var4++;
                        var7[incrementValue$1] = var5.a((byte) 96, param1);
                        var5 = (tsa) ((Object) this.field_f.a((byte) 69));
                        continue L2;
                      }
                    }
                  } else {
                    if (this.field_e == fwa.field_h) {
                      var3_int = Character.toLowerCase(this.field_d.charAt(this.field_d.length() + -1));
                      if (var3_int == 102) {
                        stackOut_15_0 = new nc(Float.valueOf(this.field_d).floatValue());
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        if (var3_int != 108) {
                          if (-1 != this.field_d.indexOf('.')) {
                            stackOut_22_0 = new nc(Double.valueOf(this.field_d).doubleValue());
                            stackIn_23_0 = stackOut_22_0;
                            decompiledRegionSelector0 = 3;
                            break L1;
                          } else {
                            stackOut_24_0 = new nc(Integer.parseInt(this.field_d));
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 4;
                            break L1;
                          }
                        } else {
                          stackOut_18_0 = new nc(Long.parseLong(this.field_d.substring(0, -1 + this.field_d.length())));
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 2;
                          break L1;
                        }
                      }
                    } else {
                      if (io.field_p == this.field_e) {
                        stackOut_28_0 = new nc(this.field_d.equals("true"));
                        stackIn_29_0 = stackOut_28_0;
                        decompiledRegionSelector0 = 5;
                        break L1;
                      } else {
                        if (this.field_e != ek.field_o) {
                          if (dla.field_d == this.field_e) {
                            stackOut_38_0 = new nc(this.field_d.substring(1, this.field_d.length() - 1));
                            stackIn_39_0 = stackOut_38_0;
                            decompiledRegionSelector0 = 8;
                            break L1;
                          } else {
                            decompiledRegionSelector0 = 7;
                            break L1;
                          }
                        } else {
                          var9 = this.field_d.substring(1, this.field_d.length() + -1);
                          if (var9.length() != 1) {
                            throw new gva("Invalid char value: " + var9);
                          } else {
                            stackOut_34_0 = new nc(var9.charAt(0));
                            stackIn_35_0 = stackOut_34_0;
                            decompiledRegionSelector0 = 6;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (NumberFormatException) (Object) decompiledCaughtException;
                throw new gva("NumberFormatException on: " + this.field_d);
              }
              if (decompiledRegionSelector0 == 0) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      decompiledRegionSelector1 = 4;
                      break L0;
                    } else {
                      if (decompiledRegionSelector0 == 4) {
                        decompiledRegionSelector1 = 5;
                        break L0;
                      } else {
                        if (decompiledRegionSelector0 == 5) {
                          decompiledRegionSelector1 = 6;
                          break L0;
                        } else {
                          if (decompiledRegionSelector0 == 6) {
                            decompiledRegionSelector1 = 7;
                            break L0;
                          } else {
                            if (decompiledRegionSelector0 == 7) {
                              throw new IllegalArgumentException();
                            } else {
                              decompiledRegionSelector1 = 8;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = (nc) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var3_ref);
            stackOut_43_1 = new StringBuilder().append("tsa.A(").append(param0).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L3;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector1 == 4) {
                  return stackIn_23_0;
                } else {
                  if (decompiledRegionSelector1 == 5) {
                    return stackIn_25_0;
                  } else {
                    if (decompiledRegionSelector1 == 6) {
                      return stackIn_29_0;
                    } else {
                      if (decompiledRegionSelector1 == 7) {
                        return stackIn_35_0;
                      } else {
                        return stackIn_39_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    tsa(int param0, int param1, String param2) {
        try {
            this.field_d = param2;
            this.field_e = param0;
            this.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tsa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    tsa(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    static {
        field_h = -1;
    }
}
