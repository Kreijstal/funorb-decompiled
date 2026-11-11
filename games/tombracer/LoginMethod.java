/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethod {
    static IntrusiveDeque field_f;
    static String field_c;
    private String field_a;
    static int field_d;
    static String[] loadingTextTranslations;
    static boolean field_b;

    final boolean matchesMethodName(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 5) {
            stackIn_4_0 = this.field_a.equals(param0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nl.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          if (param5 != 14375) {
            LoginMethod.a(-36, -84, -86, 3, 107, 83);
          }
          if (LineShape.field_h >= param2) {
            if (gca.field_d > param3) {
              return;
            }
            if (param1 < pka.field_b) {
              param1 = pka.field_b;
              var6_int = 0;
            } else {
              if (param1 <= DiskCacheWorker.field_c) {
                var6_int = 1;
              } else {
                var6_int = 0;
                param1 = DiskCacheWorker.field_c;
              }
            }
            if (pka.field_b > param4) {
              param4 = pka.field_b;
              var7 = 0;
            } else {
              if (DiskCacheWorker.field_c >= param4) {
                var7 = 1;
              } else {
                param4 = DiskCacheWorker.field_c;
                var7 = 0;
              }
            }
            if (param2 < gca.field_d) {
              param2 = gca.field_d;
            } else {
              incrementValue$0 = param2;
              param2++;
              C2SRoomResultPacket.fillRange((byte) -55, param0, param4, vaa.field_a[incrementValue$0], param1);
            }
            if (LineShape.field_h >= param3) {
              incrementValue$1 = param3;
              param3--;
              C2SRoomResultPacket.fillRange((byte) -55, param0, param4, vaa.field_a[incrementValue$1], param1);
            } else {
              param3 = LineShape.field_h;
            }
            if (var6_int != 0 &&
              var7 != 0) {
              for (var8 = param2; var8 <= param3; var8++) {
                var12 = vaa.field_a[var8];
                var11 = var12;
                var9 = var11;
                var12[param4] = param0;
                var9[param1] = param0;
              }
            } else {
              if (var6_int != 0) {
                for (var8 = param2; param3 >= var8; var8++) {
                  vaa.field_a[var8][param1] = param0;
                }
              } else {
                if (var7 != 0) {
                  for (var8 = param2; var8 <= param3; var8++) {
                    vaa.field_a[var8][param4] = param0;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var6), "nl.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static MenuScreen getMenuScreen(int param0, byte param1) {
        if (param1 != 50) {
          field_f = (IntrusiveDeque) null;
        }
        return RenderScene.field_g[param0];
    }

    LoginMethod(String param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "nl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void saveAsLastLoginMethod(java.applet.Applet param0, int param1) {
        try {
          LegacyOpenGlTexture3D.writeCookie(this.field_a, "jagex-last-login-method", (byte) 121, 31536000L, param0);
          if (param1 != 5) {
            String var4 = (String) null;
            this.matchesMethodName((String) null, -66);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "nl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -35) {
          LoginMethod.a(55, 84, -11, -72, -118, -51);
        }
        field_c = null;
        loadingTextTranslations = null;
        field_f = null;
    }

    final static pha a(boolean param0, long param1) {
        if (!param0) {
          LoginMethod.a(false, 56L);
        }
        return (pha) (fua.field_a.get(-126, param1));
    }

    static {
        field_d = 5;
        field_c = "Loading...";
        field_f = new IntrusiveDeque();
        loadingTextTranslations = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = false;
    }
}
