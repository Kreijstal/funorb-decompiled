/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component delegate;
    static int field_c;

    DelegatingCanvas(java.awt.Component delegate) {
        try {
          this.delegate = delegate;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "od.<init>(" + (delegate != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics graphics) {
        try {
          this.delegate.paint(graphics);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "od.paint(" + (graphics != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int var2;
        regionExit1: {
          var2 = BrickABrac.field_J ? 1 : 0;
          if (13 != pp.field_a) {
            if (pp.field_a == 14) {
              if (0 < jl.field_a) {
                fieldTemp$0 = jl.field_a - 1;
                jl.field_a = jl.field_a - 1;
                if (0 == fieldTemp$0) {
                  SpriteGeometry.field_v = MembershipBenefitsScreen.field_x;
                  tb.field_eb = hq.field_y;
                  pp.field_a = -1;
                  jl.field_a = 250;
                  ga.field_i = 0;
                  c.field_i = un.field_e;
                }
              }
            } else {
              if (pp.field_a == 0) {
                if (0 < jl.field_a) {
                  fieldTemp$1 = jl.field_a - 1;
                  jl.field_a = jl.field_a - 1;
                  if (0 == fieldTemp$1) {
                    pp.field_a = -1;
                    ga.field_i = 1;
                    jl.field_a = 250;
                    c.field_i = un.field_e;
                    SpriteGeometry.field_v = MembershipBenefitsScreen.field_x;
                    tb.field_eb = va.field_d;
                  }
                }
              } else {
                if (pp.field_a != 1) {
                  if (2 == pp.field_a) {
                    if (0 < jl.field_a) {
                      fieldTemp$2 = jl.field_a - 1;
                      jl.field_a = jl.field_a - 1;
                      if (0 == fieldTemp$2) {
                        tb.field_eb = KeyboardInput.field_b;
                        pp.field_a = -1;
                        ga.field_i = 3;
                      }
                    }
                  } else {
                    if (pp.field_a != 3 &&
                      pp.field_a != 4 &&
                      pp.field_a != 5) {
                      if (pp.field_a == 6) {
                        pp.field_a = da.field_G;
                        ga.field_i = da.field_G;
                      } else {
                        if (pp.field_a != 8 &&
                          pp.field_a != 9) {
                          if (pp.field_a == 10) {
                            ga.field_i = da.field_G;
                            pp.field_a = da.field_G;
                          } else {
                            if (((pp.field_a != 11)) &&
                              (pp.field_a == 12)) {
                              break regionExit1;
                            }
                          }
                          break regionExit1;
                        }
                        if (jl.field_a > 0) {
                          fieldTemp$3 = jl.field_a - 1;
                          jl.field_a = jl.field_a - 1;
                          if (fieldTemp$3 == 0) {
                            ga.field_i = 11;
                            pp.field_a = -1;
                            tb.field_eb = bj.field_U;
                            wl.field_N = true;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (0 < jl.field_a) {
              fieldTemp$4 = jl.field_a - 1;
              jl.field_a = jl.field_a - 1;
              if (0 == fieldTemp$4) {
                SpriteGeometry.field_v = MembershipBenefitsScreen.field_x;
                pp.field_a = -1;
                c.field_i = un.field_e;
                tb.field_eb = sb.field_d;
                jl.field_a = 250;
                ga.field_i = 14;
              }
            }
          }
        }
        if (param0 != 32) {
          field_c = 109;
        }
    }

    public final void update(java.awt.Graphics graphics) {
        try {
          this.delegate.update(graphics);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "od.update(" + (graphics != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isLegacyInputCharacter(char character, int obfuscationGuard) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (0 < character &&
            character < 128) {
            return true;
          }
          if (character >= 160 &&
            character <= 255) {
            return true;
          }
          if (character != 0) {
            var6 = ai.cp1252Extensions;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != character) {
                var3++;
                continue;
              }
              return true;
            }
          }
          if (obfuscationGuard != -12) {
            field_c = -78;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2_ref), "od.D(" + character + ',' + obfuscationGuard + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          DelegatingCanvas.a((byte) 23);
        }
        field_b = null;
    }

    final static void a(int param0, long param1, StringBuilder param2) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          gh.field_e.setLength(0);
          if (param0 != -9) {
            field_c = -91;
          }
          stackIn_6_0 = (param1 >= 0L) ? 0 : 1;
          var4_int = stackIn_6_0;
          var5 = 0;
          do {
            discarded$4 = gh.field_e.append((char)(48 + (int)(param1 % 10L)));
            param1 = param1 / 10L;
            var5++;
          } while (0L != param1);
          if (var4_int != 0) {
            discarded$5 = gh.field_e.append('-');
          }
          for (var6 = var5 - 1; var6 >= 0; var6--) {
            discarded$6 = param2.append(gh.field_e.charAt(var6));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("od.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = "Shortcut Reference";
    }
}
