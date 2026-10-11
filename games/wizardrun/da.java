/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class da extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_j;
    boolean field_c;
    static boolean field_g;
    static ph field_e;
    public static boolean field_h;
    public static boolean field_a;
    public static int field_k;
    public static boolean field_b;
    public static int field_d;
    public static boolean field_f;
    public static int field_i;

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (he.field_u != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != fl.field_F &&
            fl.field_F != this) {
            stackIn_10_0 = fl.field_F.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "da.getDocumentBase()");
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          se.field_b = true;
          pk.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("da.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    final static java.net.URL a(int param0, int param1, String param2, java.net.URL param3, String param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_3_0 = null;
          java.net.URL stackIn_58_0 = null;
          java.net.URL stackIn_60_0 = null;
          RuntimeException stackIn_64_0 = null;
          StringBuilder stackIn_64_1 = null;
          String stackIn_65_2 = null;
          StringBuilder stackIn_68_1 = null;
          String stackIn_69_2 = null;
          StringBuilder stackIn_72_1 = null;
          String stackIn_73_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var9 = wizardrun.field_H;
          try {
            var5 = param3.getFile();
            var6 = 0;
            if (param0 < 75) {
              stackIn_3_0 = (java.net.URL) null;
              return stackIn_3_0;
            }
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (param1 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    if (var9 == 0) {
                      continue;
                    }
                  }
                  var6 = var7_int;
                  if (var9 == 0) {
                    continue;
                  }
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_intLifetime1 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime1 >= 0) {
                  var6 = var7_intLifetime1;
                  if (var9 == 0) {
                    continue;
                  }
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime2 >= 0) {
                  if (param4 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                    if (var9 == 0) {
                      continue;
                    }
                  }
                  var6 = var7_intLifetime2;
                  if (var9 == 0) {
                    continue;
                  }
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime3 >= 0) {
                  if (null == param2) {
                    var6 = var7_intLifetime3;
                    if (var9 == 0) {
                      continue;
                    }
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                  if (var9 == 0) {
                    continue;
                  }
                }
              }
              break;
            }
            var7 = new StringBuilder(var6);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (param1 > 0) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param1));
            }
            if (null != param4 &&
              param4.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param4);
            }
            if (param2 != null &&
              param2.length() > 0) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param2);
            }
            if (var5.length() <= var6) {
              discarded$7 = var7.append('/');
              if (var9 != 0) {
                discarded$8 = var7.append(var5.substring(var6, var5.length()));
              }
            } else {
              discarded$8 = var7.append(var5.substring(var6, var5.length()));
            }
            try {
              stackIn_58_0 = new java.net.URL(param3, var7.toString());
              return stackIn_58_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_60_0 = (java.net.URL) (param3);
              return stackIn_60_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_64_0 = var5_ref;
            stackIn_64_1 = new StringBuilder().append("da.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_65_2 = "null";
            } else {
              stackIn_65_2 = "{...}";
            }
            stackIn_68_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
            if (param3 == null) {
              stackIn_69_2 = "null";
            } else {
              stackIn_69_2 = "{...}";
            }
            stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
            if (param4 == null) {
              stackIn_73_2 = "null";
            } else {
              stackIn_73_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (he.field_u != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (fl.field_F != null &&
            fl.field_F != this) {
            stackIn_12_0 = fl.field_F.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("da.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean g(int param0) {
        return true;
    }

    public final void destroy() {
        if (ca.field_c != this ||
          mk.field_d) {
          return;
        }
        try {
          lc.field_b = d.a((byte) 53);
          tg.a(5000L, false);
          qf.field_m = null;
          this.b(77, false);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "da.destroy()");
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 ^ param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var4), "da.B(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void e(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          if (param0 < 54) {
            field_j = (String) null;
          }
          if (null != wizardrun.field_G) {
            wizardrun.field_G.removeFocusListener((java.awt.event.FocusListener) (this));
            wizardrun.field_G.getParent().setBackground(java.awt.Color.black);
            wizardrun.field_G.getParent().remove((java.awt.Component) ((Object) wizardrun.field_G));
          }
          boolean decompiledFrameRemainder0 = true;
          if (fl.field_H != null) {
            var2 = fl.field_H;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (he.field_u == null) {
              if (null == fl.field_F) {
                var2 = ca.field_c;
                if (var4 != 0) {
                  var2 = fl.field_F;
                  var2 = he.field_u;
                }
              } else {
                var2 = fl.field_F;
                if (var4 != 0) {
                  var2 = he.field_u;
                }
              }
            } else {
              var2 = he.field_u;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          wizardrun.field_G = (java.awt.Canvas) ((Object) new gd((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) wizardrun.field_G));
          wizardrun.field_G.setSize(rg.field_R, rg.field_P);
          wizardrun.field_G.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == he.field_u);
          if (!decompiledSharedTail0) {
            wizardrun.field_G.setLocation(ph.field_o, hb.field_n);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = he.field_u.getInsets();
            wizardrun.field_G.setLocation(var3.left + ph.field_o, hb.field_n + var3.top);
          }
          wizardrun.field_G.addFocusListener((java.awt.event.FocusListener) (this));
          wizardrun.field_G.requestFocus();
          jg.field_n = true;
          se.field_b = true;
          pk.field_o = true;
          tj.field_F = false;
          me.field_e = d.a((byte) 23);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (var2), "da.A(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    abstract void f(int param0);

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 > 2 &&
            !tc.field_j &&
            !e.a(-73)) {
            ei.field_k = param1;
            fa.field_a = mg.a(wg.field_b, new int[]{param1}, ic.field_a, 3, (byte) 99, me.field_f, qh.field_g + hi.field_c, 65533, 2);
            th.field_g = ff.a(10, 2, (byte) 59, 3, 1);
            if (wizardrun.field_H != 0) {
              tc.field_j = false;
              ei.field_k = 0;
            }
          } else {
            tc.field_j = false;
            ei.field_k = 0;
          }
          if (param0 != 7775) {
            field_j = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "da.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          var2_long = d.a((byte) 22);
          var4 = pc.field_k[jk.field_e];
          pc.field_k[jk.field_e] = var2_long;
          if (param0 != -107) {
            da.a(-58, 96, (String) null, (java.net.URL) null, (String) null);
          }
          if (0L != var4 &&
            var4 >= var2_long) {
          }
          jk.field_e = 1 + jk.field_e & 31;
          fieldTemp$1 = kk.field_zb;
          kk.field_zb = kk.field_zb + 1;
          if (fieldTemp$1 > 50) {
            pk.field_o = true;
            kk.field_zb = kk.field_zb - 50;
            wizardrun.field_G.setSize(rg.field_R, rg.field_P);
            wizardrun.field_G.setVisible(true);
            boolean decompiledSharedTail0 = (null != he.field_u &&
              null == fl.field_H);
            if (!decompiledSharedTail0) {
              wizardrun.field_G.setLocation(ph.field_o, hb.field_n);
              decompiledSharedTail0 = (wizardrun.field_H != 0);
            }
            if (decompiledSharedTail0) {
              var6 = he.field_u.getInsets();
              wizardrun.field_G.setLocation(ph.field_o + var6.left, hb.field_n + var6.top);
            }
          }
          this.f(-103);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) runtimeException), "da.D(" + param0 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (param0 < 48) {
              return;
            }
            if (mk.field_d) {
              return;
            }
            mk.field_d = true;
          }
          if (fl.field_F != null) {
            fl.field_F.destroy();
          }
          try {
            this.a(false);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != wizardrun.field_G) {
            try {
              wizardrun.field_G.removeFocusListener((java.awt.event.FocusListener) (this));
              wizardrun.field_G.getParent().remove((java.awt.Component) ((Object) wizardrun.field_G));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (ld.field_g != null) {
            try {
              ld.field_g.b(-3);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.d(7069);
          if (null != he.field_u) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw bd.a((Throwable) ((Object) runtimeException), "da.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = d.a((byte) 69);
          var4 = ql.field_b[oj.field_c];
          ql.field_b[oj.field_c] = var2_long;
          oj.field_c = 31 & oj.field_c + 1;
          if (var4 != (long)param0 &&
            var4 < var2_long) {
          }
          var6 = this;
          synchronized (var6) {
            jg.field_n = se.field_b;
          }
          this.i(-103);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw bd.a((Throwable) ((Object) runtimeException), "da.H(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          se.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("da.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 <= 54) {
            field_j = (String) null;
          }
          field_j = null;
          field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "da.I(" + param0 + ')');
        }
    }

    public abstract void init();

    final static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (u.field_A != null) {
            u.field_A.g(-5903);
          }
          if (ea.field_e != null) {
            ea.field_e.k(param0 + 21);
          }
          if (param0 != 0) {
            da.a(-116, false);
          }
          nh.c((byte) 95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "da.O(" + param0 + ')');
        }
    }

    public final void stop() {
        if (this != ca.field_c ||
          mk.field_d) {
          return;
        }
        try {
          lc.field_b = 4000L + d.a((byte) 67);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "da.stop()");
        }
    }

    public final void run() {
        try {
          boolean stackIn_70_0 = false;
          int stackIn_86_0 = 0;
          int stackIn_86_1 = 0;
          int stackIn_107_0 = 0;
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
          var5 = wizardrun.field_H;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (vh.field_p != null) {
                var1 = vh.field_p.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = vh.field_b;
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
                    this.a("wrongjava", (byte) 126);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_70_0 = vl.a(var2.charAt(var3), -5717);
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
                      if (af.a((CharSequence) ((Object) var4), (byte) 78) &&
                        !(ph.a(1124, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a("wrongjava", (byte) 126);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != vh.field_b))) {
                stackIn_70_0 = vh.field_b.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_70_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < vh.field_b.length()) {
                    var3 = vh.field_b.charAt(var1_int);
                    stackIn_86_0 = 48;
                    stackIn_86_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_86_0 <= stackIn_86_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = -48 + var3 + 10 * var2_int;
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_86_0 = 5;
                    stackIn_86_1 = var2_int;
                  }
                  if (stackIn_86_0 > stackIn_86_1) {
                    break;
                  }
                  ug.field_Q = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = ca.field_c;
                if (null != fl.field_F) {
                  var1 = fl.field_F;
                }
                var2_ref = vh.field_q;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                kj.a(47);
                this.e(81);
                hl.field_b = bh.a((java.awt.Component) ((Object) wizardrun.field_G), (byte) 105, rg.field_R, rg.field_P);
                this.a(6);
                pe.field_y = wl.b(250);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (lc.field_b != 0L) {
                    stackIn_107_0 = $cfr$lcmp(~lc.field_b, ~d.a((byte) 76));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_107_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    uh.field_c = pe.field_y.a(wj.field_E, 0);
                    stackIn_107_0 = 0;
                  }
                  var3 = stackIn_107_0;
                  do {
                    if (!(var3 < uh.field_c)) {
                      this.a((byte) -107);
                      bi.a(ld.field_g, (byte) -88, wizardrun.field_G);
                      break;
                    }
                    this.c(0);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              rg.a((Throwable) (var1), (String) null, -562);
              this.a("crash", (byte) 126);
            }
            this.b(118, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw bd.a((Throwable) (var1), "da.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          stackIn_5_1 = new StringBuilder().append("da.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("da.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != he.field_u) {
          return null;
        }
        if (fl.field_F != null &&
          this != fl.field_F) {
          return fl.field_F.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (ca.field_c == this &&
            !mk.field_d) {
            pk.field_o = true;
            if (ug.field_Q &&
              -me.field_e + d.a((byte) 92) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (le.field_b > var2.width) {
                  return;
                }
                if (oj.field_b > var2.height) {
                  return;
                }
              }
              tj.field_F = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("da.paint(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void a(String param0, byte param1) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (param1 <= 125) {
              return;
            }
            if (this.field_c) {
              return;
            }
            this.field_c = true;
            System.out.println("error_game_" + param0);
            try {
              cl.a(jg.f(1), -3264, "loggedout");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("da.Q(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void i(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    abstract void d(int param0);

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fl.field_F = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("da.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        if (ca.field_c != this ||
          mk.field_d) {
          return;
        }
        try {
          lc.field_b = 0L;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "da.start()");
        }
    }

    final static int a(int param0, boolean param1) {
        int stackIn_2_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        try {
          if (0 == param0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (0 < param0) {
            var2_int = 1;
            if (param0 > 65535) {
              var2_int += 16;
              param0 = param0 >> 16;
            }
            if (param0 > 255) {
              var2_int += 8;
              param0 = param0 >> 8;
            }
            if (param0 > 15) {
              param0 = param0 >> 4;
              var2_int += 4;
            }
            if (param0 > 3) {
              param0 = param0 >> 2;
              var2_int += 2;
            }
            if (param0 > 1) {
              param0 = param0 >> 1;
              var2_int++;
            }
            stackIn_23_0 = var2_int;
            return stackIn_23_0;
          }
          var2_intLifetime1 = 2;
          if (!param1) {
            field_g = false;
          }
          if (param0 < -65536) {
            var2_intLifetime1 += 16;
            param0 = param0 >> 16;
          }
          if (param0 < -256) {
            var2_intLifetime1 += 8;
            param0 = param0 >> 8;
          }
          if (param0 < -16) {
            var2_intLifetime1 += 4;
            param0 = param0 >> 4;
          }
          if (param0 < -4) {
            param0 = param0 >> 2;
            var2_intLifetime1 += 2;
          }
          if (param0 < -2) {
            param0 = param0 >> 1;
            var2_intLifetime1++;
          }
          stackIn_40_0 = var2_intLifetime1;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "da.L(" + param0 + ',' + param1 + ')');
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (he.field_u != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != fl.field_F &&
            fl.field_F != this) {
            stackIn_10_0 = fl.field_F.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "da.getAppletContext()");
        }
    }

    protected da() {
        this.field_c = false;
    }

    final void a(int param0, int param1, byte param2, String param3, int param4, int param5, int param6) {
        try {
          vh dupTemp$0 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var8_int = 0;
          Throwable var8 = null;
          RuntimeException var8_ref = null;
          jh var9 = null;
          int var10 = 0;
          var10 = wizardrun.field_H;
          try {
            try {
              if (ca.field_c != null) {
                dg.field_e = dg.field_e + 1;
                if (dg.field_e < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", (byte) 126);
                return;
              }
              rg.field_R = param5;
              le.field_b = param5;
              fi.field_A = param0;
              ph.field_o = 0;
              hb.field_n = 0;
              var8_int = 118 / ((param2 + 8) / 54);
              ca.field_c = this;
              rg.field_P = param4;
              oj.field_b = param4;
              ej.field_a = jg.f(1);
              dupTemp$0 = new vh(param6, param3, param1, true);
              ld.field_g = dupTemp$0;
              qf.field_m = dupTemp$0;
              var9 = ld.field_g.a((byte) -88, (Runnable) (this), 1);
              while (true) {
                if (var9.field_a == 0) {
                  tg.a(10L, false);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = decompiledCaughtException;
              rg.a(var8, (String) null, -562);
              this.a("crash", (byte) 126);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var8_ref;
            stackIn_21_1 = new StringBuilder().append("da.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, vh param3, int param4, int param5) {
        Object stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_36_0 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_48_0 = null;
        java.awt.Frame stackIn_50_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        rb[] var6 = null;
        jh var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = wizardrun.field_H;
        try {
          if (!param3.a(169978736)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (param2 == param4) {
            var6 = cd.a(true, param3);
            if (var6 == null) {
              stackIn_9_0 = null;
              return (java.awt.Frame) (stackIn_9_0);
            }
            var7_int = 0;
            var8 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var8 < var6.length) {
                stackIn_36_0 = ~param1;
                decompiledFrameRemainder0 = (var9 == 0);
                if (decompiledFrameRemainder0) {
                  if (stackIn_36_0 == ~var6[var8].field_g &&
                    ~var6[var8].field_h == ~param0 && ((param5 == 0 ||
                    var6[var8].field_f == param5) &&
                    (var7_int == 0 ||
                    !(var6[var8].field_c <= param4)))) {
                    var7_int = 1;
                    param4 = var6[var8].field_c;
                  }
                  var8++;
                  if (var9 == 0) {
                    continue;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_36_0 = var7_int;
              }
              if (stackIn_36_0 != 0) {
                break;
              }
              stackIn_39_0 = null;
              return (java.awt.Frame) (stackIn_39_0);
            }
          }
          var6_ref = param3.a(param4, 114, param5, param1, param0);
          while (var6_ref.field_a == 0) {
            tg.a(10L, false);
            if (var9 == 0) {
              continue;
            }
            break;
          }
          var7 = (java.awt.Frame) (var6_ref.field_e);
          if (null == var7) {
            stackIn_45_0 = null;
            return (java.awt.Frame) (stackIn_45_0);
          }
          if (var6_ref.field_a != 2) {
            stackIn_50_0 = var7;
            return stackIn_50_0;
          }
          q.a(62, var7, param3);
          stackIn_48_0 = null;
          return (java.awt.Frame) (stackIn_48_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref2 = decompiledCaughtException;
          stackIn_54_0 = var6_ref2;
          stackIn_54_1 = new StringBuilder().append("da.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_g = false;
        field_j = "Reload game";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
