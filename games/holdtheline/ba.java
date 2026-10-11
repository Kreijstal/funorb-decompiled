/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static kb field_b;
    static int[] field_a;

    final static void a(String param0, int param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        try {
          if (param1 == ~ak.field_c &&
            jf.field_b == -1) {
            jf.field_b = rf.field_X;
            ak.field_c = nc.field_g;
          }
          boolean decompiledFrameRemainder0 = true;
          dm.field_a = dm.field_a + 1;
          if (param0 == null) {
            decompiledFrameRemainder0 = (null == n.field_s);
          } else {
            decompiledFrameRemainder0 = !(param0.equals(n.field_s));
          }
          if (decompiledFrameRemainder0) {
            if (!sk.field_h) {
              if (dm.field_a >= g.field_h) {
                stackIn_16_0 = (we.field_l + g.field_h > dm.field_a) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param0 == null) {
              dm.field_a = 0;
            } else {
              if (sk.field_h) {
                dm.field_a = g.field_h;
              } else {
                if (var2_int == 0) {
                  dm.field_a = 0;
                } else {
                  dm.field_a = g.field_h;
                }
              }
            }
            ac.field_e = ak.field_c;
            if (param0 == null) {
              if (var2_int != 0) {
                sk.field_h = true;
              }
            } else {
              sk.field_h = false;
            }
            em.field_l = jf.field_b;
          }
          if (!sk.field_h &&
            g.field_h > dm.field_a &&
            na.field_k) {
            ac.field_e = ak.field_c;
            dm.field_a = 0;
            em.field_l = jf.field_b;
          }
          n.field_s = param0;
          jf.field_b = -1;
          ak.field_c = -1;
          if (sk.field_h) {
            if (rb.field_m != dm.field_a) {
              return;
            }
            dm.field_a = 0;
            sk.field_h = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("ba.D(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(lb param0, int param1, gj param2) {
        int stackIn_2_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        wb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        wb var11 = null;
        try {
          var11 = new wb(param0.field_r, param0.field_s);
          var4 = new wb(param0.field_r, param2.field_t);
          var5 = var11.a(-105, var4);
          var6 = var11.a(false, var4);
          var7 = var11.a(51);
          var8 = (float)param2.field_u * (float)var7 * (float)param2.field_u - (float)var6 * (float)var6;
          if (var8 < (float)param1) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = 0;
          var10 = (float)Math.sqrt((double)var8);
          mm.field_d = ((float)var5 + var10) / (float)var7;
          if (mm.field_d >= 0.0f &&
            1.0f >= mm.field_d) {
            lk.field_b = ha.a(param2.field_t, param0.a(false, mm.field_d), false);
            if (param2.a(lk.field_b, 13012)) {
              var9++;
            }
          }
          if (var10 > 0.0f) {
            rb.field_g = ((float)var5 - var10) / (float)var7;
            if (rb.field_g >= 0.0f &&
              rb.field_g <= 1.0f) {
              cj.field_G = ha.a(param2.field_t, param0.a(false, rb.field_g), false);
              if (param2.a(cj.field_G, 13012)) {
                var9++;
              }
              if (var9 == 1) {
                lk.field_b = cj.field_G;
                mm.field_d = rb.field_g;
              }
            }
          }
          stackIn_18_0 = var9;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ba.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 12031) {
          field_b = (kb) null;
        }
    }

    final static char a(boolean param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = HoldTheLine.field_D;
        if (param0) {
          var2 = param1;
          if (32 == var2) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (var2 == 95) {
            return '_';
          }
          if (var2 == 45) {
            return '_';
          }
          if (var2 == 91) {
            return param1;
          }
          if (93 != var2 &&
            var2 != 35) {
            if (var2 != 224 &&
              var2 != 225 &&
              var2 != 226 &&
              228 != var2 &&
              var2 != 227 &&
              var2 != 192 &&
              var2 != 193 &&
              var2 != 194 &&
              var2 != 196 &&
              var2 != 195) {
              if (232 != var2 &&
                233 != var2 &&
                var2 != 234 &&
                var2 != 235 &&
                200 != var2 &&
                var2 != 201 &&
                202 != var2 &&
                var2 != 203) {
                if (var2 != 237 &&
                  238 != var2 &&
                  239 != var2 &&
                  var2 != 205 &&
                  206 != var2 &&
                  var2 != 207) {
                  if (242 != var2 &&
                    var2 != 243 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    var2 != 245 &&
                    var2 != 210 &&
                    var2 != 211 &&
                    212 != var2 &&
                    var2 != 214 &&
                    var2 != 213) {
                    if (var2 != 249) {
                      if (var2 == 250) {
                        return 'u';
                      }
                      if (var2 != 251) {
                        if (var2 == 252) {
                          return 'u';
                        }
                        if (var2 == 217) {
                          return 'u';
                        }
                        if (var2 == 218) {
                          return 'u';
                        }
                        if (var2 != 219) {
                          if (var2 == 220) {
                            return 'u';
                          }
                          if (var2 != 231 &&
                            var2 != 199) {
                            if (255 != var2 &&
                              var2 != 376) {
                              if (var2 == 241) {
                                return 'n';
                              }
                              if (var2 == 209) {
                                return 'n';
                              }
                              if (var2 != 223) {
                                return Character.toLowerCase(param1);
                              }
                              return 'b';
                            }
                            return 'y';
                          }
                          return 'c';
                        }
                      }
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return param1;
        }
        field_b = (kb) null;
        var2Lifetime1 = param1;
        if (32 == var2Lifetime1) {
          return '_';
        }
        if (var2Lifetime1 != 160 &&
          var2Lifetime1 != 95 &&
          var2Lifetime1 != 45) {
          if (var2Lifetime1 != 91 &&
            93 != var2Lifetime1 &&
            var2Lifetime1 != 35) {
            if (var2Lifetime1 != 224 &&
              var2Lifetime1 != 225 &&
              var2Lifetime1 != 226 &&
              228 != var2Lifetime1 &&
              var2Lifetime1 != 227 &&
              var2Lifetime1 != 192 &&
              var2Lifetime1 != 193 &&
              var2Lifetime1 != 194 &&
              var2Lifetime1 != 196 &&
              var2Lifetime1 != 195) {
              if (232 != var2Lifetime1) {
                if (233 == var2Lifetime1) {
                  return 'e';
                }
                if (var2Lifetime1 != 234 &&
                  var2Lifetime1 != 235 &&
                  200 != var2Lifetime1) {
                  if (var2Lifetime1 == 201) {
                    return 'e';
                  }
                  if (202 != var2Lifetime1) {
                    if (var2Lifetime1 == 203) {
                      return 'e';
                    }
                    if (var2Lifetime1 != 237) {
                      if (238 == var2Lifetime1) {
                        return 'i';
                      }
                      if (239 == var2Lifetime1) {
                        return 'i';
                      }
                      if (var2Lifetime1 != 205) {
                        if (206 == var2Lifetime1) {
                          return 'i';
                        }
                        if (var2Lifetime1 == 207) {
                          return 'i';
                        }
                        if (242 != var2Lifetime1) {
                          if (var2Lifetime1 == 243) {
                            return 'o';
                          }
                          if (var2Lifetime1 == 244) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 246 &&
                            var2Lifetime1 != 245) {
                            if (var2Lifetime1 == 210) {
                              return 'o';
                            }
                            if (var2Lifetime1 != 211) {
                              if (212 == var2Lifetime1) {
                                return 'o';
                              }
                              if (var2Lifetime1 == 214) {
                                return 'o';
                              }
                              if (var2Lifetime1 != 213) {
                                if (var2Lifetime1 != 249) {
                                  if (var2Lifetime1 == 250) {
                                    return 'u';
                                  }
                                  if (var2Lifetime1 != 251) {
                                    if (var2Lifetime1 == 252) {
                                      return 'u';
                                    }
                                    if (var2Lifetime1 == 217) {
                                      return 'u';
                                    }
                                    if (var2Lifetime1 == 218) {
                                      return 'u';
                                    }
                                    if (var2Lifetime1 != 219) {
                                      if (var2Lifetime1 == 220) {
                                        return 'u';
                                      }
                                      if (var2Lifetime1 != 231 &&
                                        var2Lifetime1 != 199) {
                                        if (255 != var2Lifetime1 &&
                                          var2Lifetime1 != 376) {
                                          if (var2Lifetime1 == 241) {
                                            return 'n';
                                          }
                                          if (var2Lifetime1 == 209) {
                                            return 'n';
                                          }
                                          if (var2Lifetime1 != 223) {
                                            return Character.toLowerCase(param1);
                                          }
                                          return 'b';
                                        }
                                        return 'y';
                                      }
                                      return 'c';
                                    }
                                  }
                                }
                                return 'u';
                              }
                            }
                          }
                        }
                        return 'o';
                      }
                    }
                    return 'i';
                  }
                }
              }
              return 'e';
            }
            return 'a';
          }
          return param1;
        }
        return '_';
    }

    final static void a(int param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (ib.field_s.startsWith("win") &&
              hn.a(false, param1)) {
              return;
            }
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
              if (param0 != -7235) {
                field_a = (int[]) null;
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              bl.a((Throwable) null, (byte) 79, "MGR1: " + param1);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var4_ref;
            stackIn_11_1 = new StringBuilder().append("ba.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new kb(0);
        field_a = new int[8192];
    }
}
