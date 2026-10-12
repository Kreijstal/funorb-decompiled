/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BoundedFile {
    private long maximumLength;
    static int field_h;
    static String field_i;
    private RandomAccessFile file;
    static int[] field_e;
    static boolean field_b;
    static int field_a;
    private long position;
    static volatile int field_d;

    final int read(int length, int obfuscationGuard, byte[] destination, int destinationOffset) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.file.read(destination, destinationOffset, length);
          if (var5_int > 0) {
            this.position = this.position + (long)var5_int;
          }
          if (obfuscationGuard >= -43) {
            var6 = (String[]) null;
            BoundedFile.a(-65, (String[]) null);
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ei.E(").append(length).append(',').append(obfuscationGuard).append(',');
          if (destination == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(destinationOffset).append(')').toString());
        }
    }

    final static wd a(int param0, String[] param1) {
        wd var2 = null;
        RuntimeException var2_ref = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new wd(false);
          var2.field_c = param1;
          if (param0 != 2) {
            BoundedFile.a(33, true, false, true);
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ei.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 == -1) {
          wl.a(19, param1);
        } else {
          if (19 == param0) {
            wl.a(65, false);
            SoftwareRaster.d(0, 0, so.field_b.field_a, so.field_b.field_g);
            rq.field_p[param0].e(param3);
          } else {
            if (param0 == 25) {
              wl.a(65, false);
              SoftwareRaster.d(0, 0, so.field_b.field_a, so.field_b.field_g);
              rq.field_p[param0].e(param3);
            } else {
              if (param0 == 1) {
                wl.a(65, false);
                SoftwareRaster.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                rq.field_p[param0].e(param3);
              } else {
                if (param0 == 24) {
                  wl.a(65, false);
                  SoftwareRaster.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                  rq.field_p[param0].e(param3);
                } else {
                  if (param0 == 2) {
                    wl.a(65, false);
                    SoftwareRaster.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                    rq.field_p[param0].e(param3);
                  } else {
                    if (param0 == 17) {
                      wl.a(65, false);
                      SoftwareRaster.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                      rq.field_p[param0].e(param3);
                    } else {
                      if (param0 == 3) {
                        wl.a(65, false);
                        SoftwareRaster.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                        rq.field_p[param0].e(param3);
                      } else {
                        if (param0 == 4) {
                          wl.a(65, false);
                          SoftwareRaster.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                          rq.field_p[param0].e(param3);
                        } else {
                          if (param0 == -2) {
                            SoftwareRaster.b();
                          } else {
                            if (param0 == -4) {
                              SoftwareRaster.b();
                            } else {
                              if (param0 == -5) {
                                SoftwareRaster.b();
                              } else {
                                if (-6 == param0) {
                                  SphinxActionRequest.e(0);
                                } else {
                                  if (-7 == param0) {
                                    tl.b((byte) -90);
                                  } else {
                                    if (!param2) {
                                      jg.field_m.f(so.field_b.field_a / 2 - jg.field_m.canvasWidth / 2, -(jg.field_m.canvasHeight / 2) + so.field_b.field_g / 2);
                                    } else {
                                      wl.a(61, false);
                                    }
                                    SoftwareRaster.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                                    rq.field_p[param0].e(false);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (!param3) {
          return;
        }
        BoundedFile.a(49, -48);
    }

    public static void a(int param0) {
        field_i = null;
        field_e = null;
        if (param0 >= -78) {
          field_e = (int[]) null;
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.file) {
          System.out.println("");
          this.close(783);
        }
    }

    final void close(int obfuscationGuard) throws IOException {
        if (obfuscationGuard != 783) {
          return;
        }
        if (null != this.file) {
          this.file.close();
          this.file = null;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 11906) {
          return false;
        }
        return param0 <= 0 ? true : false;
    }

    final void write(int obfuscationGuard, int sourceOffset, int length, byte[] source) throws IOException {
        try {
          if (obfuscationGuard != 1) {
            field_h = 0;
          }
          if (this.maximumLength < ((long)length + this.position)) {
            this.file.seek(this.maximumLength);
            this.file.write(1);
            throw new EOFException();
          }
          this.file.write(source, sourceOffset, length);
          this.position = this.position + (long)length;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ei.H(" + obfuscationGuard + ',' + sourceOffset + ',' + length + ',' + (source != null ? "{...}" : "null") + ')');
        }
    }

    final void seek(long position, int obfuscationGuard) throws IOException {
        this.file.seek(position);
        this.position = position;
        if (obfuscationGuard < 102) {
          field_d = -103;
          return;
        }
    }

    final long length(boolean obfuscationGuard) throws IOException {
        if (!obfuscationGuard) {
          field_d = 51;
          return this.file.length();
        }
        return this.file.length();
    }

    BoundedFile(File path, String mode, long maximumLength) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == maximumLength) {
            maximumLength = 9223372036854775807L;
          }
          if (path.length() > maximumLength) {
            path.delete();
          }
          this.file = new RandomAccessFile(path, mode);
          this.position = 0L;
          this.maximumLength = maximumLength;
          var5_int = this.file.read();
          if (var5_int != -1 &&
            !mode.equals("r")) {
            this.file.seek(0L);
            this.file.write(var5_int);
          }
          this.file.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ei.<init>(" + (path != null ? "{...}" : "null") + ',' + (mode != null ? "{...}" : "null") + ',' + maximumLength + ')');
        }
    }

    static {
        field_i = "Allies";
        field_b = false;
        field_e = ce.a(-104);
        field_d = 0;
    }
}
