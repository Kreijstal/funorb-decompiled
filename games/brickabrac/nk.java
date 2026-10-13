/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static String field_e;
    static String field_d;
    static String field_f;
    static String field_i;
    static UiComponent field_a;
    static RgbSprite field_h;
    static String field_b;
    static UiComponent field_g;
    static RgbSprite field_c;

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (oh.field_b == sm.field_b) {
          fieldTemp$0 = CachedArchiveSource.field_p;
          CachedArchiveSource.field_p = CachedArchiveSource.field_p + 1;
          if (fieldTemp$0 >= 16) {
            if (ln.field_k) {
              vb.k(0);
            } else {
              ok.a(0);
            }
            sm.field_b = RasterSnapshot.field_q;
          }
          if (param0 >= 20) {
            return;
          }
          field_c = (RgbSprite) null;
          return;
        }
        if (sm.field_b == RasterSnapshot.field_q) {
          if (!og.h(-26090)) {
            if (VerticalScrollbar.field_Ub != null) {
              bd.submitTableRow(3, (byte) 25, VerticalScrollbar.field_Ub);
            }
            DualLinkIterator.b((byte) 117);
            if (wi.field_g) {
              wi.field_g = false;
              cp.a(false, 21543);
            }
          }
          sm.field_b = NodeDeque.field_d;
          if (param0 >= 20) {
            return;
          }
          field_c = (RgbSprite) null;
          return;
        }
        if (NodeDeque.field_d != sm.field_b) {
          if (param0 >= 20) {
            return;
          }
          field_c = (RgbSprite) null;
          return;
        }
        fieldTemp$1 = CachedArchiveSource.field_p;
        CachedArchiveSource.field_p = CachedArchiveSource.field_p - 1;
        if (fieldTemp$1 <= 0) {
          sm.field_b = sm.field_a;
        }
        if (param0 >= 20) {
          return;
        }
        field_c = (RgbSprite) null;
        return;
    }

    final static int a(int param0, int param1) {
        if (param1 != 30922) {
          return -40;
        }
        if (param0 >= 0) {
          if (param0 > 65536) {
            return -IntrusiveHashTable.field_d[134217728 / param0] + 2048;
          }
          return IntrusiveHashTable.field_d[param0 >> 5];
        }
        if (param0 >= -65536) {
          return -IntrusiveHashTable.field_d[-param0 >> 5];
        }
        return -2048 + IntrusiveHashTable.field_d[134217728 / -param0];
    }

    final static void a(byte param0, boolean param1) {
        if (DualLinkDeque.a(-4858)) {
          param1 = false;
        }
        ga.a(param1, -124);
        if (param0 == -25) {
          BufferedSocket.a(21862);
          return;
        }
        java.applet.Applet var3 = (java.applet.Applet) null;
        nk.a(-89, (java.applet.Applet) null);
        BufferedSocket.a(21862);
    }

    public static void a(byte param0) {
        field_h = null;
        field_f = null;
        field_a = null;
        if (param0 == 121) {
          field_e = null;
          field_g = null;
          field_c = null;
          field_b = null;
          field_i = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(char param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!m.a(true, param0)) {
            return false;
          }
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (12 <= var3_int) {
            return false;
          }
          if (param2) {
            field_e = (String) null;
          }
          if (!ik.a((byte) -9, param0)) {
            return true;
          }
          if (0 != var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("nk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != 2048) {
                field_b = (String) null;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(hg.a(param1, var2, -1), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("nk.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -66 / ((-63 - param1) / 43);
          stackIn_1_0 = HighscorePackSelector.field_c.takeFileByName(124, "", param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("nk.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Suggest muting this player";
        field_f = "Sweet!";
        field_d = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = "Status";
        field_i = "Macroing or use of bots";
    }
}
