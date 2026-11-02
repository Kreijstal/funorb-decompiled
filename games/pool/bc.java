/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static String errorJs5connect;
    static int keycodeDefaultLeft1;
    static String menuOptionEndTutorial;
    static String timeTrialCompleted;
    static PacketBuffer field_b;
    static String notyetachieved;
    static String playerListMiddle;
    static int[] field_c;
    static boolean[] field_j;
    static String[] subscriptionCostMonthly;

    public static void a(byte param0) {
        playerListMiddle = null;
        field_j = null;
        if (param0 != -8) {
          return;
        }
        menuOptionEndTutorial = null;
        field_c = null;
        subscriptionCostMonthly = null;
        field_b = null;
        notyetachieved = null;
        errorJs5connect = null;
        timeTrialCompleted = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 != 13776) {
          return 91;
        }
        param1 = param2 - param1;
        return param0 - param0 * (param1 * (param1 * param1)) / param2 / param2 / param2;
    }

    final static void b(byte param0) {
        int[] var10 = null;
        int[] var7 = null;
        int[] var6 = null;
        int[] var12 = null;
        int[] var9 = null;
        int[] var2 = null;
        int[] var11 = null;
        int[] var8 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = Pool.field_O;
        try {
          var10 = FreePlayRules.field_e.field_U[0];
          var7 = var10;
          var6 = var7;
          int[] var1 = var6;
          FreePlayRules.field_e.field_U = new int[5][];
          FreePlayRules.field_e.field_U[0] = var10;
          var12 = new int[var10.length];
          var9 = var12;
          var2 = var9;
          var11 = new int[var10.length];
          var8 = var11;
          var3 = var8;
          if (param0 != 17) {
            field_b = (PacketBuffer) null;
          }
          for (var4 = 0; var4 < var10.length; var4++) {
            var11[var4] = var4;
            var2[var4] = var10[var4];
          }
          StrongCacheEntry.a(var12, var11, (byte) -54);
          FreePlayRules.field_e.field_U[2] = dn.a(var3, (byte) 36, ta.a(new int[]{0, 10066329, var12.length, 15658734}, param0 + 11));
          FreePlayRules.field_e.field_U[1] = dn.a(var3, (byte) 94, ta.a(new int[]{0, 13421772, var12.length, 16777215}, param0 - 14));
          FreePlayRules.field_e.field_U[4] = dn.a(var3, (byte) 53, ta.a(new int[]{0, 16744192, var12.length, 16777087}, -120));
          FreePlayRules.field_e.field_U[3] = dn.a(var3, (byte) 45, ta.a(new int[]{0, 16772864, var12.length, 16756543}, -128));
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "bc.A(" + param0 + ')');
        }
    }

    static {
        errorJs5connect = "Unable to connect to the data server. Please check any firewall you are using.";
        keycodeDefaultLeft1 = 48;
        timeTrialCompleted = "Time trial completed!";
        menuOptionEndTutorial = "End tutorial";
        field_b = new PacketBuffer(256);
        notyetachieved = "Not yet achieved";
        subscriptionCostMonthly = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        playerListMiddle = ", <%0>";
    }
}
