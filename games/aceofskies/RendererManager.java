/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RendererManager {
    private boolean field_d;
    static vd field_a;
    private vu field_e;
    static int field_f;
    static int field_c;
    private d field_b;
    private sn[] field_g;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          RendererManager.a(false);
        }
    }

    private final boolean b(java.awt.Canvas param0, int param1) {
        vu var3 = null;
        RuntimeException var3_ref = null;
        jc var4 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 89) {
            var4 = (jc) null;
            RendererManager.a((byte) -63, 59, (byte[]) null, (jc) null);
          }
          var3 = this.field_e;
          if (var3 == null ||
            !this.field_d ||
            param0 != var3.field_b) {
            this.a(param0, 91);
          }
          if (null != this.field_e) {
            this.field_e.field_c.b((int)(-this.field_e.field_a + kh.a(-104)));
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_e != null && (var3 == null ||
            this.field_e.field_c != var3.field_c)) {
            stackIn_15_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_15_0 = false;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("l.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static vj a(byte param0, int param1, byte[] param2, jc param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        Object stackIn_15_0 = null;
        vj stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (param2.length == 0) {
            return null;
          }
          if (param0 != 29) {
            field_f = -49;
          }
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param1);
          jaggl.OpenGL.glShaderSourceRawARB(var4_long, param2);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, dg.field_Q, 0);
          if (dg.field_Q[0] == 0) {
            if (dg.field_Q[0] == 0) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, dg.field_Q, 1);
            if (dg.field_Q[1] > 1) {
              var10 = new byte[dg.field_Q[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, dg.field_Q[1], dg.field_Q, 0, var10, 0);
              System.out.println(new String(var10));
            }
            if (dg.field_Q[0] == 0) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_15_0 = null;
              return (vj) (stackIn_15_0);
            }
          }
          stackIn_17_0 = new vj(param3, var4_long, param1);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("l.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    RendererManager(int param0, int param1, d param2) {
        this(RendererBitmapFont.a(param0, 1), cm.a(param1, (byte) 118), param2, pt.field_b, an.a(false));
    }

    private final void a(java.awt.Canvas param0, int param1) {
        int var5 = 0;
        Object stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_119_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        sn[] var4 = null;
        sn var6 = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8_int = 0;
        vu var8 = null;
        int var9 = 0;
        int var10 = 0;
        GraphicsRenderer var11 = null;
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var3 = null;
          var4 = this.field_g;
          if (param1 <= 55) {
            this.field_e = (vu) null;
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            boolean decompiledFrameRemainder0 = true;
            var6 = var4[var5];
            if (var6.field_b) {
              var7_int = var6.field_d;
              if (var7_int != 0) {
                if (5 == var7_int) {
                  if (!oi.field_d.b((byte) -90)) {
                    return;
                  }
                  var7_int = bc.a("hw3d", (byte) -95);
                  if (-1 == var7_int) {
                    var6.field_b = false;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (var7_int < 100) {
                      return;
                    }
                    var8_int = bc.a("jaclib", (byte) 49);
                    if (var8_int == -1) {
                      var6.field_b = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var8_int < 100) {
                        return;
                      }
                      var9 = bc.a("jaggl", (byte) -75);
                      if (var9 == -1) {
                        var6.field_b = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var9 < 100) {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  if (var7_int != 1) {
                    if (var7_int == 3) {
                      if (!oi.field_d.b((byte) 116)) {
                        return;
                      }
                      var7_int = bc.a("jaclib", (byte) 12);
                      if (var7_int == -1) {
                        var6.field_b = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var7_int < 100) {
                          return;
                        }
                        var8_int = bc.a("jagdx", (byte) 47);
                        if (var8_int == -1) {
                          var6.field_b = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var8_int < 100) {
                            return;
                          }
                          var9 = bc.a("hw3d", (byte) 1);
                          if (var9 == -1) {
                            var6.field_b = false;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if (var9 < 100) {
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      if (var7_int != 2) {
                        throw new IllegalStateException("UT" + var6.field_d);
                      }
                      if (!oi.field_d.b((byte) -39)) {
                        return;
                      }
                      var7_int = bc.a("jaclib", (byte) 74);
                      if (var7_int == -1) {
                        var6.field_b = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (100 > var7_int) {
                          return;
                        }
                        var8_int = bc.a("sw3d", (byte) 41);
                        if (var8_int == -1) {
                          var6.field_b = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var8_int < 100) {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (!oi.field_d.b((byte) -44)) {
                      return;
                    }
                    var7_int = bc.a("jaclib", (byte) -120);
                    if (var7_int == -1) {
                      var6.field_b = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var7_int < 100) {
                        return;
                      }
                      var8_int = bc.a("jaggl", (byte) -80);
                      if (var8_int == -1) {
                        var6.field_b = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var8_int < 100) {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                if (null != this.field_e) {
                  if (this.field_e.field_d.a((byte) -73, var6) &&
                    this.field_e.field_c != null &&
                    param0 == this.field_e.field_b &&
                    var6.a(this.field_e, 0)) {
                    this.field_d = true;
                    return;
                  }
                  if (var6.field_d == this.field_e.field_d.field_d &&
                    null != this.field_e.field_c) {
                    var3 = this.field_e.a((byte) 38);
                    this.field_e.field_c.a(-9);
                    this.field_e = null;
                  }
                }
                try {
                  var11 = hr.a(iq.field_h, this.field_b, -106, var6.field_a, param0, var6.field_d);
                  if (var11 != null) {
                    var8 = new vu(var11, var6, param0);
                    if (var6.a(var8, 0)) {
                      if (null != this.field_e) {
                        if (var8.field_c == this.field_e.field_c &&
                          var8.field_b == this.field_e.field_b) {
                          this.field_d = true;
                          this.field_e = var8;
                          return;
                        }
                        var3 = this.field_e.a((byte) 38);
                        this.field_e.field_c.a(-9);
                      }
                      if (var8.field_c.b()) {
                        var8.field_c.a(var8.field_c.c(100663296));
                      }
                      if (var3 == null) {
                        var8.field_a = kh.a(-75);
                      } else {
                        ((mj) (var3)).a(true, var8);
                      }
                      this.field_d = true;
                      this.field_e = var8;
                      return;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var7 = decompiledCaughtException;
                  var7.printStackTrace();
                }
                var6.field_b = false;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          stackIn_118_0 = var3;
          stackIn_118_1 = new StringBuilder().append("l.A(");
          if (param0 == null) {
            stackIn_119_2 = "null";
          } else {
            stackIn_119_2 = "{...}";
          }
          throw pn.a((Throwable) (stackIn_118_0), ((StringBuilder) (Object) stackIn_118_1).append(stackIn_119_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, sn[] param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_g != param1) {
            if (param1.length == 0) {
              throw new IllegalArgumentException();
            }
            this.field_g = param1;
            this.field_d = false;
          }
          if (param0 != 116) {
            this.field_d = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("l.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        int var2 = 10 / ((param0 - 68) / 53);
        return this.b(fa.a(-8213), 118);
    }

    final GraphicsRenderer a(byte param0) {
        if (param0 <= 59) {
          return (GraphicsRenderer) null;
        }
        if (null == this.field_e) {
          return null;
        }
        return this.field_e.field_c;
    }

    private RendererManager(ResourceArchive param0, ResourceArchive param1, d param2, rk param3, sn[] param4) {
        this.field_d = false;
        try {
          oi.field_d = param0;
          this.field_b = param2;
          iq.field_h = param1;
          ef.a((byte) 100, param3, param0);
          this.a((byte) 116, param4);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 256;
    }
}
