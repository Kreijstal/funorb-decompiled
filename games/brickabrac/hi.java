/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends um {
    private int field_z;
    static NodeDeque rasterStack;
    static int[] field_A;
    private int field_y;
    private int field_x;
    static IsaacGenerator field_w;
    private RgbSprite[] field_B;

    final static boolean a(boolean param0, int param1, int param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        boolean stackIn_41_0 = false;
        boolean stackIn_103_0 = false;
        boolean stackIn_160_0 = false;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        Object var21;
        Object var22;
        Object var23;
        CharSequence var24;
        CharSequence var25;
        CharSequence var26;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var5Lifetime4;
        int var5Lifetime1Lifetime1;
        String var4_ref_StringLifetime1;
        String var4_ref_StringLifetime2;
        String var7Lifetime1;
        String var7Lifetime2;
        String var7Lifetime3;
        String var7Lifetime4;
        String var7Lifetime5;
        String var7Lifetime6;
        String var7Lifetime7;
        String var7Lifetime8;
        String var7Lifetime9;
        String var8Lifetime1;
        String var8Lifetime2;
        String var12Lifetime1;
        String var12Lifetime2;
        String var13Lifetime1;
        String var13Lifetime2;
        String var14Lifetime1;
        String var14Lifetime2;
        String var15Lifetime1;
        String var15Lifetime2;
        String var17Lifetime1;
        String var17Lifetime2;
        String var18Lifetime1;
        String var18Lifetime2;
        String var19Lifetime1;
        String var19Lifetime2;
        String var20Lifetime1;
        String var20Lifetime2;
        String var7Lifetime10;
        String var7Lifetime11;
        String var7Lifetime12;
        String var7Lifetime13;
        String var7Lifetime14;
        String var7Lifetime15;
        String var7Lifetime1Lifetime1;
        String var7Lifetime1Lifetime2;
        String var7Lifetime1Lifetime3;
        String var7Lifetime1Lifetime4;
        String var7Lifetime1Lifetime5;
        String var7Lifetime1Lifetime6;
        String var7Lifetime2Lifetime1;
        String var20Lifetime2Lifetime1;
        String var20Lifetime2Lifetime2;
        String var20Lifetime2Lifetime3;
        String var20Lifetime2Lifetime4;
        var21 = null;
        var22 = null;
        var23 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        var3 = 1;
        if (!nd.field_b &&
          null == wp.field_k) {
          var3 = 0;
        }
        if (param0) {
          rasterStack = (NodeDeque) null;
          if (ng.field_b == 0 &&
            null != nl.field_f) {
            var3 = 0;
          }
          if (ng.field_b == 2 &&
            !ve.b(-21835160)) {
            var3 = 0;
          }
          if (dc.currentKeyCode == 84) {
            if (var3 == 0) {
              if (ng.field_b != 0) {
                fl.b(!param0);
              }
            } else {
              if (OptionsScreen.field_A.length() > 0) {
                var4_ref_String = OptionsScreen.field_A.toString();
                if (mm.a(var4_ref_String, (byte) -128)) {
                  var13 = (String) null;
                  var12 = (String) null;
                  wp.a((byte) 92, 0, (String) null, ck.field_j, (String) null, 2);
                  var15 = (String) null;
                  var14 = (String) null;
                  wp.a((byte) 92, 0, (String) null, w.field_m, (String) null, 2);
                } else {
                  var5 = ng.field_b;
                  if (var5 == 0 &&
                    null != o.field_e) {
                    var5 = 1;
                  }
                  if (tm.a(var5, (byte) 18) == 2) {
                    DirectByteStorage.a(0, param2, 1, var5);
                  }
                  c.a(-1, DualLinkNode.field_p, (byte) -106, ng.field_b, param1, var4_ref_String);
                }
              }
              fl.b(true);
            }
            return true;
          }
          if (85 == dc.currentKeyCode) {
            if (var3 != 0 &&
              OptionsScreen.field_A.length() > 0) {
              MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          var4 = go.currentKeyCharacter;
          stackIn_41_0 = !param0;
          if (!RasterSnapshot.a(stackIn_41_0, (char) var4)) {
            return false;
          }
          if (var3 == 0) {
            return true;
          }
          if (OptionsScreen.field_A.length() >= 80) {
            return true;
          }
          discarded$2 = OptionsScreen.field_A.append((char) var4);
          var5Lifetime4 = 485;
          var17 = tb.field_cb;
          var7 = var17;
          var7Lifetime10 = var17;
          var16 = r.a((byte) 104, var17);
          var7Lifetime11 = var16;
          var7Lifetime12 = var16;
          var19 = var16;
          var7Lifetime13 = var19;
          var7Lifetime14 = var19;
          if (ng.field_b != 2) {
            var7Lifetime15 = "";
            if (ng.field_b == 0) {
              if (o.field_e == null &&
                th.field_d) {
                var7Lifetime15 = "[" + fi.field_u + "] ";
              }
              if (null != o.field_e) {
                if (PowerUp.field_v &&
                  null != jd.field_b) {
                  var7Lifetime15 = "[" + jd.field_b + "] ";
                } else {
                  var7Lifetime15 = "[" + rd.a(fm.field_a, new String[]{o.field_e.field_Fc}, (byte) 103) + "] ";
                }
              }
            }
            var20 = var7Lifetime15 + var19 + ": ";
            var5Lifetime4 = var5Lifetime4 - jq.field_y.measureText(var20);
          } else {
            var24 = (CharSequence) ((Object) DualLinkNode.field_p);
            var18 = rd.a(SaveResultsPromptScreen.field_x, new String[]{ap.a(true, var24)}, (byte) 103);
            var7Lifetime15 = var18;
            var7Lifetime15 = var18;
            var8 = rd.a(ek.field_fb, new String[]{var16}, (byte) 103);
            var7Lifetime15 = var8;
            var7Lifetime15 = var8;
            var9 = jq.field_y.measureText(var18);
            var10 = jq.field_y.measureText(var8);
            if (var9 > var10) {
              var5Lifetime4 = var5Lifetime4 - var9;
            } else {
              var5Lifetime4 = var5Lifetime4 - var10;
            }
          }
          if (var5Lifetime4 >= jq.field_y.measureText(OptionsScreen.field_A.toString())) {
            return true;
          }
          MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
          return true;
        }
        if (ng.field_b == 0) {
          if (null == nl.field_f) {
            if (ng.field_b == 2 &&
              !ve.b(-21835160)) {
              var3 = 0;
            }
            if (dc.currentKeyCode == 84) {
              if (var3 == 0) {
                if (ng.field_b != 0) {
                  fl.b(!param0);
                }
              } else {
                if (OptionsScreen.field_A.length() > 0) {
                  var4_ref_StringLifetime1 = OptionsScreen.field_A.toString();
                  if (mm.a(var4_ref_StringLifetime1, (byte) -128)) {
                    var13Lifetime1 = (String) null;
                    var12Lifetime1 = (String) null;
                    wp.a((byte) 92, 0, (String) null, ck.field_j, (String) null, 2);
                    var15Lifetime1 = (String) null;
                    var14Lifetime1 = (String) null;
                    wp.a((byte) 92, 0, (String) null, w.field_m, (String) null, 2);
                    fl.b(true);
                  } else {
                    var5Lifetime1 = ng.field_b;
                    if (var5Lifetime1 == 0 &&
                      null != o.field_e) {
                      var5Lifetime1 = 1;
                    }
                    if (tm.a(var5Lifetime1, (byte) 18) == 2) {
                      DirectByteStorage.a(0, param2, 1, var5Lifetime1);
                    }
                    c.a(-1, DualLinkNode.field_p, (byte) -106, ng.field_b, param1, var4_ref_StringLifetime1);
                    fl.b(true);
                  }
                } else {
                  fl.b(true);
                }
              }
              return true;
            }
            if (85 == dc.currentKeyCode) {
              if (var3 != 0 &&
                OptionsScreen.field_A.length() > 0) {
                MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
              }
              return true;
            }
            var4Lifetime1 = go.currentKeyCharacter;
            stackIn_103_0 = !param0;
            if (!RasterSnapshot.a(stackIn_103_0, (char) var4Lifetime1)) {
              return false;
            }
            if (var3 != 0 &&
              OptionsScreen.field_A.length() < 80) {
              discarded$0 = OptionsScreen.field_A.append((char) var4Lifetime1);
              var5Lifetime1Lifetime1 = 485;
              var17Lifetime1 = tb.field_cb;
              var7Lifetime1 = var17Lifetime1;
              var7Lifetime1Lifetime1 = var17Lifetime1;
              var16 = r.a((byte) 104, var17Lifetime1);
              var7Lifetime1Lifetime2 = var16;
              var7Lifetime1Lifetime3 = var16;
              var19Lifetime1 = var16;
              var7Lifetime1Lifetime4 = var19Lifetime1;
              var7Lifetime1Lifetime5 = var19Lifetime1;
              if (ng.field_b != 2) {
                var7Lifetime1Lifetime6 = "";
                if (ng.field_b == 0) {
                  if (o.field_e == null &&
                    th.field_d) {
                    var7Lifetime1Lifetime6 = "[" + fi.field_u + "] ";
                  }
                  if (null != o.field_e) {
                    if (PowerUp.field_v &&
                      null != jd.field_b) {
                      var7Lifetime1Lifetime6 = "[" + jd.field_b + "] ";
                    } else {
                      var7Lifetime1Lifetime6 = "[" + rd.a(fm.field_a, new String[]{o.field_e.field_Fc}, (byte) 103) + "] ";
                    }
                  }
                }
                var20Lifetime1 = var7Lifetime1Lifetime6 + var19Lifetime1 + ": ";
                var7Lifetime1Lifetime6 = var20Lifetime1;
                var7Lifetime1Lifetime6 = var20Lifetime1;
                var5Lifetime1Lifetime1 = var5Lifetime1Lifetime1 - jq.field_y.measureText(var20Lifetime1);
              } else {
                var25 = (CharSequence) ((Object) DualLinkNode.field_p);
                var18Lifetime1 = rd.a(SaveResultsPromptScreen.field_x, new String[]{ap.a(true, var25)}, (byte) 103);
                var7Lifetime1Lifetime6 = var18Lifetime1;
                var7Lifetime1Lifetime6 = var18Lifetime1;
                var8Lifetime1 = rd.a(ek.field_fb, new String[]{var16}, (byte) 103);
                var7Lifetime1Lifetime6 = var8Lifetime1;
                var7Lifetime1Lifetime6 = var8Lifetime1;
                var9Lifetime1 = jq.field_y.measureText(var18Lifetime1);
                var10Lifetime1 = jq.field_y.measureText(var8Lifetime1);
                if (var9Lifetime1 > var10Lifetime1) {
                  var5Lifetime1Lifetime1 = var5Lifetime1Lifetime1 - var9Lifetime1;
                } else {
                  var5Lifetime1Lifetime1 = var5Lifetime1Lifetime1 - var10Lifetime1;
                }
              }
              if (var5Lifetime1Lifetime1 < jq.field_y.measureText(OptionsScreen.field_A.toString())) {
                MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
              }
            }
            return true;
          }
          var3 = 0;
        }
        if (ng.field_b == 2 &&
          !ve.b(-21835160)) {
          var3 = 0;
        }
        if (dc.currentKeyCode == 84) {
          if (var3 == 0) {
            if (ng.field_b != 0) {
              fl.b(!param0);
            }
          } else {
            if (OptionsScreen.field_A.length() > 0) {
              var4_ref_StringLifetime2 = OptionsScreen.field_A.toString();
              var7Lifetime2 = var4_ref_StringLifetime2;
              var7Lifetime2Lifetime1 = var4_ref_StringLifetime2;
              if (mm.a(var4_ref_StringLifetime2, (byte) -128)) {
                var13Lifetime2 = (String) null;
                var12Lifetime2 = (String) null;
                wp.a((byte) 92, 0, (String) null, ck.field_j, (String) null, 2);
                var15Lifetime2 = (String) null;
                var14Lifetime2 = (String) null;
                wp.a((byte) 92, 0, (String) null, w.field_m, (String) null, 2);
              } else {
                var5Lifetime2 = ng.field_b;
                if (var5Lifetime2 == 0 &&
                  null != o.field_e) {
                  var5Lifetime2 = 1;
                }
                if (tm.a(var5Lifetime2, (byte) 18) == 2) {
                  DirectByteStorage.a(0, param2, 1, var5Lifetime2);
                }
                c.a(-1, DualLinkNode.field_p, (byte) -106, ng.field_b, param1, var4_ref_StringLifetime2);
              }
            }
            fl.b(true);
          }
          return true;
        }
        if (85 == dc.currentKeyCode) {
          if (var3 == 0) {
            return true;
          }
          if (OptionsScreen.field_A.length() <= 0) {
            return true;
          }
          MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
          return true;
        }
        var4Lifetime2 = go.currentKeyCharacter;
        stackIn_160_0 = !param0;
        if (!RasterSnapshot.a(stackIn_160_0, (char) var4Lifetime2)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (OptionsScreen.field_A.length() >= 80) {
          return true;
        }
        discarded$1 = OptionsScreen.field_A.append((char) var4Lifetime2);
        var5Lifetime3 = 485;
        var17Lifetime2 = tb.field_cb;
        var7Lifetime3 = var17Lifetime2;
        var7Lifetime4 = var17Lifetime2;
        var16 = r.a((byte) 104, var17Lifetime2);
        var7Lifetime5 = var16;
        var7Lifetime6 = var16;
        var19Lifetime2 = var16;
        var7Lifetime7 = var19Lifetime2;
        var7Lifetime8 = var19Lifetime2;
        if (ng.field_b != 2) {
          var7Lifetime9 = "";
          if (ng.field_b != 0) {
            var20Lifetime2 = var7Lifetime9 + var19Lifetime2 + ": ";
            var7Lifetime9 = var20Lifetime2;
            var7Lifetime9 = var20Lifetime2;
            var5Lifetime3 = var5Lifetime3 - jq.field_y.measureText(var20Lifetime2);
            if (var5Lifetime3 < jq.field_y.measureText(OptionsScreen.field_A.toString())) {
              MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          if (o.field_e == null &&
            th.field_d) {
            var7Lifetime9 = "[" + fi.field_u + "] ";
          }
          if (null == o.field_e) {
            var20Lifetime2Lifetime1 = var7Lifetime9 + var19Lifetime2 + ": ";
            var5Lifetime3 = var5Lifetime3 - jq.field_y.measureText(var20Lifetime2Lifetime1);
            if (var5Lifetime3 < jq.field_y.measureText(OptionsScreen.field_A.toString())) {
              MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          if (!PowerUp.field_v) {
            var7Lifetime9 = "[" + rd.a(fm.field_a, new String[]{o.field_e.field_Fc}, (byte) 103) + "] ";
            var20Lifetime2Lifetime2 = var7Lifetime9 + var19Lifetime2 + ": ";
            var5Lifetime3 = var5Lifetime3 - jq.field_y.measureText(var20Lifetime2Lifetime2);
            if (var5Lifetime3 < jq.field_y.measureText(OptionsScreen.field_A.toString())) {
              MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          if (null == jd.field_b) {
            var7Lifetime9 = "[" + rd.a(fm.field_a, new String[]{o.field_e.field_Fc}, (byte) 103) + "] ";
            var20Lifetime2Lifetime3 = var7Lifetime9 + var19Lifetime2 + ": ";
            var5Lifetime3 = var5Lifetime3 - jq.field_y.measureText(var20Lifetime2Lifetime3);
            if (var5Lifetime3 < jq.field_y.measureText(OptionsScreen.field_A.toString())) {
              MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
            }
            return true;
          }
          var7Lifetime9 = "[" + jd.field_b + "] ";
          var20Lifetime2Lifetime4 = var7Lifetime9 + var19Lifetime2 + ": ";
          var5Lifetime3 = var5Lifetime3 - jq.field_y.measureText(var20Lifetime2Lifetime4);
        } else {
          var26 = (CharSequence) ((Object) DualLinkNode.field_p);
          var18Lifetime2 = rd.a(SaveResultsPromptScreen.field_x, new String[]{ap.a(true, var26)}, (byte) 103);
          var7Lifetime9 = var18Lifetime2;
          var7Lifetime9 = var18Lifetime2;
          var8Lifetime2 = rd.a(ek.field_fb, new String[]{var16}, (byte) 103);
          var7Lifetime9 = var8Lifetime2;
          var7Lifetime9 = var8Lifetime2;
          var9Lifetime2 = jq.field_y.measureText(var18Lifetime2);
          var10Lifetime2 = jq.field_y.measureText(var8Lifetime2);
          if (var9Lifetime2 > var10Lifetime2) {
            var5Lifetime3 = var5Lifetime3 - var9Lifetime2;
          } else {
            var5Lifetime3 = var5Lifetime3 - var10Lifetime2;
          }
        }
        if (var5Lifetime3 >= jq.field_y.measureText(OptionsScreen.field_A.toString())) {
          return true;
        }
        MessageScreen.a(' ', OptionsScreen.field_A, -1 + OptionsScreen.field_A.length(), false);
        return true;
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param3.field_q) {
            stackIn_6_0 = (param3.f(-71)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param3 instanceof d) {
            param0 = param0 & ((d) (param3)).field_J;
          }
          if (!param0) {
            stackIn_14_0 = this.field_x;
          } else {
            if (var6_int != 0) {
              stackIn_14_0 = this.field_y;
            } else {
              stackIn_14_0 = this.field_z;
            }
          }
          var7 = stackIn_14_0;
          ac.a(this.field_B, param3.field_w + param4 + (param3.field_s - this.field_B[0].canvasHeight >> 1), param3.field_o + param2, param3.field_t, var7, (byte) 122);
          stackIn_17_0 = (!param0) ? 7105644 : 16777215;
          var8 = stackIn_17_0;
          if (param1 != -20618) {
            field_A = (int[]) null;
          }
          this.field_k.a(param3.field_A, param3.field_o + param2, param4 + param3.field_w - 2, param3.field_t, param3.field_s, var8, -1, 1, 1, this.field_k.ascent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("hi.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    public hi() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, String param1) {
        try {
          if (param0 != 85) {
            field_A = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "hi.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        rasterStack = null;
        field_w = null;
        field_A = null;
        if (param0 > -82) {
          field_A = (int[]) null;
        }
    }

    private hi(int param0, int param1, int param2) {
        this.field_x = param2;
        this.field_y = param1;
        this.field_z = param0;
        this.field_k = wm.field_a;
        this.field_B = sf.field_U;
    }

    static {
        rasterStack = new NodeDeque();
    }
}
