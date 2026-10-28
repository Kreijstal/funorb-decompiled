/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RasterBuffer {
    int width;
    static AccountFormStage field_g;
    static PcmSample field_c;
    static IntrusiveDeque field_e;
    int height;
    static String field_b;
    static int[][] field_a;
    java.awt.Image image;
    int[] pixels;

    public static void releaseStatics(byte guard) {
        field_a = (int[][]) null;
        field_g = null;
        if (guard < 72) {
          return;
        }
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final void bindRaster(int guard) {
        if (guard <= 105) {
          RasterBuffer.releaseStatics((byte) -18);
        }
        SoftwareRasterizer.bind(this.pixels, this.width, this.height);
    }

    abstract void drawImage(int x, int guard, int y, java.awt.Graphics graphics);

    abstract void initialize(int guard, int width, java.awt.Component component, int height);

    final static byte[] whirlpoolDigest(byte[] data, int offset, int length, int guard) {
        byte[] var4 = null;
        String stackIn_13_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (0 < offset) {
            byte[] var9 = new byte[length];
            var4 = var9;
            for (int var5_int = 0; var5_int < length; var5_int++) {
              var9[var5_int] = data[offset + var5_int];
            }
          } else {
            var4 = data;
          }
          WhirlpoolHasher var5 = new WhirlpoolHasher();
          var5.reset(false);
          var5.updateBits((long)(8 * length), var4, 2);
          byte[] var6 = new byte[64];
          var5.finish(0, var6, false);
          if (guard != 0) {
            String var8 = (String) null;
            RasterBuffer.createEmailAvailabilityRequest((byte) 62, (String) null);
          }
          byte[] stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("vn.D(");
          if (data == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(offset).append(',').append(length).append(',').append(guard).append(')').toString());
        }
    }

    final static EmailAvailabilityRequest createEmailAvailabilityRequest(byte guard, String email) {
        String stackIn_7_2 = null;
        try {
          if (guard < 24) {
            field_g = (AccountFormStage) null;
          }
          EmailAvailabilityRequest stackIn_3_0 = new EmailAvailabilityRequest(email);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("vn.F(").append(guard).append(',');
          if (email == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static java.net.URL withUrlParameters(String session, int language, String settings, java.net.URL url, int guard) {
        try {
          String stackIn_49_2 = null;
          String stackIn_52_2 = null;
          String stackIn_55_2 = null;
          Throwable decompiledCaughtException = null;
          int var7_int = 0;
          int var9 = EscapeVector.obfuscationControl;
          try {
            String var5 = url.getFile();
            int var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (language >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                decompiledFrameRemainder0 = !(0 <= var7_int);
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (var7_int >= 0 &&
                    (decompiledFrameRemainder0 = (settings != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (session != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  StringBuilder var7 = new StringBuilder(var6);
                  if (guard != 1) {
                    java.net.URL stackIn_29_0 = (java.net.URL) null;
                    return stackIn_29_0;
                  }
                  StringBuilder discarded$0 = var7.append(var5.substring(0, var6));
                  if (language > 0) {
                    StringBuilder discarded$1 = var7.append("/l=");
                    StringBuilder discarded$2 = var7.append(Integer.toString(language));
                  }
                  if (settings != null &&
                    settings.length() > 0) {
                    StringBuilder discarded$3 = var7.append("/p=");
                    StringBuilder discarded$4 = var7.append(settings);
                  }
                  if (session != null &&
                    session.length() > 0) {
                    StringBuilder discarded$5 = var7.append("/s=");
                    StringBuilder discarded$6 = var7.append(session);
                  }
                  if (var6 >= var5.length()) {
                    StringBuilder discarded$7 = var7.append('/');
                  } else {
                    StringBuilder discarded$8 = var7.append(var5.substring(var6, var5.length()));
                  }
                  try {
                    java.net.URL stackIn_43_0 = new java.net.URL(url, var7.toString());
                    return stackIn_43_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    Exception var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    java.net.URL stackIn_45_0 = (java.net.URL) (url);
                    return stackIn_45_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_48_0 = var5_ref;
            StringBuilder stackIn_48_1 = new StringBuilder().append("vn.H(");
            if (session == null) {
              stackIn_49_2 = "null";
            } else {
              stackIn_49_2 = "{...}";
            }
            StringBuilder stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(language).append(',');
            if (settings == null) {
              stackIn_52_2 = "null";
            } else {
              stackIn_52_2 = "{...}";
            }
            StringBuilder stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
            if (url == null) {
              stackIn_55_2 = "null";
            } else {
              stackIn_55_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static long encodeBase37Name(byte guard, CharSequence text) {
        String stackIn_27_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          long var2_long = 0L;
          int var4 = text.length();
          if (guard < 47) {
            field_g = (AccountFormStage) null;
          }
          for (int var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            int var6 = text.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-64 + var6);
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(-97 + (var6 + 1));
            } else {
              if (48 <= var6 &&
                57 >= var6) {
                var2_long = var2_long + (long)(var6 - 21);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          long stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_26_0 = var2;
          StringBuilder stackIn_26_1 = new StringBuilder().append("vn.E(").append(guard).append(',');
          if (text == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_g = new AccountFormStage();
        field_b = "That name is not available";
        field_e = new IntrusiveDeque();
        field_a = new int[][]{new int[]{0, 1}, new int[]{2}, new int[]{3}};
    }
}
