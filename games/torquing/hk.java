/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public abstract class hk extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_e;
    public static boolean field_a;
    public static int field_b;
    public static int field_g;
    public static boolean field_f;
    public static boolean field_c;
    public static boolean field_h;
    public static int field_d;

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != un.field_b) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (wj.field_g != null &&
            wj.field_g != this) {
            stackIn_8_0 = wj.field_g.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "hk.getDocumentBase()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(df param0, int param1) {
        try {
          int stackIn_95_0 = 0;
          RuntimeException stackIn_100_0 = null;
          StringBuilder stackIn_100_1 = null;
          String stackIn_101_2 = null;
          Throwable decompiledCaughtException = null;
          pm var2 = null;
          RuntimeException var2_ref = null;
          int var3 = 0;
          int var4 = 0;
          int var5 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          InvalidClassException var6_ref = null;
          StreamCorruptedException var6_ref2 = null;
          OptionalDataException var6_ref3 = null;
          IllegalAccessException var6_ref4 = null;
          IllegalArgumentException var6_ref5 = null;
          java.lang.reflect.InvocationTargetException var6_ref6 = null;
          SecurityException var6_ref7 = null;
          IOException var6_ref8 = null;
          NullPointerException var6_ref9 = null;
          Exception var6_ref10 = null;
          Throwable var6_ref11 = null;
          java.lang.reflect.Field var7 = null;
          java.lang.reflect.Method var7_ref = null;
          int var8 = 0;
          byte[][] var8_ref_byte____ = null;
          Object[] var9 = null;
          int var10_int = 0;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          var12 = Torquing.field_u;
          try {
            var2 = (pm) (ul.field_e.b(param1 ^ -2933));
            if (var2 == null) {
              return;
            }
            var3 = 0;
            var4 = 0;
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (!(var4 < var2.field_l)))) {
              if (var12 == 0) {
                if (null != var2.field_u[var4]) {
                  if (var2.field_u[var4].field_a == 2) {
                    var2.field_t[var4] = -5;
                  }
                  if (0 == var2.field_u[var4].field_a) {
                    var3 = 1;
                  }
                }
                if (null != var2.field_n[var4]) {
                  if (var2.field_n[var4].field_a == 2) {
                    var2.field_t[var4] = -6;
                  }
                  if (var2.field_n[var4].field_a == 0) {
                    var3 = 1;
                  }
                }
                var4++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              if (var3 != 0) {
                return;
              }
              var4 = param0.field_n;
              param0.b((byte) 60, var2.field_j);
            }
            var5 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!(var5 < var2.field_l)))) {
              stackIn_95_0 = -1;
              if (var12 == 0) {
                if (stackIn_95_0 != ~var2.field_t[var5]) {
                  param0.b(90, var2.field_t[var5]);
                } else {
                  try {
                    var6_int = var2.field_q[var5];
                    switch (var6_int) {
                      case 0:
                        var7 = (java.lang.reflect.Field) (var2.field_u[var5].field_d);
                        var8 = var7.getInt((Object) null);
                        param0.b(90, 0);
                        param0.b((byte) 60, var8);
                        break;
                      case 1:
                        var7 = (java.lang.reflect.Field) (var2.field_u[var5].field_d);
                        var7.setInt((Object) null, var2.field_k[var5]);
                        param0.b(90, 0);
                        break;
                      case 2:
                        var7 = (java.lang.reflect.Field) (var2.field_u[var5].field_d);
                        var8 = var7.getModifiers();
                        param0.b(90, 0);
                        param0.b((byte) 60, var8);
                        break;
                      default:
                        break;
                    }
                    boolean decompiledFrameCompleted0 = true;
                    if (var6_int == 3) {
                      var7_ref = (java.lang.reflect.Method) (var2.field_n[var5].field_d);
                      var8_ref_byte____ = var2.field_o[var5];
                      var9 = new Object[var8_ref_byte____.length];
                      var10_int = 0;
                      while (var8_ref_byte____.length > var10_int) {
                        var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var8_ref_byte____[var10_int])));
                        var9[var10_int] = var11.readObject();
                        var10_int++;
                        if (var12 != 0) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        if (var12 == 0) {
                          continue;
                        }
                        break;
                      }
                      if (decompiledFrameCompleted0) {
                        var10 = var7_ref.invoke((Object) null, var9);
                        if (null != var10) {
                          if (!(var10 instanceof Number)) {
                            boolean decompiledSharedTail0 = !(var10 instanceof String);
                            if (!decompiledSharedTail0) {
                              param0.b(90, 2);
                              param0.b((byte) 4, (String) (var10));
                              decompiledSharedTail0 = (var12 != 0);
                            }
                            if (decompiledSharedTail0) {
                              param0.b(90, 4);
                              if (var12 != 0) {
                                param0.b(90, 1);
                                param0.a(102, ((Number) (var10)).longValue());
                                if (var12 != 0) {
                                  param0.b(90, 0);
                                }
                              }
                            }
                          } else {
                            param0.b(90, 1);
                            param0.a(102, ((Number) (var10)).longValue());
                            if (var12 != 0) {
                              param0.b(90, 0);
                            }
                          }
                        } else {
                          param0.b(90, 0);
                        }
                        if ((var12 != 0) &&
                          (var6_int == 4)) {
                          var7_ref = (java.lang.reflect.Method) (var2.field_n[var5].field_d);
                          var8 = var7_ref.getModifiers();
                          param0.b(90, 0);
                          param0.b((byte) 60, var8);
                        }
                      }
                    } else {
                      if (var6_int == 4) {
                        var7_ref = (java.lang.reflect.Method) (var2.field_n[var5].field_d);
                        var8 = var7_ref.getModifiers();
                        param0.b(90, 0);
                        param0.b((byte) 60, var8);
                      }
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                    param0.b(90, -10);
                  } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                    param0.b(90, -11);
                  } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                    param0.b(90, -12);
                  } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                    param0.b(90, -13);
                  } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                    param0.b(90, -14);
                  } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                    decompiledCaughtException = decompiledCaughtParameter5;
                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                    param0.b(90, -15);
                  } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                    decompiledCaughtException = decompiledCaughtParameter6;
                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                    param0.b(90, -16);
                  } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                    decompiledCaughtException = decompiledCaughtParameter7;
                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                    param0.b(90, -17);
                  } catch (java.io.IOException decompiledCaughtParameter8) {
                    decompiledCaughtException = decompiledCaughtParameter8;
                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                    param0.b(90, -18);
                  } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                    decompiledCaughtException = decompiledCaughtParameter9;
                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                    param0.b(90, -19);
                  } catch (java.lang.Exception decompiledCaughtParameter10) {
                    decompiledCaughtException = decompiledCaughtParameter10;
                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                    param0.b(90, -20);
                  } catch (java.lang.Throwable decompiledCaughtParameter11) {
                    decompiledCaughtException = decompiledCaughtParameter11;
                    var6_ref11 = decompiledCaughtException;
                    param0.b(90, -21);
                  }
                }
                var5++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_95_0 = param0.a(var4, true);
            }
            var2.f(param1 ^ param1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_100_0 = var2_ref;
            stackIn_100_1 = new StringBuilder().append("hk.BA(");
            if (param0 == null) {
              stackIn_101_2 = "null";
            } else {
              stackIn_101_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.paint(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("hk.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void b(byte param0);

    public final void stop() {
        if (vk.field_B != this ||
          fq.field_E) {
          return;
        }
        try {
          eq.field_d = km.b(-1) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "hk.stop()");
        }
    }

    public abstract void init();

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (un.field_b != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != wj.field_g &&
            this != wj.field_g) {
            stackIn_8_0 = wj.field_g.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "hk.getAppletContext()");
        }
    }

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = km.b(-1);
          var4 = jl.field_V[bo.field_k];
          jl.field_V[bo.field_k] = var2_long;
          if (0L != var4 &&
            var4 < var2_long) {
          }
          bo.field_k = 31 & bo.field_k - param0;
          var6 = this;
          synchronized (var6) {
            ae.field_ib = bn.field_b;
          }
          this.a((byte) -30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.LA(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          bn.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("hk.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          if (k.field_d != null) {
            k.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
            k.field_d.getParent().setBackground(java.awt.Color.black);
            k.field_d.getParent().remove((java.awt.Component) ((Object) k.field_d));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null == il.field_q) {
            if (null != un.field_b) {
              var2 = un.field_b;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (wj.field_g != null) {
                var2 = wj.field_g;
                if (var4 != 0) {
                  var2 = vk.field_B;
                  var2 = il.field_q;
                }
              } else {
                var2 = vk.field_B;
                if (var4 != 0) {
                  var2 = il.field_q;
                }
              }
            }
          } else {
            var2 = il.field_q;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          k.field_d = (java.awt.Canvas) ((Object) new md((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) k.field_d));
          k.field_d.setSize(wk.field_d, ul.field_a);
          k.field_d.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == un.field_b);
          if (!decompiledSharedTail0) {
            k.field_d.setLocation(aq.field_d, hg.field_a);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = un.field_b.getInsets();
            k.field_d.setLocation(aq.field_d + var3.left, hg.field_a + var3.top);
          }
          k.field_d.addFocusListener((java.awt.event.FocusListener) (this));
          k.field_d.requestFocus();
          bn.field_b = true;
          ae.field_ib = true;
          cf.field_c = true;
          b.field_v = param0;
          aa.field_Q = km.b(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (var2), "hk.KA(" + param0 + ')');
        }
    }

    final void a(int param0, String param1) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_e) {
              return;
            }
            this.field_e = true;
            System.out.println("error_game_" + param1);
            try {
              hp.a(ip.a(9), (byte) -85, "loggedout");
              if (param0 != 10) {
                this.stop();
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("hk.FA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
          boolean stackIn_70_0 = false;
          int stackIn_86_0 = 0;
          int stackIn_86_1 = 0;
          int stackIn_103_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var1 = null;
          int var1_int = 0;
          String var2 = null;
          int var2_int = 0;
          java.lang.reflect.Method var2_ref = null;
          int var3 = 0;
          Throwable var3_ref_Throwable = null;
          String var4 = null;
          int var5 = 0;
          var5 = Torquing.field_u;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != vh.field_u) {
                var1 = vh.field_u.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = vh.field_v;
                  if (var2.equals("1.1") ||
                    var2.startsWith("1.1.") ||
                    var2.equals("1.2") ||
                    var2.startsWith("1.2.") ||
                    var2.equals("1.3") ||
                    var2.startsWith("1.3.") ||
                    var2.equals("1.4") ||
                    var2.startsWith("1.4.") ||
                    var2.equals("1.5") ||
                    var2.startsWith("1.5.") ||
                    var2.equals("1.6.0")) {
                    this.a(10, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_70_0 = ui.a(-110, var2.charAt(var3));
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_70_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (ip.a((byte) -104, (CharSequence) ((Object) var4)) &&
                        !(kc.a((byte) -85, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a(10, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (vh.field_v != null))) {
                stackIn_70_0 = vh.field_v.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_70_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (vh.field_v.length() > var1_int) {
                    var3 = vh.field_v.charAt(var1_int);
                    stackIn_86_0 = -49;
                    stackIn_86_1 = ~var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_86_0 >= stackIn_86_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = -48 + (var3 + 10 * var2_int);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_86_0 = var2_int;
                    stackIn_86_1 = 5;
                  }
                  if (stackIn_86_0 < stackIn_86_1) {
                    break;
                  }
                  fn.field_b = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = vk.field_B;
                if (wj.field_g != null) {
                  var1 = wj.field_g;
                }
                var2_ref = vh.field_j;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                rd.b(36);
                this.a(false);
                mk.field_b = fd.a(0, ul.field_a, wk.field_d, (java.awt.Component) ((Object) k.field_d));
                this.c(-593);
                df.field_q = lh.a(-24858);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (eq.field_d != 0L) {
                    stackIn_103_0 = $cfr$lcmp(eq.field_d, km.b(-1));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_103_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    oi.field_b = df.field_q.a((byte) -117, eg.field_u);
                    stackIn_103_0 = 0;
                  }
                  var3 = stackIn_103_0;
                  do {
                    if (!(oi.field_b > var3)) {
                      this.d(-18222);
                      oe.a(nk.field_u, 0, k.field_d);
                      break;
                    }
                    this.e(-1);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              nn.a((String) null, (Throwable) (var1), -9958);
              this.a(10, "crash");
            }
            this.a(true, -11);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw rb.a((Throwable) (var1), "hk.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == vk.field_B &&
            !fq.field_E) {
            eq.field_d = km.b(-1);
            ub.a(1976, 5000L);
            pp.field_f = null;
            this.a(false, -11);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.destroy()");
        }
    }

    private final void d(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = km.b(param0 ^ 18221);
          var4 = ui.field_l[ub.field_C];
          ui.field_l[ub.field_C] = var2_long;
          ub.field_C = 1 + ub.field_C & 31;
          if (var4 != 0L &&
            var4 < var2_long) {
          }
          fieldTemp$1 = jk.field_a;
          jk.field_a = jk.field_a + 1;
          if (fieldTemp$1 > 50) {
            cf.field_c = true;
            jk.field_a = jk.field_a - 50;
            k.field_d.setSize(wk.field_d, ul.field_a);
            k.field_d.setVisible(true);
            boolean decompiledSharedTail0 = (un.field_b != null &&
              null == il.field_q);
            if (!decompiledSharedTail0) {
              k.field_d.setLocation(aq.field_d, hg.field_a);
              decompiledSharedTail0 = (Torquing.field_u != 0);
            }
            if (decompiledSharedTail0) {
              var6 = un.field_b.getInsets();
              k.field_d.setLocation(aq.field_d + var6.left, hg.field_a + var6.top);
            }
          }
          this.b((byte) 73);
          if (param0 != -18222) {
            this.a(68, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.CA(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var2_int < param1.length())))) {
            var3 = param1.charAt(var2_int);
            stackIn_16_0 = ra.a((char) var3, (byte) -55);
            if (var4 == 0) {
              if (!stackIn_16_0 &&
                !ui.a(-59, (char) var3)) {
                return true;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = param0;
          }
          if (!stackIn_16_0) {
            hk.a(true, (String) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("hk.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == vk.field_B &&
            !fq.field_E) {
            eq.field_d = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.start()");
        }
    }

    abstract void b(int param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wj.field_g = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("hk.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != un.field_b) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (wj.field_g != null &&
            wj.field_g != this) {
            stackIn_10_0 = wj.field_g.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("hk.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    abstract void c(int param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (vk.field_B == this &&
            !fq.field_E) {
            cf.field_c = true;
            if (fn.field_b &&
              km.b(-1) - aa.field_Q > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (th.field_G > var2.width) {
                  return;
                }
                if (mi.field_s > var2.height) {
                  return;
                }
              }
              b.field_v = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("hk.paint(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (un.field_b != null) {
          return null;
        }
        if (wj.field_g != null &&
          wj.field_g != this) {
          return wj.field_g.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          bn.field_b = true;
          cf.field_c = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("hk.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
          vh dupTemp$0 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var8_int = 0;
          Throwable var8 = null;
          RuntimeException var8_ref = null;
          rc var9 = null;
          int var10 = 0;
          var10 = Torquing.field_u;
          try {
            try {
              if (vk.field_B != null) {
                cf.field_g = cf.field_g + 1;
                if (cf.field_g < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(10, "alreadyloaded");
                return;
              }
              wk.field_d = param4;
              th.field_G = param4;
              vk.field_B = this;
              dq.field_m = param0;
              hg.field_a = 0;
              ul.field_a = param3;
              mi.field_s = param3;
              aq.field_d = 0;
              lg.field_B = ip.a(9);
              dupTemp$0 = new vh(param5, param2, param6, true);
              nk.field_u = dupTemp$0;
              pp.field_f = dupTemp$0;
              var8_int = 117 % ((param1 - 76) / 34);
              var9 = nk.field_u.a((byte) -91, 1, (Runnable) (this));
              while (true) {
                if (var9.field_a == 0) {
                  ub.a(1976, 10L);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = decompiledCaughtException;
              nn.a((String) null, var8, -9958);
              this.a(10, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var8_ref;
            stackIn_21_1 = new StringBuilder().append("hk.V(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          if (param1 != -11) {
            this.a(94);
          }
          var3_ref = this;
          synchronized (var3_ref) {
            if (fq.field_E) {
              return;
            }
            fq.field_E = true;
          }
          if (wj.field_g != null) {
            wj.field_g.destroy();
          }
          try {
            this.b(6);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != k.field_d) {
            try {
              k.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
              k.field_d.getParent().remove((java.awt.Component) ((Object) k.field_d));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (nk.field_u != null) {
            try {
              nk.field_u.b(6);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.a(param1 + 15);
          if (un.field_b != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "hk.W(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.destroy();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("hk.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    protected hk() {
        this.field_e = false;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(byte param0);

    final boolean b(boolean param0) {
        return true;
    }

    abstract void a(int param0);

    final static String a(int param0, boolean param1, int param2, byte[] param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Torquing.field_u;
        try {
          var4 = new char[param0];
          if (!param1) {
            hk.a((df) null, -7);
          }
          var5 = 0;
          var6 = 0;
          while (param0 > var6) {
            var7 = param3[var6 + param2] & 255;
            if (var7 != 0 ||
              var9 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = ef.field_c[-128 + var7];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
            var6++;
            if (var9 == 0) {
              continue;
            }
            break;
          }
          stackIn_22_0 = new String(var4, 0, var5);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("hk.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
