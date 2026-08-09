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
        int incrementValue$0 = 0;
        nc stackIn_3_0 = null;
        nc stackIn_10_0 = null;
        nc stackIn_16_0 = null;
        nc stackIn_19_0 = null;
        nc stackIn_23_0 = null;
        nc stackIn_25_0 = null;
        nc stackIn_29_0 = null;
        nc stackIn_35_0 = null;
        nc stackIn_39_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        tsa var5 = null;
        int var6 = 0;
        nc[] var7 = null;
        nc[] var8 = null;
        String var9 = null;
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
                        stackIn_10_0 = fjb.a(this.field_d, var8, param1, (byte) -124);
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        incrementValue$0 = var4;
                        var4++;
                        var7[incrementValue$0] = var5.a((byte) 96, param1);
                        var5 = (tsa) ((Object) this.field_f.a((byte) 69));
                        continue L2;
                      }
                    }
                  } else {
                    if (this.field_e == fwa.field_h) {
                      var3_int = Character.toLowerCase(this.field_d.charAt(this.field_d.length() + -1));
                      if (var3_int == 102) {
                        stackIn_16_0 = new nc(Float.valueOf(this.field_d).floatValue());
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        if (var3_int != 108) {
                          if (-1 != this.field_d.indexOf('.')) {
                            stackIn_23_0 = new nc(Double.valueOf(this.field_d).doubleValue());
                            decompiledRegionSelector0 = 3;
                            break L1;
                          } else {
                            stackIn_25_0 = new nc(Integer.parseInt(this.field_d));
                            decompiledRegionSelector0 = 4;
                            break L1;
                          }
                        } else {
                          stackIn_19_0 = new nc(Long.parseLong(this.field_d.substring(0, -1 + this.field_d.length())));
                          decompiledRegionSelector0 = 2;
                          break L1;
                        }
                      }
                    } else {
                      if (io.field_p == this.field_e) {
                        stackIn_29_0 = new nc(this.field_d.equals("true"));
                        decompiledRegionSelector0 = 5;
                        break L1;
                      } else {
                        if (this.field_e != ek.field_o) {
                          if (dla.field_d == this.field_e) {
                            stackIn_39_0 = new nc(this.field_d.substring(1, this.field_d.length() - 1));
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
                            stackIn_35_0 = new nc(var9.charAt(0));
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
              stackIn_3_0 = (nc) null;
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var3_ref);

            stackIn_45_1 = new StringBuilder().append("tsa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L3;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
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
