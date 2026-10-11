/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class wi extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_c;
    public static boolean field_g;
    public static boolean field_i;
    public static boolean field_h;
    public static boolean field_k;
    public static int field_n;
    public static int field_l;
    public static boolean field_e;
    public static int field_d;
    public static boolean field_j;
    public static int field_m;
    public static int field_a;
    public static boolean field_f;
    public static int field_b;

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != ira.field_c) {
          return null;
        }
        if (null != bkb.field_b &&
          bkb.field_b != this) {
          return bkb.field_b.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == tu.field_a &&
            !mb.field_i) {
            dva.field_p = wt.a(false);
            gdb.b(-65, 5000L);
            vpa.field_b = null;
            this.a(false, 10);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) runtimeException), "wi.destroy()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          bkb.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wi.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ira.field_c != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != bkb.field_b &&
            this != bkb.field_b) {
            stackIn_12_0 = bkb.field_b.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "wi.getAppletContext()");
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = wt.a(false);
          var4 = fm.field_b[ve.field_o];
          fm.field_b[ve.field_o] = var2_long;
          ve.field_o = 31 & ve.field_o + 1;
          if (var4 != 0L &&
            var4 < var2_long) {
          }
          var6 = this;
          synchronized (var6) {
            bsa.field_o = nqa.field_a;
          }
          if (param0 != -83) {
            return;
          }
          this.a(89);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw rta.a((Throwable) ((Object) runtimeException), "wi.AB(" + param0 + ')');
        }
    }

    abstract void b(boolean param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ira.field_c != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (bkb.field_b != null &&
            this != bkb.field_b) {
            stackIn_10_0 = bkb.field_b.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "wi.getDocumentBase()");
        }
    }

    abstract void a(boolean param0);

    final static byte[] a(byte param0, ds param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.field_e;
          var3 = new byte[var2_int];
          if (param0 <= 4) {
            wi.a((byte) -89, (ds) null);
          }
          cua.a(param1.field_h, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("wi.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
          stackIn_5_1 = new StringBuilder().append("wi.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          nqa.field_a = true;
          aob.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wi.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          nqa.field_a = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wi.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    protected wi() {
        this.field_c = false;
    }

    abstract void b(int param0);

    abstract void a(int param0);

    final synchronized void c(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          if (igb.field_a != null) {
            igb.field_a.removeFocusListener((java.awt.event.FocusListener) (this));
            igb.field_a.getParent().setBackground(java.awt.Color.black);
            igb.field_a.getParent().remove((java.awt.Component) ((Object) igb.field_a));
          }
          if (param0 > -53) {
            return;
          }
          if (uf.field_E == null) {
            if (ira.field_c == null) {
              if (null == bkb.field_b) {
                var2 = tu.field_a;
                if (var4 != 0) {
                  var2 = bkb.field_b;
                  var2 = ira.field_c;
                  var2 = uf.field_E;
                }
              } else {
                var2 = bkb.field_b;
                if (var4 != 0) {
                  var2 = ira.field_c;
                  var2 = uf.field_E;
                }
              }
            } else {
              var2 = ira.field_c;
              if (var4 != 0) {
                var2 = uf.field_E;
              }
            }
          } else {
            var2 = uf.field_E;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          igb.field_a = (java.awt.Canvas) ((Object) new pc((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) igb.field_a));
          igb.field_a.setSize(rda.field_p, fua.field_p);
          igb.field_a.setVisible(true);
          if (var2 == ira.field_c) {
            var3 = ira.field_c.getInsets();
            igb.field_a.setLocation(qtb.field_o + var3.left, var3.top + hqb.field_f);
            if (var4 != 0) {
              igb.field_a.setLocation(qtb.field_o, hqb.field_f);
            }
          } else {
            igb.field_a.setLocation(qtb.field_o, hqb.field_f);
          }
          igb.field_a.addFocusListener((java.awt.event.FocusListener) (this));
          igb.field_a.requestFocus();
          bsa.field_o = true;
          nqa.field_a = true;
          aob.field_o = true;
          rda.field_q = false;
          hpb.field_k = wt.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (var2), "wi.DB(" + param0 + ')');
        }
    }

    final void a(String param0, int param1) {
        try {
          Throwable throwable = null;
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.field_c) {
              return;
            }
            this.field_c = true;
            System.out.println("error_game_" + param0);
            try {
              ia.a(vpa.b((byte) -115), "loggedout", param1 ^ 12348);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
            if (param1 != 0) {
              wi.a((byte) -85, (ds) null);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = runtimeException;
            stackIn_16_1 = new StringBuilder().append("wi.VA(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        if (tu.field_a != this ||
          mb.field_i) {
          return;
        }
        try {
          dva.field_p = 0L;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wi.start()");
        }
    }

    private final void c(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        try {
          var2_long = wt.a(false);
          var4 = sga.field_o[bhb.field_f];
          sga.field_o[bhb.field_f] = var2_long;
          if (param0 != -5) {
            this.field_c = false;
          }
          bhb.field_f = bhb.field_f + 1 & 31;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            ffa.field_a = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$1 = ncb.field_b;
          ncb.field_b = ncb.field_b + 1;
          if (50 < fieldTemp$1) {
            aob.field_o = true;
            ncb.field_b = ncb.field_b - 50;
            igb.field_a.setSize(rda.field_p, fua.field_p);
            igb.field_a.setVisible(true);
            if (ira.field_c != null &&
              null == uf.field_E) {
              var6 = ira.field_c.getInsets();
              igb.field_a.setLocation(var6.left + qtb.field_o, hqb.field_f + var6.top);
              if (VoidHunters.field_G != 0) {
                igb.field_a.setLocation(qtb.field_o, hqb.field_f);
              }
            } else {
              igb.field_a.setLocation(qtb.field_o, hqb.field_f);
            }
          }
          this.d(-105);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) runtimeException), "wi.BB(" + param0 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == tu.field_a &&
            !mb.field_i) {
            dva.field_p = 4000L + wt.a(false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) runtimeException), "wi.stop()");
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
          eab dupTemp$0 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var8_int = 0;
          Throwable var8 = null;
          RuntimeException var8_ref = null;
          mob var9 = null;
          int var10 = 0;
          var10 = VoidHunters.field_G;
          try {
            try {
              if (tu.field_a != null) {
                sv.field_e = sv.field_e + 1;
                if (sv.field_e < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", 0);
                return;
              }
              fua.field_p = param6;
              uqa.field_p = param6;
              qtb.field_o = 0;
              hqb.field_f = 0;
              var8_int = -70 / ((-74 - param3) / 41);
              w.field_y = param0;
              rda.field_p = param4;
              lva.field_p = param4;
              tu.field_a = this;
              qv.field_p = vpa.b((byte) -117);
              dupTemp$0 = new eab(param1, param5, param2, true);
              bm.field_o = dupTemp$0;
              vpa.field_b = dupTemp$0;
              var9 = bm.field_o.a(0, 1, (Runnable) (this));
              while (true) {
                if (var9.field_f == 0) {
                  gdb.b(-94, 10L);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = decompiledCaughtException;
              gna.a(var8, (String) null, 0);
              this.a("crash", 0);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var8_ref;
            stackIn_21_1 = new StringBuilder().append("wi.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_78_0 = 0;
          int stackIn_78_1 = 0;
          int stackIn_95_0 = 0;
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
          var5 = VoidHunters.field_G;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (eab.field_w != null) {
                var1 = eab.field_w.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = eab.field_r;
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
                    this.a("wrongjava", 0);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = haa.a(var2.charAt(var3), true);
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_66_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (hwa.a((CharSequence) ((Object) var4), 10) &&
                        !(lob.a(-121, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a("wrongjava", 0);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != eab.field_r))) {
                stackIn_66_0 = eab.field_r.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (eab.field_r.length() > var1_int) {
                    var3 = eab.field_r.charAt(var1_int);
                    stackIn_78_0 = var3;
                    stackIn_78_1 = 48;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_78_0 >= stackIn_78_1 &&
                      var3 <= 57)) {
                      var2_int = var2_int * 10 - 48 + var3;
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_78_0 = ~var2_int;
                    stackIn_78_1 = -6;
                  }
                  if (stackIn_78_0 > stackIn_78_1) {
                    break;
                  }
                  dva.field_o = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = tu.field_a;
                if (null != bkb.field_b) {
                  var1 = bkb.field_b;
                }
                var2_ref = eab.field_q;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                ara.a(27671);
                this.c(-78);
                jl.field_q = qm.a((byte) 3, (java.awt.Component) ((Object) igb.field_a), fua.field_p, rda.field_p);
                this.a(false);
                omb.field_p = mr.g(46);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != dva.field_p) {
                    stackIn_95_0 = $cfr$lcmp(wt.a(false), dva.field_p);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_95_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    dn.field_p = omb.field_p.a(false, asa.field_c);
                    stackIn_95_0 = 0;
                  }
                  var3 = stackIn_95_0;
                  do {
                    if (!(var3 < dn.field_p)) {
                      this.c((byte) -5);
                      ts.a((byte) 61, bm.field_o, igb.field_a);
                      break;
                    }
                    this.a((byte) -83);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              gna.a((Throwable) (var1), (String) null, 0);
              this.a("crash", 0);
            }
            this.a(true, 10);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw rta.a((Throwable) (var1), "wi.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final boolean b(byte param0) {
        return true;
    }

    public abstract void init();

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (this == tu.field_a &&
            !mb.field_i) {
            aob.field_o = true;
            if (dva.field_o &&
              -hpb.field_k + wt.a(false) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < lva.field_p) {
                  return;
                }
                if (var2.height < uqa.field_p) {
                  return;
                }
              }
              rda.field_q = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("wi.paint(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ira.field_c) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != bkb.field_b &&
            this != bkb.field_b) {
            stackIn_8_0 = bkb.field_b.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("wi.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("wi.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void d(int param0);

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (mb.field_i) {
              return;
            }
            mb.field_i = true;
          }
          if (null != bkb.field_b) {
            bkb.field_b.destroy();
          }
          try {
            this.b(-121);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (igb.field_a != null) {
            try {
              igb.field_a.removeFocusListener((java.awt.event.FocusListener) (this));
              igb.field_a.getParent().remove((java.awt.Component) ((Object) igb.field_a));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (bm.field_o != null) {
            try {
              bm.field_o.b(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (param1 != 10) {
            this.field_c = true;
          }
          this.b(false);
          if (null != ira.field_c) {
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
          throw rta.a((Throwable) ((Object) runtimeException), "wi.EB(" + param0 + ',' + param1 + ')');
        }
    }

    static {
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
