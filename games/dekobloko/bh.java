/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bh {
    static String field_h;
    static String field_c;
    static ck[][] field_d;
    static String field_j;
    static String field_f;
    bh field_a;
    bh field_b;
    static int field_m;
    static String[] field_e;
    static int field_g;
    long field_i;
    static um field_l;
    static int field_k;

    final boolean a(byte param0) {
        if (param0 > 34) {
          return this.field_a != null ? true : false;
        }
        field_l = (um) null;
        if (this.field_a == null) {
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1) {
        Object var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          if (param1 > -116) {
            return;
          }
          var2 = (fa) (sa.field_C.c((byte) -114));
          do {
            if (var2 == null) {
              var2 = c.field_r.c((byte) 99);
              break;
            }
            w.a(124, param0, (fa) (var2));
            var2 = (fa) (sa.field_C.d(true));
          } while (var3 == 0);
          while (true) {
            if (var2 == null) {
              return;
            }
            ad.a(-1, param0);
            var2 = c.field_r.d(true);
            if (var3 != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (var2), "bh.CB(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        if (this.field_a == null) {
          return;
        }
        this.field_a.field_b = this.field_b;
        this.field_b.field_a = this.field_a;
        if (param0 >= 100) {
          this.field_a = null;
          this.field_b = null;
          return;
        }
        field_k = -105;
        this.field_a = null;
        this.field_b = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 > -98) {
                var3 = (java.applet.Applet) null;
                bh.a(-55, (java.applet.Applet) null);
              }
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(gn.a(var2, -1, param1), "_top");
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
            stackIn_8_1 = new StringBuilder().append("bh.VA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_d = (ck[][]) null;
        field_c = null;
        field_h = null;
        if (param0 == 25189) {
          field_l = null;
          field_e = null;
          field_j = null;
          field_f = null;
          return;
        }
        bh.b(-88);
        field_l = null;
        field_e = null;
        field_j = null;
        field_f = null;
    }

    final static int a(int param0, boolean param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_h = (String) null;
          }
          stackIn_3_0 = s.a(true, 4, param0, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bh.BB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        var5 = client.field_A ? 1 : 0;
        if (param0 != 0) {
          field_k = -96;
        }
        var4 = param1.indexOf(param3);
        while (true) {
          if (var4 == -1) {
            return param1;
          }
          param1 = param1.substring(0, var4) + param2 + param1.substring(param3.length() + var4);
          stackIn_8_0 = (String) (param1);
          if (var5 != 0) {
            return stackIn_8_0;
          }
          var4 = ((String) (Object) stackIn_8_0).indexOf(param3, param2.length() + var4);
        }
    }

    static {
        field_h = "This is <%0>'s RuneScape clan if they have one.";
        field_j = "RuneScape clan";
        field_d = new ck[8][];
        field_f = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_e = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_g = 0;
        field_c = "You can ask to join this game";
        field_k = -1;
        field_l = new um();
    }
}
