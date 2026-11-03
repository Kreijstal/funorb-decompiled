/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BallEvent {
    byte eventKind;
    byte ballIndex;
    BallEvent field_d;
    static int field_b;
    static int field_l;
    boolean field_c;
    BallEvent field_f;
    private byte targetIndex;
    static String searchingForOpponentSingular;
    BallEvent field_i;
    static String inviteAcceptXsGame;
    static int field_a;
    static int field_h;
    static String[] nineBallNumbers;

    public static void releaseStatics(boolean param0) {
        inviteAcceptXsGame = null;
        if (param0) {
          return;
        }
        nineBallNumbers = null;
        searchingForOpponentSingular = null;
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -19261) {
            searchingForOpponentSingular = (String) null;
          }
          if (param0 == null) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          if (!(param0 instanceof byte[])) {
            if (!(param0 instanceof ByteStorage)) {
              throw new IllegalArgumentException();
            }
            var4 = (ByteStorage) (param0);
            stackIn_13_0 = var4.toByteArray(33);
            return stackIn_13_0;
          }
          var3 = (byte[]) (param0);
          if (param2) {
            stackIn_10_0 = jj.a(var3, (byte) 91);
            return stackIn_10_0;
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("or.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final String describe(byte param0) {
        if (param0 < 108) {
          return (String) null;
        }
        int var2 = this.eventKind;
        if (var2 == 0) {
          return "unresolved";
        }
        if (var2 != 1) {
          if (2 == var2) {
            return "ball " + this.targetIndex;
          }
          if (var2 == 3) {
            return "wall " + this.targetIndex;
          }
          if (var2 == 4) {
            return "point " + this.targetIndex;
          }
          if (var2 != 5) {
            return "invalid";
          }
          return "pocket " + this.targetIndex;
        }
        return "stop";
    }

    final void a(boolean param0, Ball param1) {
        try {
          this.eventKind = (byte) 1;
          if (param0) {
            inviteAcceptXsGame = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "or.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, Ball param2) {
        this.eventKind = (byte) 3;
        this.targetIndex = (byte)param0;
        this.field_i = new BallEvent((int) this.ballIndex, this);
        if (param1 != -26401) {
          return;
        }
        try {
          param2.field_q = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "or.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(Ball[] param0, int param1, int param2) {
        Ball var6 = param0[param1];
        Ball var4 = var6;
        Ball var5 = param0[this.ballIndex];
        this.field_i = new BallEvent((int) this.ballIndex, this);
        if (param2 != -5) {
          return;
        }
        try {
          this.field_d = new BallEvent(param1, this);
          this.targetIndex = (byte)param1;
          this.eventKind = (byte) 2;
          if (var6.field_q != null &&
            var6.field_q.eventKind == 0) {
            var6.field_q.targetIndex = this.ballIndex;
            var6.field_q.eventKind = (byte) 2;
            var6.field_q.field_d = this.field_i;
          }
          var5.field_q = this.field_i;
          var4.field_q = this.field_d;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "or.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(Ball param0, int param1, byte param2) {
        this.targetIndex = (byte)param1;
        this.eventKind = (byte) 4;
        this.field_i = new BallEvent((int) this.ballIndex, this);
        if (param2 != 5) {
          return;
        }
        try {
          param0.field_q = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "or.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            field_a = 37;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_3_0 = oj.field_y.equals(TutorialController.normalizeDisplayName(73, var3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("or.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int countEvents(byte param0) {
        int var2 = 0 != this.ballIndex ? 1 : 0;
        if (this.field_i != null) {
          var2 = var2 + this.field_i.countEvents((byte) 2);
        }
        if (this.field_d != null) {
          var2 = var2 + this.field_d.countEvents((byte) 2);
        }
        if (param0 == 2) {
          return var2;
        }
        BallEvent.releaseStatics(true);
        return var2;
    }

    final boolean a(int param0, CushionSegment[] param1) {
        CushionSegment var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != -5877) {
            this.countEvents((byte) -36);
          }
          if (3 != this.eventKind) {
            if (this.eventKind == 4) {
              return true;
            }
            return false;
          }
          var3 = param1[this.targetIndex];
          stackIn_8_0 = (1 == var3.startKind) || (var3.endKind == 1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("or.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        String var2 = null;
        if (null != nl.field_d) {
          var2 = nl.field_d;
          String var1 = var2;
          pn.a((byte) 75, AccountWelcomePanel.substituteTemplateArguments(new String[]{var2}, -1, lf.youHaveBeenRemovedFromXsGame));
          nl.field_d = null;
        }
        if (param0 == 4) {
          return;
        }
        inviteAcceptXsGame = (String) null;
    }

    final void a(int param0, Ball param1, int param2) {
        try {
          if (param0 != 23655) {
            Ball var5 = (Ball) null;
            this.a((Ball) null, 49, (byte) -122);
          }
          this.eventKind = (byte) 5;
          this.targetIndex = (byte)param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "or.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    BallEvent(int param0, BallEvent param1) {
        this.field_d = null;
        this.field_c = false;
        this.eventKind = (byte) 0;
        this.targetIndex = (byte) 0;
        this.field_i = null;
        try {
          this.ballIndex = (byte)param0;
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "or.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        inviteAcceptXsGame = "Accept invitation to <%0>'s game";
        searchingForOpponentSingular = "Searching for an opponent";
        nineBallNumbers = new String[]{"<col=ffffff>Cue ball</col>", "<col=ffff99>1 One</col>", "<col=9999ff>2 Two</col>", "<col=ff9999>3 Three</col>", "<col=cc99ff>4 Four</col>", "<col=ffcc99>5 Five</col>", "<col=99ff99>6 Six</col>", "<col=cc9966>7 Seven</col>", "<col=999999>8 Eight</col>", "<col=ffff99>9 Nine!</col>"};
    }
}
