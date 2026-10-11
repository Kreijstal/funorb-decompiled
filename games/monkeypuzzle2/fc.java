/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class fc extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_l;
    static te field_j;
    static String field_m;
    static te field_g;
    static va field_k;
    static String field_b;
    public static boolean field_c;
    public static int field_e;
    public static boolean field_f;
    public static int field_i;
    public static int field_h;
    public static int field_a;
    public static int field_d;

    final boolean b(byte param0) {
        return true;
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          hh.field_o = true;
          gb.field_j = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fc.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          hh.field_o = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fc.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("fc.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void b(boolean param0);

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hk.field_e != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (ll.field_b != null &&
            this != ll.field_b) {
            stackIn_10_0 = ll.field_b.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "fc.getAppletContext()");
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (m.field_f == this &&
            !dl.field_b) {
            hj.field_db = pf.a(0);
            em.a(5000L, false);
            fk.field_c = null;
            this.a(false, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fc.destroy()");
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_83_0 = 0;
          int stackIn_83_1 = 0;
          int stackIn_102_0 = 0;
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
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != md.field_l) {
                var1 = md.field_l.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = md.field_m;
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
                    this.a((byte) 75, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = re.a(-49, var2.charAt(var3));
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_68_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (ra.a((CharSequence) ((Object) var4), (byte) -116) &&
                        !(vi.a(63, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a((byte) 123, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != md.field_m))) {
                stackIn_68_0 = md.field_m.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < md.field_m.length()) {
                    var3 = md.field_m.charAt(var1_int);
                    stackIn_83_0 = var3;
                    stackIn_83_1 = 48;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_83_0 >= stackIn_83_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = var2_int * 10 + (var3 - 48);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_83_0 = 5;
                    stackIn_83_1 = var2_int;
                  }
                  if (stackIn_83_0 > stackIn_83_1) {
                    break;
                  }
                  sd.field_c = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = m.field_f;
                if (ll.field_b != null) {
                  var1 = ll.field_b;
                }
                var2_ref = md.field_h;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                pf.a(true);
                this.a(false);
                ac.field_a = ub.a((byte) -85, ub.field_b, (java.awt.Component) ((Object) ie.field_e), lb.field_z);
                this.a(-17);
                ne.field_c = il.a(-20601);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (hj.field_db != 0L) {
                    stackIn_102_0 = $cfr$lcmp(~pf.a(0), ~hj.field_db);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    bg.field_E = ne.field_c.a(ed.field_d, -128);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(var3 < bg.field_E)) {
                      this.b(57);
                      em.a(ie.field_e, (byte) -101, rc.field_k);
                      break;
                    }
                    this.a((byte) -85);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              kk.a((String) null, (byte) 124, (Throwable) (var1));
              this.a((byte) 98, "crash");
            }
            this.a(false, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw la.a((Throwable) (var1), "fc.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (this == m.field_f &&
            !dl.field_b) {
            gb.field_j = true;
            if (sd.field_c &&
              pf.a(0) - ah.field_e > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < kk.field_b) {
                  return;
                }
                if (var2.height < ih.field_b) {
                  return;
                }
              }
              aj.field_c = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("fc.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_j = null;
          if (param0) {
            field_g = (te) null;
          }
          field_k = null;
          field_g = null;
          field_b = null;
          field_m = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "fc.EA(" + param0 + ')');
        }
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
          if (hk.field_e != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (null != ll.field_b &&
            this != ll.field_b) {
            stackIn_12_0 = ll.field_b.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("fc.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract void c(int param0);

    private final void a(boolean param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (dl.field_b) {
              return;
            }
            dl.field_b = true;
          }
          if (ll.field_b != null) {
            ll.field_b.destroy();
          }
          try {
            this.b(param0);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (ie.field_e != null) {
            try {
              ie.field_e.removeFocusListener((java.awt.event.FocusListener) (this));
              ie.field_e.getParent().remove((java.awt.Component) ((Object) ie.field_e));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != rc.field_k) {
            try {
              rc.field_k.a((byte) -84);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.c((byte) 26);
          if (null != hk.field_e) {
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
          throw la.a((Throwable) ((Object) runtimeException), "fc.DA(" + param0 + ',' + param1 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (hk.field_e != null) {
          return null;
        }
        if (null != ll.field_b &&
          this != ll.field_b) {
          return ll.field_b.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hk.field_e != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != ll.field_b &&
            ll.field_b != this) {
            stackIn_10_0 = ll.field_b.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "fc.getDocumentBase()");
        }
    }

    final static java.net.URL a(String param0, java.net.URL param1, String param2, int param3, int param4) {
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
          java.net.URL stackIn_60_0 = null;
          java.net.URL stackIn_62_0 = null;
          RuntimeException stackIn_66_0 = null;
          StringBuilder stackIn_66_1 = null;
          String stackIn_67_2 = null;
          StringBuilder stackIn_70_1 = null;
          String stackIn_71_2 = null;
          StringBuilder stackIn_74_1 = null;
          String stackIn_75_2 = null;
          Throwable decompiledCaughtException = null;
          int var5_int = 0;
          RuntimeException var5 = null;
          String var6 = null;
          int var7 = 0;
          int var8_int = 0;
          StringBuilder var8 = null;
          Exception var9 = null;
          int var10 = 0;
          int var8_intLifetime1;
          int var8_intLifetime2;
          int var8_intLifetime3;
          var10 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            var5_int = -123 / ((-26 - param4) / 60);
            var6 = param1.getFile();
            var7 = 0;
            while (true) {
              if (var6.regionMatches(var7, "/l=", 0, 3)) {
                var8_int = var6.indexOf('/', var7 + 1);
                if (var8_int >= 0) {
                  if (0 > param3) {
                    var7 = var8_int;
                    if (var10 == 0) {
                      continue;
                    }
                  }
                  var6 = var6.substring(0, var7) + var6.substring(var8_int);
                  if (var10 == 0) {
                    continue;
                  }
                }
              }
              if (var6.regionMatches(var7, "/a=", 0, 3)) {
                var8_intLifetime1 = var6.indexOf('/', var7 + 1);
                if (var8_intLifetime1 >= 0) {
                  var7 = var8_intLifetime1;
                  if (var10 == 0) {
                    continue;
                  }
                }
              }
              if (var6.regionMatches(var7, "/p=", 0, 3)) {
                var8_intLifetime2 = var6.indexOf('/', var7 + 1);
                if (var8_intLifetime2 >= 0) {
                  if (null != param0) {
                    var6 = var6.substring(0, var7) + var6.substring(var8_intLifetime2);
                    if (var10 == 0) {
                      continue;
                    }
                  }
                  var7 = var8_intLifetime2;
                  if (var10 == 0) {
                    continue;
                  }
                }
              }
              if (var6.regionMatches(var7, "/s=", 0, 3) ||
                var6.regionMatches(var7, "/c=", 0, 3)) {
                var8_intLifetime3 = var6.indexOf('/', var7 + 1);
                if (var8_intLifetime3 >= 0) {
                  if (null != param2) {
                    var6 = var6.substring(0, var7) + var6.substring(var8_intLifetime3);
                    if (var10 == 0) {
                      continue;
                    }
                  }
                  var7 = var8_intLifetime3;
                  if (var10 == 0) {
                    continue;
                  }
                }
              }
              break;
            }
            var8 = new StringBuilder(var7);
            discarded$0 = var8.append(var6.substring(0, var7));
            if (param3 > 0) {
              discarded$1 = var8.append("/l=");
              discarded$2 = var8.append(Integer.toString(param3));
            }
            if (param0 != null &&
              param0.length() > 0) {
              discarded$3 = var8.append("/p=");
              discarded$4 = var8.append(param0);
            }
            if (null != param2 &&
              param2.length() > 0) {
              discarded$5 = var8.append("/s=");
              discarded$6 = var8.append(param2);
            }
            if (var7 >= var6.length()) {
              discarded$7 = var8.append('/');
              if (var10 != 0) {
                discarded$8 = var8.append(var6.substring(var7, var6.length()));
              }
            } else {
              discarded$8 = var8.append(var6.substring(var7, var6.length()));
            }
            try {
              stackIn_60_0 = new java.net.URL(param1, var8.toString());
              return stackIn_60_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var9 = (Exception) (Object) decompiledCaughtException;
              var9.printStackTrace();
              stackIn_62_0 = (java.net.URL) (param1);
              return stackIn_62_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_66_0 = var5;
            stackIn_66_1 = new StringBuilder().append("fc.LA(");
            if (param0 == null) {
              stackIn_67_2 = "null";
            } else {
              stackIn_67_2 = "{...}";
            }
            stackIn_70_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
            if (param1 == null) {
              stackIn_71_2 = "null";
            } else {
              stackIn_71_2 = "{...}";
            }
            stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
            if (param2 == null) {
              stackIn_75_2 = "null";
            } else {
              stackIn_75_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void d(int param0);

    private final void b(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          var2_long = pf.a(0);
          var4 = dl.field_a[bh.field_f];
          dl.field_a[bh.field_f] = var2_long;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            s.field_T = (32000 + (var6_int >> 1)) / var6_int;
          }
          bh.field_f = bh.field_f + 1 & 31;
          if (param0 != 57) {
            this.run();
          }
          fieldTemp$1 = ud.field_d;
          ud.field_d = ud.field_d + 1;
          if (fieldTemp$1 > 50) {
            gb.field_j = true;
            ud.field_d = ud.field_d - 50;
            ie.field_e.setSize(ub.field_b, lb.field_z);
            ie.field_e.setVisible(true);
            if (hk.field_e != null &&
              b.field_i == null) {
              var6 = hk.field_e.getInsets();
              ie.field_e.setLocation(var6.left + ue.field_D, var6.top + wi.field_c);
              if (MonkeyPuzzle2.field_F) {
                ie.field_e.setLocation(ue.field_D, wi.field_c);
              }
            } else {
              ie.field_e.setLocation(ue.field_D, wi.field_c);
            }
          }
          this.d(-25976);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fc.MA(" + param0 + ')');
        }
    }

    final static void a(mk param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        hb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = gf.field_c;
          var3.b(true, param2);
          var3.field_h = var3.field_h + 1;
          var4 = var3.field_h;
          var3.b(1, -49152);
          if (param1 <= 106) {
            field_j = (te) null;
          }
          if (null != param0.field_g) {
            var3.b(param0.field_g.length, -49152);
            var3.b(param0.field_g, param0.field_g.length, -2, 0);
            if (MonkeyPuzzle2.field_F) {
              var3.b(0, -49152);
            }
          } else {
            var3.b(0, -49152);
          }
          var3.a((byte) -76, var4);
          var3.field_h = var3.field_h - 4;
          param0.field_e = var3.e(126);
          var3.a(-var4 + var3.field_h, (byte) 29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("fc.KA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(mj param0, byte param1, ad param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          ea.field_b = gg.c(param1 - 111) * param3 / 1000;
          if (param1 != 111) {
            field_b = (String) null;
          }
          ed.a(param2, param1 ^ 31);
          nc.a(param2, 2);
          dl.a(param1 ^ 11490, param2);
          cc.b(true);
          cm.a(15);
          uj.field_i = -ea.field_b + 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("fc.IA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void start() {
        if (this != m.field_f ||
          dl.field_b) {
          return;
        }
        try {
          hj.field_db = 0L;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "fc.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = pf.a(0);
          var4 = ve.field_w[fe.field_d];
          ve.field_w[fe.field_d] = var2_long;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            jf.field_g = (32000 + (var6_int >> 1)) / var6_int;
          }
          fe.field_d = 1 + fe.field_d & 31;
          var6 = this;
          synchronized (var6) {
            ke.field_a = hh.field_o;
          }
          if (param0 >= -52) {
            this.a(false);
          }
          this.c(15245);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fc.GA(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("fc.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, byte param6) {
        try {
          md dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          ic var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            try {
              if (param6 != -48) {
                field_g = (te) null;
              }
              if (null != m.field_f) {
                nf.field_N = nf.field_N + 1;
                if (nf.field_N < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a((byte) 75, "alreadyloaded");
                return;
              }
              lb.field_z = param3;
              ih.field_b = param3;
              ub.field_b = param1;
              kk.field_b = param1;
              wi.field_c = 0;
              ue.field_D = 0;
              kd.field_c = param2;
              m.field_f = this;
              ni.field_e = ii.a(false);
              dupTemp$0 = new md(param4, param5, param0, true);
              rc.field_k = dupTemp$0;
              fk.field_c = dupTemp$0;
              var8 = rc.field_k.a((Runnable) (this), 1, 0);
              while (true) {
                if (var8.field_g == 0) {
                  em.a(10L, false);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              kk.a((String) null, (byte) 78, var8_ref);
              this.a((byte) 79, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("fc.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == m.field_f &&
            !dl.field_b) {
            hj.field_db = 4000L + pf.a(0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fc.stop()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ll.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fc.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void a(int param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void c(byte param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public abstract void init();

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (null != ie.field_e) {
            ie.field_e.removeFocusListener((java.awt.event.FocusListener) (this));
            ie.field_e.getParent().setBackground(java.awt.Color.black);
            ie.field_e.getParent().remove((java.awt.Component) ((Object) ie.field_e));
          }
          if (b.field_i == null) {
            if (hk.field_e == null) {
              if (ll.field_b == null) {
                var2 = m.field_f;
                if (var4 != 0) {
                  var2 = ll.field_b;
                  var2 = hk.field_e;
                  var2 = b.field_i;
                }
              } else {
                var2 = ll.field_b;
                if (var4 != 0) {
                  var2 = hk.field_e;
                  var2 = b.field_i;
                }
              }
            } else {
              var2 = hk.field_e;
              if (var4 != 0) {
                var2 = b.field_i;
              }
            }
          } else {
            var2 = b.field_i;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ie.field_e = (java.awt.Canvas) ((Object) new ji((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ie.field_e));
          ie.field_e.setSize(ub.field_b, lb.field_z);
          ie.field_e.setVisible(true);
          if (var2 == hk.field_e) {
            var3 = hk.field_e.getInsets();
            ie.field_e.setLocation(ue.field_D + var3.left, wi.field_c + var3.top);
            if (var4 != 0) {
              ie.field_e.setLocation(ue.field_D, wi.field_c);
            }
          } else {
            ie.field_e.setLocation(ue.field_D, wi.field_c);
          }
          ie.field_e.addFocusListener((java.awt.event.FocusListener) (this));
          ie.field_e.requestFocus();
          ke.field_a = true;
          hh.field_o = true;
          gb.field_j = true;
          aj.field_c = param0;
          ah.field_e = pf.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (var2), "fc.PA(" + param0 + ')');
        }
    }

    final void a(byte param0, String param1) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_l) {
              return;
            }
            if (param0 < 41) {
              field_k = (va) null;
            }
            this.field_l = true;
            System.out.println("error_game_" + param1);
            try {
              mf.a(-26159, "loggedout", ii.a(false));
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
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("fc.OA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected fc() {
        this.field_l = false;
    }

    static {
        field_j = new te(8, 0, 4, 1);
        field_m = "To server list";
        field_g = new te(1, 2, 2, 0);
        field_b = "This password contains your Player Name, and would be easy to guess";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
